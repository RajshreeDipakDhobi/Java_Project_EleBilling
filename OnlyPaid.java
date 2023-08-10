
package electricity.billing.system;

import java.awt.Choice;
import java.awt.Color;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;


public class OnlyPaid extends JFrame implements ActionListener
{
    Choice meternumber,cmonth;
    JTable table;
    JButton search,print,cancel;
   OnlyPaid()
   {
       super("Only Paid Customer");
       
       setSize(700,600);
       setLocation(300,100);
       
       setLayout(null);
       getContentPane().setBackground(Color.white);
       
       JLabel lblmeternumber = new JLabel("Search By Meter Number");
       lblmeternumber.setBounds(20, 20, 150, 20);
       add(lblmeternumber);
       
       meternumber = new Choice();
       meternumber.setBounds(180, 20, 150, 20);
       add(meternumber);
       
       try
       {
          Conn c = new Conn();
          ResultSet rs = c.s.executeQuery("select * from customers");
          while(rs.next())
          {
              meternumber.add(rs.getString("meter_no"));
          }
       }
       catch(Exception e)
       {
           e.printStackTrace();
       }
       
       JLabel lblmonth = new JLabel("Search By Month");
       lblmonth.setBounds(400, 20, 100, 20);
       add(lblmonth);
       
      cmonth = new Choice();
      cmonth.setBounds(520, 20, 150, 20);
      cmonth.add("January");
      cmonth.add("February");
      cmonth.add("March");
      cmonth.add("April");
      cmonth.add("May");
      cmonth.add("June");
      cmonth.add("July");
      cmonth.add("August");
      cmonth.add("September");
      cmonth.add("Octomber");
      cmonth.add("November");
      cmonth.add("December");
      add(cmonth);
      
      table = new JTable();
      try
      {
         Conn c = new Conn();
         ResultSet rs = c.s.executeQuery("select * from billcal where status = 'Paid'");
         
         table.setModel(DbUtils.resultSetToTableModel(rs));
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      
      JScrollPane sp = new JScrollPane(table);
      sp.setBounds(0, 100, 700, 600);
      add(sp);
       
      
      search = new JButton("Search");
      search.setBounds(20, 70, 80, 20);
      search.addActionListener(this);
      add(search);
      
      print = new JButton("Print");
      print.setBounds(120, 70, 80, 20);
      print.addActionListener(this);
      add(print);
      
      cancel = new JButton("Cancel");
      cancel.setBounds(230, 70, 80, 20);
      cancel.addActionListener(this);
      add(cancel);
      
       setVisible(true);
   }
    
     public void actionPerformed(ActionEvent ae)
     {
       if(ae.getSource() == search) 
       {
          String query = "select * from billcal where meter_no = '"+meternumber.getSelectedItem()+"' and month = '"+cmonth.getSelectedItem()+"'"; 
          try
          {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            table.setModel(DbUtils.resultSetToTableModel(rs));
          }
          catch(Exception e)
          {
              e.printStackTrace();
          }
       }
       else if(ae.getSource() == print)
       {
           try
           {
               table.print();
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
       }
       else
       {
           setVisible(false);
           //new Report();
       }
     }
     public static void main(String[] args) {
        new OnlyPaid();
    }
}
