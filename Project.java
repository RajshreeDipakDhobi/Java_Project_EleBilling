
package electricity.billing.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Project extends JFrame implements ActionListener
{
    String atype , meter;
    Project(String atype,String meter)
   {
       this.atype = atype;
       this.meter = meter;
       setExtendedState(JFrame.MAXIMIZED_BOTH);
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/homepage.jpg"));
       Image i2 = i1.getImage().getScaledInstance(1550, 850,Image.SCALE_DEFAULT);
       ImageIcon i3 = new ImageIcon(i2);
       JLabel image = new JLabel(i3);
       add(image);
       
       
       JMenuBar mb = new JMenuBar();
       setJMenuBar(mb);
       mb.setBackground(Color.LIGHT_GRAY);
       
       JMenu master = new JMenu("Master");
       master.setForeground(Color.red);
       //master.setFont(new Font("monospaced",Font.BOLD,18));
       //mb.add(master);
       
       JMenuItem newcustomer = new JMenuItem("New Customer");
       newcustomer.setFont(new Font("monospaced",Font.PLAIN,12));
       newcustomer.setBackground(Color.white);
       ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon1.png"));
       Image image1 = icon1.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       newcustomer.setIcon(new ImageIcon(image1));
       newcustomer.setMnemonic('N');
       newcustomer.addActionListener(this);
       newcustomer.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
       master.add(newcustomer);
       
       JMenuItem customerdetails = new JMenuItem("Customer Details");
       customerdetails.setFont(new Font("monospaced",Font.PLAIN,12));
       customerdetails.setBackground(Color.white);
       ImageIcon icon2 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon2.png"));
       Image image2 = icon2.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       customerdetails.setIcon(new ImageIcon(image2));
       customerdetails.setMnemonic('M');
       customerdetails.addActionListener(this);
       customerdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M,ActionEvent.CTRL_MASK));
       master.add(customerdetails);
       
       JMenuItem depositdeatails = new JMenuItem("Deposit Detalis");
       depositdeatails.setFont(new Font("monospaced",Font.PLAIN,12));
       depositdeatails.setBackground(Color.white);
       ImageIcon icon3 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon3.png"));
       Image image3 = icon3.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       depositdeatails.setIcon(new ImageIcon(image3));
       depositdeatails.setMnemonic('D');
       depositdeatails.addActionListener(this);
       depositdeatails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
       master.add(depositdeatails);
       
       JMenuItem generatereport = new JMenuItem("Generate Report");
       generatereport.setFont(new Font("monospaced",Font.PLAIN,12));
       generatereport.setBackground(Color.white);
       ImageIcon icon13 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon3.png"));
       Image image13 = icon13.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       generatereport.setIcon(new ImageIcon(image3));
       generatereport.setMnemonic('R');
       generatereport.addActionListener(this);
       generatereport.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,ActionEvent.CTRL_MASK));
       master.add(generatereport);
       
       JMenuItem calculatebill = new JMenuItem("Calculate Bill");
       calculatebill.setFont(new Font("monospaced",Font.PLAIN,12));
       calculatebill.setBackground(Color.white);
       ImageIcon icon4 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon5.png"));
       Image image4 = icon4.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       calculatebill.setIcon(new ImageIcon(image4));
       calculatebill.setMnemonic('B');
       calculatebill.addActionListener(this);
       calculatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
       master.add(calculatebill);

      
       JMenu info = new JMenu("Information");
       info.setForeground(Color.red);
       //mb.add(info);
       
       JMenuItem updateinformation = new JMenuItem("Update Information");
       updateinformation.setFont(new Font("monospaced",Font.PLAIN,12));
       updateinformation.setBackground(Color.white);
       ImageIcon icon5 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon4.png"));
       Image image5 = icon5.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       updateinformation.setIcon(new ImageIcon(image5));
       updateinformation.setMnemonic('U');
       updateinformation.addActionListener(this);
       updateinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_U,ActionEvent.CTRL_MASK));
       info.add(updateinformation);
       
       
       JMenuItem viewinformation = new JMenuItem("View Information");
       viewinformation.setFont(new Font("monospaced",Font.PLAIN,12));
       viewinformation.setBackground(Color.white);
       ImageIcon icon6 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon6.png"));
       Image image6 = icon6.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       viewinformation.setIcon(new ImageIcon(image6));
       viewinformation.setMnemonic('W');
       viewinformation.addActionListener(this);
       viewinformation.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
       info.add(viewinformation);


       JMenu user = new JMenu("User");
       user.setForeground(Color.blue);
       //mb.add(user);
       
       JMenuItem paybill = new JMenuItem("Pay Bill");
       paybill.setFont(new Font("monospaced",Font.PLAIN,12));
       paybill.setBackground(Color.white);
       ImageIcon icon7 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon4.png"));
       Image image7 = icon7.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       paybill.setIcon(new ImageIcon(image7));
       paybill.setMnemonic('P');
       paybill.addActionListener(this);
       paybill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P,ActionEvent.CTRL_MASK));
       user.add(paybill);

       JMenuItem billdetails = new JMenuItem("Bill Details");
       billdetails.setFont(new Font("monospaced",Font.PLAIN,12));
       billdetails.setBackground(Color.white);
       ImageIcon icon8 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon6.png"));
       Image image8 = icon8.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       billdetails.setIcon(new ImageIcon(image8));
       billdetails.setMnemonic('B');
       billdetails.addActionListener(this);
       billdetails.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
       user.add(billdetails);

       
       JMenu report = new JMenu("Report");
       report.setForeground(Color.red);
       //mb.add(report);
       
       JMenuItem generatebill = new JMenuItem("Generate Bill");
       generatebill.setFont(new Font("monospaced",Font.PLAIN,12));
       generatebill.setBackground(Color.white);
       ImageIcon icon9 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon7.png"));
       Image image9 = icon9.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       generatebill.setIcon(new ImageIcon(image9));
       generatebill.setMnemonic('G');
       generatebill.addActionListener(this);
       generatebill.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G,ActionEvent.CTRL_MASK));
       report.add(generatebill);

       
       JMenu utility = new JMenu("Utility");
       utility.setForeground(Color.blue);
       //mb.add(utility);
       
       JMenuItem notepad = new JMenuItem("Notepad");
       notepad.setFont(new Font("monospaced",Font.PLAIN,12));
       notepad.setBackground(Color.white);
       ImageIcon icon10 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon12.png"));
       Image image10 = icon10.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       notepad.setIcon(new ImageIcon(image10));
       notepad.setMnemonic('N');
       notepad.addActionListener(this);
       notepad.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
       utility.add(notepad);
       
       
       JMenuItem calculator = new JMenuItem("Calculator");
       calculator.setFont(new Font("monospaced",Font.PLAIN,12));
       calculator.setBackground(Color.white);
       ImageIcon icon11 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon9.png"));
       Image image11 = icon11.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       calculator.setIcon(new ImageIcon(image11));
       calculator.setMnemonic('C');
       calculator.addActionListener(this);
       calculator.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C,ActionEvent.CTRL_MASK));
       utility.add(calculator);

       
       JMenu mexit = new JMenu("Exit");
       mexit.setForeground(Color.red);
       //mb.add(mexit);
       
       JMenuItem exit = new JMenuItem("Exit");
       exit.setFont(new Font("monospaced",Font.PLAIN,12));
       exit.setBackground(Color.white);
       ImageIcon icon12 = new ImageIcon(ClassLoader.getSystemResource("electricity icon/icon11.png"));
       Image image12 = icon12.getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT);
       exit.setIcon(new ImageIcon(image12));
       exit.setMnemonic('W');
       exit.addActionListener(this);
       exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W,ActionEvent.CTRL_MASK));
       mexit.add(exit);
       
       if(atype.equals("Admin"))
       {
        mb.add(master);
       }
       else
       {
        mb.add(info);
        mb.add(user);
        mb.add(report);
       }
       
       mb.add(utility);
       mb.add(mexit);


       
       
       setLayout(new FlowLayout());
       
       
      setVisible(true); 
   }
    
   public void actionPerformed(ActionEvent ae)
   {
       String msg = ae.getActionCommand();
       
       if(msg.equals("New Customer"))
       {
           new NewCustomer();
       }
       else if(msg.equals("Customer Details"))
        {
           new CustomerDetails();    
        }
       else if(msg.equals("Deposit Detalis"))
       {
           new DepositeDetails();
       }
       else if(msg.equals("Generate Report"))
       {
           new Report();
       }
        else if(msg.equals("Calculate Bill"))
       {
          new CalculateBill(); 
       }
        else if(msg.equals("View Information"))
        {
            new ViewInformation(meter);
        }
       else if(msg.equals("Update Information"))
        {
            new UpdateInfomation(meter);
        }
       else if(msg.equals("Bill Details"))
        {
            new BillDetails(meter);
        }
       else if(msg.equals("Notepad"))
        {
            try
            {
                Runtime.getRuntime().exec("notepad.exe");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
       else if(msg.equals("Calculator"))
        {
            try
            {
                Runtime.getRuntime().exec("calc.exe");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
       else if(msg.equals("Exit"))
        {
           setVisible(false);
           new Login();
        }
       else if(msg.equals("Pay Bill"))
        {
           new PayBill(meter);
        }
       else if(msg.equals("Generate Bill"))
        {
           new GenerateBill(meter);
        }
   }
    
    public static void main(String[] args) 
    {
      new Project("","");  
    }
            
}
