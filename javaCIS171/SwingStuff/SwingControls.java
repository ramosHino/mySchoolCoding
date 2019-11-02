import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingControls {
   private JFrame mainframe;
   public JLabel headerLabel;
   private JLabel statusLabel;
   private JPanel controlPanel; 
   
   public SwingControls()
   {
      mainframe= new JFrame ("Butlon Example");
      mainframe.setSize(400,300);
      mainframe.setVisible(true);
      mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      ImageIcon img=new ImageIcon("apple-powder-organic.jpg");
      headerLabel= new JLabel("",JLabel.CENTER);
      statusLabel= new JLabel("",JLabel.CENTER);
      statusLabel.setSize(350,100);
      mainframe.setLayout(new GridLayout(3,1));
      controlPanel=new JPanel();
      controlPanel.setLayout(new FlowLayout());
      mainframe.add(headerLabel);
      mainframe.add(controlPanel);
      mainframe.add(statusLabel);
      
      // mainframe.addWindowListener(new WindowAdapter(){
//                                   public void windowClosing(WindowEvent windowEvent)
//                                     {
//                                   System.exit(0);
//                                     }
//                                   });
   }
   public static void main(String[]arg)
   {
     SwingControls demo= new SwingControls();
     demo.showEventDemo();
   }
   private void showEventDemo()
   {
     headerLabel.setText("Control Me!");
     JButton okButton= new JButton("OK");
     JButton submitButton= new JButton("SUBMIT");
     JButton cancelButton= new JButton("CANCEL");
     controlPanel.add(okButton);
     controlPanel.add(submitButton);
     controlPanel.add(cancelButton);
     okButton.addActionListener(new ButtonClickListener());
     submitButton.addActionListener(new ButtonClickListener());
     cancelButton.addActionListener(new ButtonClickListener());
   }
   private class ButtonClickListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         String command=e.getActionCommand();
         if(command.equals("OK"))
         {
            statusLabel.setText("Ok button ClicKed");
         }
         else if(command.equals("SUBMIT"))
         {
            statusLabel.setText("Submit button ClicKed");
         }
         else if(command.equals("CANCEL"))
         {
            statusLabel.setText("Cancel button ClicKed");         
         }  
      }
   }
}
