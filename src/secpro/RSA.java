package secpro;
import java.math.BigInteger;
/**
 *
 * @author rey.raz
 */
public class RSA 
{
   
    
  
    public static BigInteger Encryption(BigInteger text,BigInteger e,BigInteger n) 
    {
        BigInteger enc = text.modPow(e, n);
        
        return enc;
    }
    
    public static BigInteger Decryption(BigInteger cipher,BigInteger d,BigInteger n)
    {
        BigInteger dec = cipher.modPow(d, n);
        
        return dec;
    }
    
    

    
}
