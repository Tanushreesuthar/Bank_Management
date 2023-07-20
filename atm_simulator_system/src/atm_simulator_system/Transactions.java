package atm_simulator_system;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
    JLabel txt;
    JButton deposit,withdrawal,fastcash,mini,pinchange,balEnq,exit;
    String pin;
    Transactions(String pin){
        this.pin=pin;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        txt=new JLabel("Please select you Transaction ");
        txt.setBounds(220,300,700,35);
        txt.setForeground(Color.WHITE);
        txt.setFont(new Font("System",Font.BOLD,16));
        image.add(txt);
        
        deposit=new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        
        image.add(deposit);
        
        withdrawal=new JButton("Withdrawal");
        withdrawal.setBounds(350,415,150,30);
        withdrawal.addActionListener(this);
        image.add(withdrawal);
        
        fastcash=new JButton("Fast Cash");
        fastcash.setBounds(170,450,150,30);
        fastcash.addActionListener(this);
        image.add(fastcash);
        
        mini=new JButton("Mini Statement");
        mini.setBounds(350,450,150,30);
        mini.addActionListener(this);
        image.add(mini);
        
        pinchange=new JButton("Change Pin");
        pinchange.setBounds(170,485,150,30);
        pinchange.addActionListener(this);
        image.add(pinchange);
        
        balEnq=new JButton("Balance Enquiry");
        balEnq.setBounds(350,485,150,30);
        balEnq.addActionListener(this);
        image.add(balEnq);
        
        exit=new JButton("Exit");
        exit.setBounds(420,520,80,20);
        exit.addActionListener(this);
        image.add(exit);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae ){
        if(ae.getSource()==exit){
            System.exit(0);
        }
        if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }
        if(ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }if(ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pin).setVisible(true);
        }if(ae.getSource()==balEnq){
            setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }
        if(ae.getSource()==withdrawal){
            setVisible(false);
            new Withdrawal(pin).setVisible(true);
        }
        if(ae.getSource()==mini){
            new MiniStatement(pin).setVisible(true);
        }
    }
    public static void main(String args[]){
        new Transactions("");
    }
}
