package atm_simulator_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    JButton signup,login,clear;
    JTextField cardTxt;
    JPasswordField pinTxt;
   Login(){
       setTitle("Automated Teller Machine");
       setLayout(null);
       ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
       Image i2 =i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
       ImageIcon i3=new ImageIcon(i2);
       JLabel label = new JLabel(i3);
       label.setBounds(50,20,100,100);
       add(label);
       
       JLabel txt=new JLabel("Welcome to ATM");
       txt.setBounds(200,40,440,40);
       txt.setFont(new Font("Arial",Font.CENTER_BASELINE,18));
       add(txt);
       
       JLabel cardNo=new JLabel("Card No: ");
       cardNo.setBounds(120,150,150,30);
       cardNo.setFont(new Font("Osward",Font.BOLD,28));
       add(cardNo);
       
       cardTxt=new JTextField();
       cardTxt.setBounds(300, 150, 230, 30);
       cardTxt.setFont(new Font("Arial",Font.PLAIN,17));
       add(cardTxt);
       
       JLabel pin=new JLabel("PIN: ");
       pin.setBounds(120,220,160,30);
       pin.setFont(new Font("Raleway",Font.BOLD,28));
       add(pin);
       
       pinTxt=new JPasswordField();
       pinTxt.setBounds(300, 220, 230, 30);
       add(pinTxt);
       
       login=new JButton("SIGN IN");
       login.setBounds(300, 300, 100, 30);
       login.setBackground(Color.BLACK);
       login.setForeground(Color.WHITE);
       login.addActionListener(this);
       add(login);
       
       clear=new JButton("CLEAR");
       clear.setBounds(430, 300, 100, 30);
       clear.setBackground(Color.BLACK);
       clear.setForeground(Color.WHITE);
       clear.addActionListener(this);
       add(clear);
       
       signup=new JButton("SIGN UP");
       signup.setBounds(300, 350, 230, 30);
       signup.setBackground(Color.BLACK);
       signup.setForeground(Color.WHITE);
       signup.addActionListener(this);
       add(signup);
       
       setSize(800,480);
       setVisible(true);
       setLocation(350,200);
   }
   
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==login){
          Conn c=new Conn();
          String cardno=cardTxt.getText();
          String pinno =pinTxt.getText();
          String query="select * from login where cardnumber ='"+cardno+"' and pinnumber='"+pinno+"'";
          try{
           ResultSet rs=c.s.executeQuery(query);
           if(rs.next()){
               setVisible(false);
               new Transactions(pinno).setVisible(true);
           }
           else{
               JOptionPane.showMessageDialog(null,"Incorrect Card Number/PIN");
           }
          }
        catch(Exception e){
            System.out.println(e);
        }
        }
        else if(ae.getSource()==clear){
            cardTxt.setText("");
            pinTxt.setText("");
        }
        else if(ae.getSource()==signup){
            
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String args[]){
       new Login();
   } 
}
