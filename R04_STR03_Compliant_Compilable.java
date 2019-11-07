/******************************************************************************
 *  Rule04 - STR03
 *  Compliant
 ******************************************************************************/

import java.math.BigInteger; 

public class R04_STR03_Compliant_Compilable{
    
    public static void main(String[] args){
        BigInteger x = new BigInteger ("530500452766"); 
        System.out.println("The big integer is: " + x);
        String s = x. toString (); // Valid character data 
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray);
        x = new BigInteger(ns);
        System.out.println("The big integer is: " + x);
    }
    
}
