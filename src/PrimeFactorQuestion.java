import java.util.HashSet;

public class PrimeFactorQuestion {
    private static HashSet generate(int n){
        HashSet numberList = new HashSet<>();
        if(n == 0 || n == 1){
            return numberList;
        }

        for(int i = 2; i <= n ; i++){
            while(n % i  == 0){
                numberList.add(i);
                n /= i;
            }
        }
        return numberList;
    }

    public static void main(String[] args){
        System.out.println(generate(100));
    }
}
