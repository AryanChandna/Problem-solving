import java.util.*;

public class pe3 {
    
    public static void main(String[] args){

        // largest prime

        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        Set<Long> set = largestPrime(n);
        
        long max = Long.MIN_VALUE;
        for(long val : set){
            if(val > max){
                max = val;
            }
        }
        System.out.println(max);
    }

    public static Set<Long> largestPrime(long n){
        Set<Long> set = new HashSet<>();
        long originalN = n;

        while(n % 2 == 0){
            set.add((long) 2);
            n = n / 2;
        }

        for(long i = 3; i <= Math.sqrt(originalN); i = i + 2){
            while(n % i == 0){
                set.add(i);
                n = n / i;
            }
        }

        if(n > 2){
            set.add(n);
        }

        return set;
    }
}
