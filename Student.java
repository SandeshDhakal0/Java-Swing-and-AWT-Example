
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

public class Student implements ActionListener{
         JFrame f;
         JPanel panel;
         JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
         JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
         JTextArea a1,a2,a3;
         JButton b1,b2,b3,b4,b5,b6;
         JMenuBar menubar;
         JMenu menu,help;
         JMenuItem i1,i2,i3;
         
         
         public Student(){
             
         menubar=new JMenuBar();
         menu=new JMenu("Menu");
         help=new JMenu("Help");

         i1=new JMenuItem("New");
         i2=new JMenuItem("Save");
         i3=new JMenuItem("Exit");
         
         i1.addActionListener(this);
         i2.addActionListener(this);
         i3.addActionListener(this);
         
         menu.add(i1);menu.add(i2);menu.add(i3);
         menubar.add(menu);menubar.add(help);
         
         f = new JFrame("Form1");
         panel = new JPanel();
         panel.setBounds(800,400,400,400);
         
         //Adding label to the form
         
         l1=new JLabel("Student ID");
         l1.setBounds(10,10,100,30);
         l2=new JLabel("School Year");
         l2.setBounds(550,10,100,30);
         l3=new JLabel("First Name");
         l3.setBounds(10,40,100,30);
         l4=new JLabel("Last Name");
         l4.setBounds(275,40,100,30);
         l5=new JLabel("Middle Name");
         l5.setBounds(550,40,100,30);
         l6=new JLabel("Address");
         l6.setBounds(10,70,100,30);
         l7=new JLabel("Date of Birth");
         l7.setBounds(275,70,100,30);
         l8=new JLabel("Place of Birth");
         l8.setBounds(550,70,100,30);
         l9=new JLabel("Age");
         l9.setBounds(10,135,100,30);
         l10=new JLabel("Gender");
         l10.setBounds(275,135,100,30);
         l11= new JLabel("Status");
         l11.setBounds(550,135,100,30);
         l12=new JLabel("Year");
         l12.setBounds(10,170,100,30);
         l13=new JLabel("Guardian");
         l13.setBounds(275,170,100,30);
         l14=new JLabel("Relation");
         l14.setBounds(550,170,100,30);
         l15=new JLabel("Address");
         l15.setBounds(10,200,100,30);
         l16=new JLabel("Contact");
         l16.setBounds(500,200,100,30);
        
        
         
         //adding TextField to the form
         
         t1=new JTextField();
         t1.setBounds(92,14,160,30);  //Student Id
         t2=new JTextField();
         t2.setBounds(632,14,160,30); 
         t3=new JTextField();
         t3.setBounds(357,44,160,30); //Lastname
         t4=new JTextField();
         t4.setBounds(632,44,160,30);
         t5=new JTextField();
         t5.setBounds(92,44,160,30);
         t6=new JTextField();
         t6.setBounds(357,80,160,30);
         t7=new JTextField();          //age
         t7.setBounds(92,135,160,30);
         t8=new JTextField(); 
         t8.setBounds(357,170,160,30); //guardian
         t9=new JTextField();
         t9.setBounds(632,170,160,30); //Relation
         t10=new JTextField();
         t10.setBounds(570,205,225,30); //Contact
         
         //adding combo to status 
         String Status[]={"Single","Married","Seperated"};
         JComboBox cb=new JComboBox(Status);
         cb.setBounds(632,135,160,30);
         //adding combo for Year
         String Year[]={"1st","2nd","3rd"};
         JComboBox yy=new JComboBox(Year);
         yy.setBounds(92,170,100,30);
         f.add(cb);f.add(yy);
         
         //adding textarea for address
         a1=new JTextArea();
         a1.setBounds(92,80,160,50);
         a2=new JTextArea();
         a2.setBounds(632,80,160,50);
         a3=new JTextArea();
         a3.setBounds(95,205,370,50);
         
         //adding a radio for gender
         JRadioButton r1=new JRadioButton("Male");
         JRadioButton r2=new JRadioButton("Female");
         r1.setBounds(357,135,100,30);
         r2.setBounds(410,135,100,30);
         ButtonGroup bg=new ButtonGroup();
         bg.add(r1);bg.add(r2);
         
         //adding buttons to the form
         
         b1=new JButton("New");
         b1.setBounds(550,300,100,30);
         b2=new JButton("Save");
         b2.setBounds(650,300,100,30);
         b3=new JButton(new ImageIcon("/Users/sandeshdhakal/Student Registration Form/right.png"));
         b3.setBounds(200,300,44,44);
         b4=new JButton(new ImageIcon("/Users/sandeshdhakal/Student Registration Form/left.png"));
         b4.setBounds(50,300,44,44);
         b5=new JButton(new ImageIcon("/Users/sandeshdhakal/Student Registration Form/navigate_left.png"));
         b5.setBounds(100,300,44,44);
         b6=new JButton(new ImageIcon("/Users/sandeshdhakal/Student Registration Form/navigate_right.png"));
         b6.setBounds(150,300,44,44); 
         
         b1.addActionListener(this);
         b2.addActionListener(this);
         
         
         
         f.setJMenuBar(menubar);
         
         f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);f.add(b6);
         
         f.add(r1);f.add(r2);
         
         f.add(a1);f.add(a2);f.add(a3);
         
         //adding the Textfield
         f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);f.add(t6);f.add(t7);f.add(t8);f.add(t9);f.add(t10);
         //adding the label
         f.add(l1);f.add(l2);
         f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l10);
         f.add(l11);f.add(l12);f.add(l13);f.add(l14);f.add(l15);f.add(l16);
         //adding panel
         f.add(panel);
         
         
         f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
         f.setSize(800,400);
         f.setLayout(null);
         f.setVisible(true);
            
     }
    
     public void actionPerformed (ActionEvent e){
         if (e.getSource() == b1 || e.getSource() == i1){
         
         t1.setText("");
         t2.setText("");
         t3.setText("");
         t4.setText("");
         t5.setText("");
         t6.setText("");
         t7.setText("");
         t8.setText("");
         t9.setText("");
         t10.setText(""); 
     }
     else if(e.getSource() == b2 || e.getSource() == i2){
         String message = "The operation is saved.";
         JOptionPane.showMessageDialog(f, message);
     }
     else{
         System.exit(0);
     }
    }
         
     public static void main (String [] args){
        new Student();
     }
    }

