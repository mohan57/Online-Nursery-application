package plant3;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;


public class explore1 extends JPanel implements ActionListener{

JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
JCheckBox c1,c2,c3,c4,c5,c6,c7,c8;  
JFrame f1;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10; 
Font fo,fo2;
//JSpinner spinner;


JPanel p;
//Image img1;
String d="";
Float amount=null;


explore1(JFrame f)
{

 f1=f;

      p=new JPanel();  
     p.setBounds(0,0,900,100);    
     p.setBackground(new Color(0,102,0));  

fo=new Font("Times New Roman", Font.BOLD, 26);
l1=new JLabel("LESS WATERING PLANTS");
l1.setBounds(290,20,400,30);
l1.setFont(fo);

fo2=new Font("Lithograph", Font.BOLD, 14);








l2=new JLabel("AGAVE    (Rs:40)");
l2.setBounds(200,200,150,50);
l2.setFont(fo2);


l3=new JLabel("BOUGAINVIALLE  (Rs:25)");
l3.setBounds(200,350,180,50);
l3.setFont(fo2);

l4=new JLabel("VERBENA    (Rs:30)");
l4.setBounds(200,500,150,50);
l4.setFont(fo2);

l5=new JLabel("LANTANA    (Rs:30)");
l5.setBounds(200,650,150,50);
l5.setFont(fo2);

l6=new JLabel("SAGE    (Rs:20)");
l6.setBounds(615,200,150,50);
l6.setFont(fo2);

l7=new JLabel("YALLEOW    (Rs:30)");
l7.setBounds(615,350,150,50);
l7.setFont(fo2);

l8=new JLabel("ROSE MARY   (Rs:40)");
l8.setBounds(615,500,150,50);
l8.setFont(fo2);

l9=new JLabel("CACTUS    (Rs:30)");
l9.setBounds(615,650,150,50);
l9.setFont(fo2);

l10=new JLabel();
l10.setBounds(0,650,150,50);
l10.setFont(fo2);
l10.setVisible(false);

b1=new JButton("HOME");
b1.setBounds(190,70,150,30);

b11=new JButton("CHECK OUT");
b11.setBounds(560,70,150,30);


c1=new JCheckBox("ADD TO CART");
c1.setBounds(215,250,130,30);

c2=new JCheckBox("ADD TO CART");
c2.setBounds(215,400,150,30);

c3=new JCheckBox("ADD TO CART");
c3.setBounds(215,550,150,30);

c4=new JCheckBox("ADD TO CART");
c4.setBounds(215,700,150,30);

c5=new JCheckBox("ADD TO CART");
c5.setBounds(630,250,150,30);

c6=new JCheckBox("ADD TO CART");
c6.setBounds(630,400,150,30);


c7=new JCheckBox("ADD TO CART");
c7.setBounds(630,550,150,30);


c8=new JCheckBox("ADD TO CART");
c8.setBounds(630,700,150,30);







/*b2=new JButton("BUY");
b2.setBounds(215,250,150,30);

//b3=new JButton("INFO");
//b3.setBounds(215,270,150,30);


b4=new JButton("BUY");
b4.setBounds(215,400,150,30);

b5=new JButton("BUY");
b5.setBounds(215,550,150,30);

b6=new JButton("BUY");
b6.setBounds(215,700,150,30);

b7=new JButton("BUY");
b7.setBounds(630,250,150,30);

b8=new JButton("BUY");
b8.setBounds(630,400,150,30);

b9=new JButton("BUY");
b9.setBounds(630,550,150,30);

b10=new JButton("BUY");
b10.setBounds(630,700,150,30);*/



b12=new JButton("REVIEW ORDER");
b12.setBounds(350,130,180,30);


setSize(900,800);    
setLayout(null);    
setVisible(true);
//getContentPane().setBackground(Color.GRAY);

//new spinner();










c1.addActionListener(this);
c2.addActionListener(this);
c3.addActionListener(this);
c4.addActionListener(this);
c5.addActionListener(this);
c6.addActionListener(this);
c7.addActionListener(this);
c8.addActionListener(this);
b1.addActionListener(this);
b12.addActionListener(this);
b11.addActionListener(this);

/*
b2.addActionListener(this);
//b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);

b10.addActionListener(this);*/


add(b1);/*add(b2);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);*/ add(b12);add(b11);add(l1);add(l2);add(l3); add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);/*add(l10)*/;add(p);
add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);
}
public void paintComponent(Graphics g)
{
	
	   super.paintComponent(g);
	   Graphics2D g1 = (Graphics2D) g;
	   Stroke stroke1 = new BasicStroke(3f);
       this.setBackground(Color.white);
      g1.setColor(Color.BLACK);
       g1.setStroke(stroke1);
       g1.drawRect(85,200, 110, 110);
       g1.drawRect(85,350, 110, 110);
       g1.drawRect(85,500, 110, 110);
       g1.drawRect(85,650, 110, 110);
       g1.drawRect(500,200, 110, 110);
       g1.drawRect(500,350, 110, 110);
       g1.drawRect(500,500, 110, 110);
       g1.drawRect(500,650, 110, 110);
       
       g1.drawRect(85,200, 300, 110);
       g1.drawRect(85,350, 300, 110);
       g1.drawRect(85,500, 300, 110);
       g1.drawRect(85,650, 300, 110);
       g1.drawRect(500,200, 300, 110);
       g1.drawRect(500,350, 300, 110);
       g1.drawRect(500,500, 300, 110);
       g1.drawRect(500,650, 300, 110);
        g1.drawRect(350,130,180,30);
        






       
       
       Image img1 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/agave.png");
       g1.drawImage(img1,91,204,this); 
        
       Image img2 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/bv.png");
       g1.drawImage(img2,91,355,this);
 
       Image img3 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/Verbena.png");
       g1.drawImage(img3,91,505,this); 
      
       Image img4 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/lantana.png");
       g1.drawImage(img4,91,656,this); 

      Image img5 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/sage.png");
       g1.drawImage(img5,505,204,this); 
      
     Image img6 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/yalloew.png");
       g1.drawImage(img6,505,355,this); 

    Image img7 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/rm.png");
       g1.drawImage(img7,505,505,this); 


   Image img8 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/cactus.png");
       g1.drawImage(img8,505,656,this); 
   
   Image img9 = Toolkit.getDefaultToolkit().getImage("/Users/mohanthota/Eclipse.app/plant3/src/plant3/pictures/num2.png");
   g1.drawImage(img9,800,100,this); 

      





       
 }

