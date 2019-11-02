import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxExample extends JFrame implements ActionListener{
   JLabel label;
   JCheckBox cb1, cb2, cb3;
   JButton b;
   
   CheckBoxExample()
   {
      label=new JLabel("Hungry?");
      label.setBounds(50,50,300,20);
      
      //Check Box for Pizza
      cb1= new JCheckBox("Pizza");
      cb1.setBounds(100,100,150,20);
      
      //Check Box for Burger
      cb2= new JCheckBox("Burger");
      cb2.setBounds(100,150,150,20);
      
      //Check Box for Popcorn
      cb3= new JCheckBox("Popcorn");
      cb3.setBounds(100,200,150,20);
      
      //The OrderFood Button
      b= new JButton("Order Food");
      b.setBounds(100,250,80,30);
      b.addActionListener(this);
      //object.setBounds(x,y,w,h)
      
      add(label);add(cb1);add(cb2);add(cb3);add(b);
      
      setSize(400,400);
      setLayout(null);
      setVisible(true);
      setDefaultCloseOperation(EXIT_ON_CLOSE);
   }//end of contructor
   
   public void actionPerformed(ActionEvent e)
   {
       float amount=0;
       String message=" ";
       if(cb1.isSelected())
       {
         amount+=10.00;
         message+="Pizza = $10.00";
       }
       if(cb2.isSelected())
         {
         amount+=8.00;
         message+="\nBurger = $8.00";
         }
       if(cb3.isSelected())
         {
         amount+=5.00;
         message+="\nPopcorn = $5.00";
         }
       else 
       {
        JOptionPane.showMessageDialog(this,"Nothing?");
       }

         
        message+="\n........................................................";
        JOptionPane.showMessageDialog(this,message+"\n Total: $" +amount); 
   }
   
   public static void main(String[]args)
   {
   new CheckBoxExample();
   }


}