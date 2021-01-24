/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secpro;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.*;  
import java.awt.event.*;
import java.math.BigInteger;

public class Gui extends JFrame implements ActionListener
{
        GenerateKeys keys=new GenerateKeys(); 
        JLabel label;
        JTextField F,output;
        JButton B1,B2;
        
        
          
       

    public Gui() 
    {
        
        super("RSA Encryption");
        label = new JLabel("add your text");
        label.setBounds(50,50,150,20); 
        label.setBackground(Color.red);
       //..................................
        F =new JTextField(50);
        F.setBounds(50,100,150,20);  
        F.setBackground(Color.LIGHT_GRAY);
        //..................................
        B1=new JButton("Encryption");
        B1.setBounds(50,200,50,50);  
        B1.setBackground(Color.RED);
        
        B2=new JButton("Decrption");
        B2.setBounds(50,200,50,50);  
        B2.setBackground(Color.red);
        
        B1.addActionListener(this);  
        B2.addActionListener(this);  
        
        //...............................................
        output=new JTextField();
        output.setBackground(Color.YELLOW);
        output.setBounds(200,200,150,20);  
        output.setEditable(false); 
        /***********************************************/
        
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.setBackground(Color.orange);
        
        container.add(label);
        container.add(F);
        container.add(B1);
        container.add(B2);
        container.add(output);
        
        
        

    }
        @Override
  public void actionPerformed(ActionEvent e) 
  {
      Convert convert=new Convert();
      
       if(e.getSource()==B1)
       {
           String s1=F.getText();
           BigInteger input=Convert.ToInt(s1);
           BigInteger ciphertext;
           String out;
           ciphertext=RSA.Encryption(input, keys.Gete(), keys.Getn());
           out=ciphertext.toString();
           
           output.setText(out);
              
        }
       else if(e.getSource()==B2)
        {  
            String out;
            BigInteger plaintext;
            String s2=F.getText();
             BigInteger input=new BigInteger(s2);
             
            plaintext =RSA.Decryption(input, keys.Getd(), keys.Getn());
            out=plaintext.toString();
            
            output.setText(out);
        }  
      
       
  } 
    
}
