package secpro;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;
/**
 *
 * @author rey.razman
 */
public class GenerateKeys 
{
    static BigInteger p,q,n,phi,d,e;
   
	public GenerateKeys()
        {
            //peida kardan do meghdar aval p va q
            int BIT_LENGTH = 32;
            Random rand = new SecureRandom();
            p = BigInteger.probablePrime(BIT_LENGTH / 2, rand);
            q = BigInteger.probablePrime(BIT_LENGTH / 2, rand);
            
            /*mohasebe n va phi(n) ke formul har kodam ebarat ast az:
            n=p*q;
            phi(n):(p-1)(q-1);
            */
            
            n = p.multiply(q);
            phi = p.subtract(BigInteger.ONE)
             .multiply(q.subtract(BigInteger.ONE));
            
            //ijad privatekey va publickey
                      
            do e = new BigInteger(phi.bitLength(), rand);
                while (e.compareTo(BigInteger.ONE) <= 0
                        || e.compareTo(phi) >= 0
                        || !e.gcd(phi).equals(BigInteger.ONE));
                         d = e.modInverse(phi);
	}

	
        public BigInteger Gete()
        {
            return e;
        }
        
        public BigInteger Getd()
        {
            return d;
        }
        
        public BigInteger Getn()
        {
            return n;
        }

    
}
