public class pe1 {
    
    public static void main(String[] args) {
        // Approach 1: Brute Force
        int sum = 0;
        for(int i = 0; i < 1000; i++){
            if(i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

    // Approach 2: Using Arithmetic Progression
    public static int sumOfMultiples(int n, int k){
        int p = n / k;
        return k * (p * (p + 1)) / 2;
    }

}
