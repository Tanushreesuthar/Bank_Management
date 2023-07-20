package atm_simulator_system;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nametxt,fnametxt,emailtxt,addtxt,citytxt,statetxt,pincodetxt;
    JButton nxt;
    JRadioButton male,female,married,unmarried,other;
    JDateChooser dateChooser;
    
    SignupOne(){
        
        setLayout(null);
        
        Random rand=new Random();
        random=Math.abs((rand.nextLong()%9000L) + 1000L);
        
        JLabel formno =new JLabel("APPLICATION FOR NO. " + random); 
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel personalDetails =new JLabel("Page1: Personal Details"); 
        personalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        personalDetails.setBounds(290,80,400,30);
        add(personalDetails);
        
        JLabel name =new JLabel("Name: "); 
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nametxt=new JTextField();
        nametxt.setFont(new Font("Raleway",Font.BOLD,14));
        nametxt.setBounds(300,140,400,30);
        add(nametxt);
        
        JLabel fname =new JLabel("Father's Name: "); 
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnametxt=new JTextField();
        fnametxt.setFont(new Font("Raleway",Font.BOLD,14));
        fnametxt.setBounds(300,190,400,30);
        add(fnametxt); 
        
        JLabel dob =new JLabel("D.O.B : "); 
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        add(dateChooser);
        
        JLabel gender =new JLabel("Gender : "); 
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        add(female);
        
        ButtonGroup genderGrp=new ButtonGroup();
        genderGrp.add(male);
        genderGrp.add(female);
       
        JLabel email =new JLabel("Email Id : "); 
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailtxt=new JTextField();
        emailtxt.setFont(new Font("Raleway",Font.BOLD,14));
        emailtxt.setBounds(300,340,400,30);
        add(emailtxt);
        
        JLabel marital =new JLabel("Marital Status : "); 
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,120,30);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,120,30);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(630,390,120,30);
        add(other);
        
        ButtonGroup maritalGrp=new ButtonGroup();
        maritalGrp.add(married);
        maritalGrp.add(unmarried);
        maritalGrp.add(other);
        
        JLabel address =new JLabel("Address : "); 
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        addtxt=new JTextField();
        addtxt.setFont(new Font("Raleway",Font.BOLD,14));
        addtxt.setBounds(300,440,400,30);
        add(addtxt);
        
        JLabel city =new JLabel("City : "); 
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        citytxt=new JTextField();
        citytxt.setFont(new Font("Raleway",Font.BOLD,14));
        citytxt.setBounds(300,490,400,30);
        add(citytxt);
        
        JLabel state =new JLabel("State : "); 
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        statetxt=new JTextField();
        statetxt.setFont(new Font("Raleway",Font.BOLD,14));
        statetxt.setBounds(300,540,400,30);
        add(statetxt);
        
        JLabel pincode =new JLabel("Pincode : "); 
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        pincodetxt=new JTextField();
        pincodetxt.setFont(new Font("Raleway",Font.BOLD,14));
        pincodetxt.setBounds(300,590,400,30);
        add(pincodetxt);
        
        nxt=new JButton("NEXT");
        nxt.setBackground(Color.BLACK);
        nxt.setForeground(Color.WHITE);
        nxt.setFont(new Font("Raleway",Font.BOLD, 14));
        nxt.setBounds(620,660,80,30);
        add(nxt);
        nxt.addActionListener(this);
        
        setSize(850,800);
        setLocation(350, 10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String formno="" + random;
        String name=nametxt.getText();
        String fname=fnametxt.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email=emailtxt.getText();
        String city=citytxt.getText();
        String state=statetxt.getText();
        String address=addtxt.getText();
        String pincode=pincodetxt.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
         try{
             if(name.equals("")){
                 JOptionPane.showMessageDialog(null,"Name is required");
             }
             else{
                 Conn c=new Conn();
                 //"String'"+variable+"'String"
                 String query= "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                 //statement s defined in Conn class
                 c.s.executeUpdate(query);
                 
                 setVisible(false);
                 new Signuptwo(formno).setVisible(true);
             }
         }catch(Exception e){
             System.out.println(e);
         }
         
    }
    
    public static void main(String args[]){
        new SignupOne();
    }
}
