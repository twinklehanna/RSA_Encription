
package secpro;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author rey.raz
 */
public class Convert 
{
    public static BigInteger ToInt(String str)
    {
        BigInteger text;
        
        Map<Character, Integer> map;
        map = new HashMap<>();
    
        map.put(' ',0);
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        map.put('0', 27);
        map.put('1', 28);
        map.put('2', 29);
        map.put('3', 30);
        map.put('4', 31);
        map.put('5', 32);
        map.put('6', 33);
        map.put('7', 34);
        map.put('8', 35);
        map.put('9', 36);
        map.put('.', 37);
        map.put('?', 38);
        map.put(',', 39);
        map.put('-', 40);
        
        long val=0;
        for(int i = 0; i < str.length(); i++)
        {
            char c=str.charAt(i);
            
                if(map.get(c)>=10)
                    val=val*100;
                 else
                    val=val*10 ;
           
            val= map.get(c)+ val;

        }
         System.out.println(val);
        text= BigInteger.valueOf(val);
        
        return text;
        
    }
    
//    public static String ToStg(BigInteger out)
//    {
//        Map<Integer,Character > map;
//        map = new HashMap<>();
//        
//        map.put(0,' ');
//        map.put(1,'a');
//        map.put(2,'b');
//        map.put(3,'c');
//        map.put(4,'d');
//        map.put(5,'e');
//        map.put(6,'f');
//        map.put(7,'g');
//        map.put(8,'h');
//        map.put(9,'i');
//        map.put(10,'j');
//        map.put(11,'k');
//        map.put(12,'l');
//        map.put(13,'m');
//        map.put(14,'n');
//        map.put(15,'o');
//        map.put(16,'p');
//        map.put(17,'q');
//        map.put(18,'r');
//        map.put(19,'s');
//        map.put(20,'t');
//        map.put(21,'u');
//        map.put(22,'v');
//        map.put(23,'w');
//        map.put(24,'x');
//        map.put(25,'y');
//        map.put(26,'z');
//        map.put(27,'0');
//        map.put(28,'1');
//        map.put(29,'2');
//        map.put(30,'3');
//        map.put(31,'4');
//        map.put(32,'5');
//        map.put(33,'6');
//        map.put(34,'7');
//        map.put(35,'8');
//        map.put(36,'9');
//        map.put(37,'.');
//        map.put(38,'?');
//        map.put(39,',');
//        map.put(40,'-');
//    }
}
