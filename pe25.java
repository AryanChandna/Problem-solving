import java.math.BigInteger;
import java.util.Scanner;

public class pe25 {
    
    public static void main(String[] args){

        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;

        int index = 2;

        while(b.toString().length() < 1000){

            BigInteger temp = b;
            b = b.add(a);
            a = temp;
            index++;
        }

        System.out.println(index);

    }}

