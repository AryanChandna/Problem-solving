public class pe2 {
    
    public static void main(String[] args) {
        int a = 1, b = 2, sum = 0;
        while(b < 4000000){
            if(b % 2 == 0){
                sum += b;
            }
            int temp = a;
            a = b;
            b = temp + b;
        }
        System.out.println(sum);
        // System.out.println(fib(10));

    }

    public static int fib(int num){

        if(num == 1)
            return 1;
        if(num == 2)
            return 2;

        return fib(num - 1) + fib(num - 2);
    }
}
