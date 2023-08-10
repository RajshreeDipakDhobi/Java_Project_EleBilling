
package electricity.billing.system;


import java.awt.Choice;
import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class CustomerDetails extends JFrame implements ActionListener
{
    Choice meternumber,cmonth;
    JTable table;
    JButton search,print;
   CustomerDetails()
   {
       super("Customer Details");
       
       setSize(1200,600);
       setLocation(150,100);
       
       
      table = new JTable();
      try
      {
         Conn c = new Conn();
         ResultSet rs = c.s.executeQuery("select * from customers");
         
         table.setModel(DbUtils.resultSetToTableModel(rs));
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      
      JScrollPane sp = new JScrollPane(table);
      add(sp);
       
      print = new JButton("Print");
      print.addActionListener(this);
      add(print,"South");
      
      
       setVisible(true);
   }
    
     public void actionPerformed(ActionEvent ae)
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
     
    
    public static void main(String[] args) 
    {
        new CustomerDetails();
    }
}
