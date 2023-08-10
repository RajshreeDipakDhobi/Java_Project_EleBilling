
package electricity.billing.system;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;


public class Report extends JFrame implements ActionListener
{
    JLabel l1,l2,l3;
    JTextArea area;
    JButton paid,notpaid;
    Report()
    {
        
       super("Generating Report");
       setSize(700,400);
       setLocation(300,100);
       Container c = this.getContentPane();
       c.setLayout(new GridLayout());
       c.setBackground(Color.gray);
      
       l1 = new JLabel("GENERATING REPORT");
       l1.setFont(new Font("Ariel",Font.BOLD,20));
       l1.setForeground(Color.white);
       c.add(l1);
       
//       l2 = new JLabel("PAID BILLS");
//       l2.setFont(new Font("Tahoma",Font.BOLD,20));
//       l2.setForeground(Color.white);
//       add(l2);
       
      paid = new JButton("PAID CUSTOMERS");
      paid.setBounds(600, 700, 150, 20);
      paid.addActionListener(this);
      add(paid);

      notpaid = new JButton("UNPAID CUSTOMERS");
      notpaid.setBounds(350, 400, 150, 20);
      notpaid.addActionListener(this);
      add(notpaid);

                 
       setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
       if(ae.getSource() == paid)
       {
           new OnlyPaid();
       }
       else
       {
           new OnlyNotpaid();
       }
    }
    public static void main(String[] args) 
    {
        new Report();
    }
}
