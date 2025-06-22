public class pe9 {
    
    public static void main(String[] args){

        for(int i = 1; i <= 1000; i++){

            for(int j = i + 1; j <= 1000; j++){

                for(int k = j + 1; k <=1000; k++){

                    int a = i;
                    int b = j;
                    int c = k;

                    if((a*a + b*b == c*c) && a + b + c == 1000){

                        System.out.println(a * b * c);

                    }
                }
            }
        }
    }
}
