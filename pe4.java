
public class pe4 {
    
    public static void main(String[] args){

        int maxValue = Integer.MIN_VALUE;

        for(int i = 100; i <= 999; i++){

            for(int j = 100; j <= 999; j++){

                int product = i * j;

                boolean check = isPalindrome(product);

                if(check){
                    if(product > maxValue){
                        maxValue = product;
                    }
                }

            }
        }

        System.out.println(maxValue);

    }

    public static boolean isPalindrome(int num){

        String str = String.valueOf(num);
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
    
}
