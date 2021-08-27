 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
//import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
//import javax.swing.SwingUtilities;

public  class plant3 extends JFrame implements ActionListener{
JButton b1,b2,b3,b4,b5,b6,b7,b8;
//innerbuttons
JButton b9,b10,b11,b12,b13,b14;
Font f1,f2;
JPanel p1,p2,p3,p4,p5,p6;
JFrame f,fr;
JLabel l1,l2,l3,l4,l5,l6;
JTextArea t1;



plant3(){


JFrame fr= new JFrame();
//button

b1=new JButton("HOME");
b1.setBounds(100,70,150,30);

b2=new JButton("EXPLORE");
b2.setBounds(320,70,150,30);

b3=new JButton("SEARCH");
b3.setBounds(550,70,150,30);


b4=new JButton("LESS WATERING PLANTS");
b4.setBounds(280,200,250,50);

b5=new JButton("RARE/IMPORTED PLANTS");
b5.setBounds(280,250,250,50);

b6=new JButton("FLOWERING PLANTS");
b6.setBounds(280,300,250,50);


b7=new JButton("ALL WEATHER PLANTS");
b7.setBounds(280,350,250,50);

b8=new JButton("INDOOR PLANTS");
b8.setBounds(280,400,250,50);

b9=new JButton("Explore");
b9.setBounds(270,400,100,30);
b9.setVisible(false);

b11=new JButton("Explore");
b11.setBounds(270,400,100,30);
b11.setVisible(false);

b12=new JButton("Explore");
b12.setBounds(270,400,100,30);
b12.setVisible(false);

b13=new JButton("Explore");
b13.setBounds(270,400,100,30);
b13.setVisible(false);

b14=new JButton("Explore");
b14.setBounds(270,400,100,30);
b14.setVisible(false);

b10=new JButton("Back");
b10.setBounds(440,400,100,30);
b10.setVisible(false);



//labels and fonts, image

f1=new Font("Serif", Font.BOLD, 24);
l1=new JLabel("PLANT STORY");
l1.setBounds(310,20,300,30);
l1.setFont(f1);

f2=new Font("Serif", Font.ITALIC, 16);
l2=new JLabel("welcome to PLANT STORY");
l2.setBounds(310,120,500,30);
l2.setFont(f2);
l2.setForeground(Color.BLUE);


l3=new JLabel("online nursery and plant exploration");
l3.setBounds(280,140,500,30);
l3.setFont(f2);
l3.setForeground(Color.BLUE);


ImageIcon img1=new ImageIcon("logo.png");
l4=new JLabel(img1);
l4.setBounds(550,360,200,200);

l5=new JLabel(img1);
l5.setBounds(60,360,200,200);


//pannels

p1=new JPanel();
p1.setBounds(0,100,800,20);
p1.setBackground(new Color(0,102,0));

p2=new JPanel();
p2.setBounds(0,50,800,20);
p2.setBackground(new Color(0,102,0));

p3=new JPanel();
p3.setBounds(200,180,400,10);
p3.setBackground(new Color(102,51,0));

p4=new JPanel();
p4.setBounds(200,180,10,300);
p4.setBackground(new Color(102,51,0));


p5=new JPanel();
p5.setBounds(600,180,10,310);
p5.setBackground(new Color(102,51,0));

p6=new JPanel();
p6.setBounds(200,480,400,10);
p6.setBackground(new Color(102,51,0));


t1=new JTextArea();
t1.setBounds(220,270,370,120);
t1.setVisible(false);


/*ImageIcon img2=new ImageIcon("num2.png");
l6=new JLabel(img2);
l6.setBounds(400,200,400,400);
getContentPane().add(l6);*/


//actionlistioners

b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
b9.addActionListener(this);
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);

setSize(800,600);    
setLayout(null);    
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLocationRelativeTo(null);
 
add(p1);add(b1);add(b2);add(b3);add(p2);add(l1);add(l2);add(l3);add(p3);add(p4);add(p5);add(p6);add(b4);add(l4);add(l5);add(b5);add(b6);add(b7);add(b8);add(b9);
add(t1);add(b10);add(b11);add(b12);add(b13);add(b14);





}









