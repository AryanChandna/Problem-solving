import java.util.*;

class pe12{

    public static void main(String[] args){

        long tsum = 1;
        long n = 2;

        boolean found = false;

        while(!found){

            tsum += n;
            n++;

            long val = check(tsum);
            if(val > 500){

                found = true;
                System.out.println(tsum);
                break;
            }
        }
    }
    
    public static long check(long n){

        long val = 1;

        Map<Integer, Integer> fmap = new HashMap<>();

        for(int i = 2; i <= n; i++){

            while(n % i == 0){
                n = n /i;
                fmap.put(i, fmap.getOrDefault(i, 0) + 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> map : fmap.entrySet()){
            
            list.add(map.getValue());
        }

        for(int i = 0; i < list.size(); i++){

            val = val * (list.get(i) + 1);
        }
    
        return val;
    }
}