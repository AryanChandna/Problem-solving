import java.math.BigInteger;

public class pe16 {
    
    public static void main(String[] args){

        BigInteger n = BigInteger.valueOf(2).pow(1000);
        String s = n.toString();

        int sum  = 0;

        for(char c : s.toCharArray()){

            sum += c - '0';

        }

        System.out.println("ANS :" + sum);
    }
}   
