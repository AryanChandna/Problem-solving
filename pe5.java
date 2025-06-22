import java.util.Scanner;

public class pe5 {
    
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        long l = scn.nextInt();
        long h = scn.nextInt();

        long start = l;
        long end = h;
        long currLcm = l;

        for(long i = start + 1; i <= end; i++){

            currLcm = lcm(currLcm, i);
        }

        System.out.println(currLcm);
    }

    public static long lcm(long a, long b){

        return (a * b) / gcd(a,b);
    }

    public static long gcd(long a, long b){

        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
