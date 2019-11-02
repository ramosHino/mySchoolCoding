import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxExample extends JFrame implements ActionListener{
   JFrame f;
   JLabel label;
   final String languages[]={"C","C++","C#","Java","Python"};
   JComboBox<String>cb;
   
   ComboBoxExample()
   {
      f=new JFrame("Languages");
      label=new JLabel();
      label.setSize(400,100);
      label.setHorizontalAlignment(JLabel.CENTER);
     
   
      
      JButton b=new JButton ("Show");
      b.setBounds(200,100,75,20);
      b.addActionListener(this);
      
      JButton close=new JButton("Close");
      close.setBounds(50,200,95,30);
      close.addActionListener(new CloseListener());
      
      //clear button/listener
      JButton clear=new JButton();
      clear.setBounds(50,200,95,30);
      clear.addActionListener(new ClearListener());
      
      
      cb= new JComboBox<>(languages);
      cb.setBounds(50,100,90,20);
      f.add(cb);f.add(label);f.add(b);
      
     
      f.setSize(500,400);
      f.setLayout(null);
      f.setVisible(true);
      f.setDefaultCloseOperation(EXIT_ON_CLOSE);
      
   }//ends contructor
   
   public void actionPerformed(ActionEvent e)
   {
      String data="Languages Selected:  "+cb.getItemAt(cb.getSelectedIndex());
   
      label.setText(data); 
      
   }
   
   private class CloseListener implements ActionListener
   {
      @Override
         public void actionPerformed(ActionEvent e)
      {
         if (e.getActionCommand().equals("Close"))
         {
            int reply=JOptionPane.showConfirmDialog(null,"Are you sure?", "Quit", JOptionPane.YES_NO_OPTION);
               
            if(reply==JOptionPane.YES_OPTION)
               System.exit(0);
         }
            
      }
   }
   private class ClearListener implements ActionListener
   {
      @Override
         public void actionPerformed(ActionEvent e)
      {
         if (e.getActionCommand().equals(""))
         {
            JOptionPane.showMessageDialog(null,
               "Invalid");
         }
            
      }
   }

   public static void main(String[]args)
   {
      new ComboBoxExample();
   }

}