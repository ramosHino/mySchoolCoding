import javax.swing.*;
import java.awt.*;
public class MyFirstSwing{
   public static void main(String[]args){
   JFrame f = new JFrame("My first Real GUI"); //important
   
   
   f.setSize(400,300);
   f.setVisible(true); //important
   f.setTitle("Test");
   f.setResizable(true);
   f.setLocationRelativeTo(null);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//important
   ImageIcon img=new ImageIcon("apple-powder-organic.jpg");
   f.setIconImage(img.getImage());
   
   JLabel l=new JLabel("Cool Gooie");
   f.getContentPane().add(l);
   }
}