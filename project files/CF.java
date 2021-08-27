package plant3;

//package mysql;
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*; 

public class CF {
	String gender;
	JPanel p;
	JLabel l7;
	CF()
	{	JFrame f = new JFrame("");
	
JLabel l=new JLabel("CHECKOUT FORM");
l.setFont(new Font ("Arial",Font.PLAIN,20));
l.setBounds(160,70,250,30);
f.add(l);

ImageIcon img2=new ImageIcon("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/num2.png");
l7=new JLabel(img2);
l7.setBounds(350,50,200,200);
f.add(l7);

p=new JPanel();  
p.setBounds(0,0,900,100);    
p.setBackground(new Color(0,102,0)); 
f.add(p);

JLabel l1=new JLabel("First Name :");
l1.setBounds(50,150,95,30);
f.add(l1);

JTextField t1=new JTextField("");
t1.setBounds(175,157,150,20);
f.add(t1);

JLabel l2=new JLabel("Last Name :");
l2.setBounds(50,200,95,30);
f.add(l2);

JTextField  t2= new JTextField();
t2.setBounds(175,207,150,20);
f.add(t2);
			
JLabel l3=new JLabel("Gender   :");
l3.setBounds(50,250,95,30);
f.add(l3);

JRadioButton j1=new JRadioButton("male");	
j1.setBounds(175,250,70,30);			
f.add(j1);

JRadioButton j2=new JRadioButton("Female");	
j2.setBounds(250,250,95,30);			 
f.add(j2);



JLabel l6=new JLabel("Phone number :");
l6.setBounds(50,300,135,30);
f.add(l6);

JTextField  t5= new JTextField();
t5.setBounds(175,310,100,20);
f.add(t5);

JLabel l16=new JLabel("D.O.B :");
l16.setBounds(50,375,135,30);
f.add(l16);

JTextField  t15= new JTextField();
t15.setBounds(175,380,100,20);
f.add(t15);

JLabel l5=new JLabel("address :");
l5.setBounds(50,430,135,30);
f.add(l5);

JTextArea  t4= new JTextArea();
t4.setBounds(175,435,270,100);
f.add(t4);



// submit button
JButton b1=new JButton("Submit");
b1.setBounds(200,570,95,20);
f.add(b1);
b1.addActionListener(new ActionListener() {
	
	public void actionPerformed(ActionEvent e) {
 //String rtype = null;

         if(e.getSource()==b1){
        	 try {
        		  Class.forName("com.mysql.cj.jdbc.Driver");
        		  Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sys","root","sqlwork123");
        		  String query="insert into checkout(fname,lname,gender,pno,dob,address)values(?,?,?,?,?,?)";
        		  PreparedStatement pst=con.prepareStatement(query);
        		  pst.setString(1,t1.getText());
                  pst.setString(2,t2.getText());
                  
                  if(j1.isSelected()){
                      gender= "male";
                  }
                   
                  if(j2.isSelected()){
                      gender= "female";
                  }
                  pst.setString(3,gender);
                  
                  pst.setString(4,t5.getText());
                  pst.setString(5,t15.getText());
                  pst.setString(6,t4.getText());
                  
                  pst.executeUpdate();
                  
                  JOptionPane.showMessageDialog(null,"successfull"); 
        		 
        		  
        
        		  
        		  //con.close();
        		
        	 } 
        	 
        	 
        	 catch(Exception e1) {
        		 System.out.println(e1);
        	 }
         }
 
           
				
	}
});
f.setSize(500,800);
f.setLayout(null);
f.setVisible(true);
f.setLocationRelativeTo(null);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

// ****   MAIN METHOD   ****
		
//public static void main(String[] args)
//{
//new CF();



		
//	}

}
