package atm_simulator_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Signupthree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    Signupthree(String formno){
        this.formno=formno;
        setLayout(null);
        
        JLabel l1=new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type");
        type.setFont(new Font("Raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,250,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3=new JRadioButton("Saving Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,220,250,20);
        add(r3);
            
        r4=new JRadioButton("Fixed Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupacc=new ButtonGroup();
        groupacc.add(r1);
        groupacc.add(r2);
        groupacc.add(r3);
        groupacc.add(r4);
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-4194");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel cardDetail=new JLabel("Your 16-digit Card Number : ");
        cardDetail.setFont(new Font("Raleway",Font.BOLD,12));
        cardDetail.setBounds(100,330,300,20);
        add(cardDetail);
        
        JLabel pin=new JLabel("PIN: ");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pinnumber=new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway",Font.BOLD,22));
        pinnumber.setBounds(330,370,300,30);
        add(pinnumber);
        
        JLabel pindetails=new JLabel("Your 4-digit password");
        pindetails.setFont(new Font("Raleway",Font.BOLD,12));
        pindetails.setBounds(100,395,300,30);
        add(pindetails);
        
        JLabel services=new JLabel("Services Required");
        services.setFont(new Font("Raleway",Font.BOLD,22));
        services.setBounds(100,450,200,30);
        add(services);
               
        c1=new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-statement");
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I hereby declare that the above entered details are to the best of my knowledge");
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100,680,600,30);
        add(c7);
        
        submit=new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(420,730,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel=new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(540,730,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==submit){
            String acctype=null;
            if(r1.isSelected()){
                acctype="Saving Account";
            }
            else if(r2.isSelected()){
                acctype="Fixed-Deposit Account";
            }
            else if(r3.isSelected()){
                acctype="Current Account";
            }
            else if(r4.isSelected()){
                acctype="Reccuring Deposit Account";
            }
            
            Random random=new Random();
            String cardnumber=""+Math.abs((random.nextLong()%90000000)+ 5040936000000000L);
            String pinnumber=""+Math.abs((random.nextLong()%9000L)+ 1000L);
            
            String facility="";
            if(c1.isSelected()){
                facility=facility + " ATM Card";
            }
            if(c2.isSelected()){
                facility=facility + " Internet Banking";
            }
            if(c3.isSelected()){
                facility=facility + " Mobile Banking";
            }
            if(c4.isSelected()){
                facility=facility + " Email & SMS Alerts";
            }
            if(c5.isSelected()){
                facility=facility + " Cheque Book";
            }
            if(c6.isSelected()){
                facility=facility + " E-statement";
            }
            try{
               if(acctype.equals("")){
                   JOptionPane.showMessageDialog(null,"Account type is required");
               } 
               else{
                   Conn conn=new Conn();
                   String query1="insert into signupthree values('"+formno+"','"+acctype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                   String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                   conn.s.executeUpdate(query1);
                   conn.s.executeUpdate(query2);
                   JOptionPane.showMessageDialog(null,"Card Number "+ cardnumber +"\n Pin: " + pinnumber);
               }   
            }
            catch(Exception e){
            System.out.println(e);
            }
        }
        else if(ae.getSource()==cancel){
            
        }
    }
    public static void main(String args[]){
        new Signupthree("");
    }
}