@Override
public void actionPerformed(ActionEvent e) {
String data="";
float a=0;
if(e.getSource()==b1)
{	
f1.dispose();
new plant3();
}


if(c1.isSelected())
{
data+="AGAVE : 40rs\n";
a+=40; 

}

if(c2.isSelected())
{
data+="BOUGAINVIALLE   : 25rs\n";
a+=25; 
}

if(c3.isSelected())
{
data+="VERBENA  : 30rs\n";
a+=30; 
}

if(c4.isSelected())
{
data+="LANTANA : 30rs\n";
a+=30; 
}

if(c5.isSelected())
{
data+="SAGE : 20rs\n";
a+=20; 
}

if(c6.isSelected())
{
data+="YALLEOW  : 30rs\n";
a+=30; 
}

if(c7.isSelected())
{
data+="ROSE MARY : 40rs\n";
a+=40; 
}

if(c8.isSelected())
{
data+="CACTUS : 35rs\n";
a+=35; 
}


if(e.getSource()==b12)
{
data+="*******************\n";
d=data;
amount=a;
JOptionPane.showMessageDialog(this,d+"Total: "+amount); 
}

if(e.getSource()==b11)
{	
f1.dispose();
new CF();
}










/*
if(e.getSource()==b2)
{
b2.setForeground(new Color(0,102,0));
data="AGAVE\n";

}

if(e.getSource()==b4)
{
b4.setForeground(new Color(0,102,0));
data+="BOUGAINVIALLE\n";

}

if(e.getSource()==b5)
{
b5.setForeground(new Color(0,102,0));
}

if(e.getSource()==b6)
{
b6.setForeground(new Color(0,102,0));
}

if(e.getSource()==b7)
{
b7.setForeground(new Color(0,102,0));
}

if(e.getSource()==b8)
{
b8.setForeground(new Color(0,102,0));
}

if(e.getSource()==b9)
{
b9.setForeground(new Color(0,102,0));
}

if(e.getSource()==b10)
{
b10.setForeground(new Color(0,102,0));
}*/








	
}




/*public static void main(String[] args)
{    
 explore1 e1=new explore1();

   
}*/      


}


