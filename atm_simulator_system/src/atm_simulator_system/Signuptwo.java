package atm_simulator_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Signuptwo extends JFrame implements ActionListener{
    
    
    JTextField pan,adhartxt;
    JButton nxt;
    JRadioButton syes,sno,eyes,eno;
    JComboBox religion,edu,occu,income,category;
    String formno;
    Signuptwo(String formno){
        this.formno=formno;
        setLayout(null);
         
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
                
        JLabel additionalDetails =new JLabel("Page 2 : Additional Details"); 
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails );
        
        JLabel name =new JLabel("Religion: "); 
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String valReligions[]={"Hindu","Muslim","Christian","Sikh","Parsi","Other"};
        religion= new JComboBox(valReligions);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        JLabel fname =new JLabel("Category: "); 
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valCategory[]={"General","OBC","SC","ST","NT","Other"};
        category= new JComboBox(valCategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
        
        JLabel dob =new JLabel("Income : "); 
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        String incomeCategory[]={"NULL","<1,50,000","<2,50,000","<5,00,000","upto 10,00,000",">10,00,000"};
        income= new JComboBox(incomeCategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        JLabel gender =new JLabel("Education : "); 
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        gender.setBounds(100,290,200,30);
        add(gender);
        
       
        JLabel email =new JLabel("Qualification : "); 
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String eduCategory[]={"Non-graduate","Graduate","Post-graduate","Doctrate","Others"};
        edu= new JComboBox(eduCategory);
        edu.setBounds(300,302,400,30);
        edu.setBackground(Color.WHITE);
        add(edu);
        
        
        JLabel marital =new JLabel("Occupation : "); 
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        marital.setBounds(100,390,150,30);
        add(marital);
        
        String occuCategory[]={"Salaried","Non-salaried","Self-employed","Business","Student","Others"};
        occu= new JComboBox(occuCategory);
        occu.setBounds(300,390,400,30);
        occu.setBackground(Color.WHITE);
        add(occu);
        
        JLabel address =new JLabel("PAN No. : "); 
        address.setFont(new Font("Raleway",Font.BOLD,20));
        address.setBounds(100,440,200,30);
        add(address);
        
        pan=new JTextField();
        pan.setFont(new Font("Raleway",Font.BOLD,14));
        pan.setBounds(300,440,400,30);
        add(pan);
        
        JLabel adhar =new JLabel("Aadhar No. : "); 
        adhar.setFont(new Font("Raleway",Font.BOLD,20));
        adhar.setBounds(100,490,200,30);
        add(adhar);
        
        adhartxt=new JTextField();
        adhartxt.setFont(new Font("Raleway",Font.BOLD,14));
        adhartxt.setBounds(300,490,400,30);
        add(adhartxt);
        
        JLabel state =new JLabel("Senior Citizen: "); 
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        syes=new JRadioButton("Yes");
        syes.setBounds(300,540,100,30);
        add(syes);
        
        sno=new JRadioButton("No");
        sno.setBounds(450,540,100,30);
        add(sno);
        
        ButtonGroup snrGrp=new ButtonGroup();
        snrGrp.add(syes);
        snrGrp.add(sno);
        
        JLabel pincode =new JLabel("Existing Account: "); 
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
        eyes=new JRadioButton("Yes");
        eyes.setBounds(300,590,100,30);
        add(eyes);
        
        eno=new JRadioButton("No ");
        eno.setBounds(450,590,100,30);
        add(eno);
        
        ButtonGroup existingGrp=new ButtonGroup();
        existingGrp.add(eyes);
        existingGrp.add(eno);
        
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
        String formno="";
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducation=(String)edu.getSelectedItem();
        String soccupation=(String)occu.getSelectedItem();
        
        String snrcitizen=null;
        if(syes.isSelected()){
            snrcitizen="Yes";
        }
        else if(sno.isSelected()){
            snrcitizen="No";
        }
        
        String existingacc=null;
        if(eyes.isSelected()){
            existingacc="Yes";
        }
        else if(eno.isSelected()){
            existingacc="No";
        }
        
        String span=pan.getText();
        String sadhar=adhartxt.getText();
        
        try{
                 Conn c=new Conn();
                 //"String'"+variable+"'String"
                 String query= "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+snrcitizen+"','"+existingacc+"')";
                 //statement s defined in Conn class
                 c.s.executeUpdate(query);
                 //Signupthree ob ject
                 setVisible(false);
                 new Signupthree(formno).setVisible(true);
             
         }catch(Exception e){
             System.out.println(e);
         }
    }
    
    public static void main(String args[]){
        new Signuptwo("");
    }
}
