package secpro;
import java.util.Scanner;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author reyhane.razman
 */
public class SecPro {


    public static void main(String[] args) 
    {   
//        GenerateKeys keys= new GenerateKeys();
//        String s1="hello world";
// 
//        BigInteger input=Convert.ToInt(s1);
//        
//        System.out.println(input);
//        
//        BigInteger ciphertext;
//        
        
//        String out;
//        ciphertext=RSA.Encryption(input, keys.Gete(), keys.Getn());
        
        
        Gui gui = new Gui();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setSize(1000, 200);
        
        gui.setBackground(Color.BLUE);
        gui.setVisible(true);

       

    }
    
}
