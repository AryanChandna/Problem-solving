import java.util.Scanner;

public class pe6 {
    
    public static void main(String[] args){

     Scanner scn = new Scanner(System.in);

    int n = scn.nextInt();
       long sumOfSquares = 0;
       long sumOfWhole = 0;
       
       sumOfSquares = (n * (n+1) * (2*n+1))/6;
       
       for(int i = 1; i <= n; i++){
        sumOfWhole += i;
       }

       sumOfWhole = sumOfWhole * sumOfWhole;

       System.out.println(sumOfWhole - sumOfSquares);
    }
}