public void actionPerformed(ActionEvent e)
{

 if(e.getSource()==b4)//button action for summer plants
{
t1.setVisible(true);
t1.setText(" SUMMER plants are also know as Less watering plants\n these plants have the ability to store more water or\n moisture in their stems or leave. \n These can grow in hot windy climate . You need not to\ntake care much but water them on a weekly basis.");

b5.setVisible(false);
b6.setVisible(false);
b7.setVisible(false);
b8.setVisible(false);
b9.setVisible(true);
b10.setVisible(true);
}


if(e.getSource()==b5) //button action for location plants
{
b5.setBounds(280,200,250,50);
t1.setVisible(true);
t1.setText("imported plants or rare are those plants which\n are generally not available in\n our locality or in our currently. these\n plants need some extra care\n but they will be absolutely as\n beautiful as you ");
b4.setVisible(false);
b6.setVisible(false);
b7.setVisible(false);
b8.setVisible(false);
b11.setVisible(true);
b10.setVisible(true);
}


if(e.getSource()==b6) //button action for FLOWERING
{
b6.setBounds(280,200,250,50);
t1.setVisible(true);
t1.setText(" FLOWERING plants are very attractive and beautiful\n these plants act as an decorative item or\n can help you in making your own garlands. \n There are different varieties of flowering plants \ntake proper care is required to get more flowers");
b4.setVisible(false);
b5.setVisible(false);
b7.setVisible(false);
b8.setVisible(false);
b12.setVisible(true);
b10.setVisible(true);
}


if(e.getSource()==b7) //button action for any weather plants
{
b7.setBounds(280,200,250,50);
t1.setVisible(true);
t1.setText(" ANY WEATHER plants are this plants which can sustain\n any weather condition to maximum extent.But not \nsuitable for extreme weather.they can tolerate as much \n as they can. irrespective of your location, they grow\n  but telling again can't be judged");
b4.setVisible(false);
b5.setVisible(false);
b6.setVisible(false);
b8.setVisible(false);
b13.setVisible(true);
b10.setVisible(true);
}



if(e.getSource()==b8) //button action for any indoor plants
{
b8.setBounds(280,200,250,50);
t1.setVisible(true);
t1.setText(" INDOOR plants are those which require less sunlight to \n survive. these plants have the ability to grow inside your \nhomes and there are many benefits of indoor plants. \n care is a must for every plant and some of them\n believe that these plants can bring luck.");
b4.setVisible(false);
b5.setVisible(false);
b6.setVisible(false);
b7.setVisible(false);
b14.setVisible(true);
b10.setVisible(true);
}




if(e.getSource()==b10)//button action to go back to normal
{
t1.setVisible(false);
b5.setVisible(true);
b6.setVisible(true);
b7.setVisible(true);
b8.setVisible(true);
b9.setVisible(false);
b10.setVisible(false);
b11.setVisible(false);
b12.setVisible(false);
b13.setVisible(false);
b14.setVisible(false);
b4.setVisible(true);

b8.setBounds(280,400,250,50);
b7.setBounds(280,350,250,50);
b6.setBounds(280,300,250,50);
b5.setBounds(280,250,250,50);
}

if(e.getSource()==b9)
{
     
  JFrame f = new JFrame();
explore1 e1= new explore1(f);

    
      dispose();
     
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(e1);
      f.setSize(900, 800);
      //f.getContentPane().setBackground(Color.GRAY);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
}



if(e.getSource()==b11)
{
     
  JFrame f = new JFrame();
explore2 e1= new explore2(f);

    
      dispose();
     
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(e1);
      f.setSize(900, 800);
      //f.getContentPane().setBackground(Color.GRAY);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
}



if(e.getSource()==b12)
{
     
  JFrame f = new JFrame();
explore3 e1= new explore3(f);

    
      dispose();
     
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(e1);
      f.setSize(900, 800);
      //f.getContentPane().setBackground(Color.GRAY);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
}





if(e.getSource()==b13)
{
     
  JFrame f = new JFrame();
explore4 e1= new explore4(f);

    
      dispose();
     
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(e1);
      f.setSize(900, 800);
      //f.getContentPane().setBackground(Color.GRAY);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
}




if(e.getSource()==b14)
{
     
  JFrame f = new JFrame();
explore5 e1= new explore5(f);

    
      dispose();
     
     f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      f.add(e1);
      f.setSize(900, 800);
      //f.getContentPane().setBackground(Color.GRAY);
      f.setLocationRelativeTo(null);
      f.setVisible(true);
}





}


public static void main(String[] args)
{    
  new plant3();

   
}       
}
