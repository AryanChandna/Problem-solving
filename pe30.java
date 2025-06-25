import java.util.ArrayList;

public class pe30 {
    
    public static void main(String[] args){

        int upperLimit = 354294;  // Max sum of 5th powers of digits
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 2; i < upperLimit; i++){

            boolean flag = check(i);
            if(flag){
                list.add(i);
            }
        }

        int tsum = 0;
        for(int val : list){
            tsum += val;
        }

        System.out.println(tsum);
    }

    public static boolean check(int num){

        int sum = 0;
        int temp = num;

        while(temp > 0){

            int digit = temp % 10;
            sum += Math.pow(digit,5);
            temp = temp / 10;
        }

        return sum == num;
    }
}
