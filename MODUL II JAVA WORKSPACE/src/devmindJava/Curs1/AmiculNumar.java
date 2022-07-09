package devmindJava.Curs1;

import java.util.Scanner;

public class AmiculNumar {

    private static int sumOfDivisors(int n){
        int sum = 1;
        for(int i = 2;  i < n; i++){
            if(n % i ==0)
                sum += i;

        }
        return sum;
    }

    private static void findAmicPairs(int left, int right){
        for (int i = left; i < right; i++){
            int sumI = sumOfDivisors(i);
            if(sumI < i || sumI == i || sumI > right){
               continue;
            }
            if(sumOfDivisors(sumI) == i){
                System.out.println(i + " " + sumI);
            }
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        findAmicPairs(230,10000);


    }
}
