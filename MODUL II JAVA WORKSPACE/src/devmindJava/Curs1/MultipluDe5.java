package devmindJava.Curs1;
import java.util.Scanner;

public class MultipluDe5 {



    private static int returnFirstMultipleOf5(int n) {
        return n - n % 5;
    }
    private static int returnNextMultimpleOf5(int n){
        if(n % 5 == 0){
            return n;
        }
        return n + (5 - n % 5);
    }

    private static void compareValues(int result, int expected) {
        if (result == expected) {
            System.out.println("Test passed with result " + result);
        } else {
            System.out.println("Got wrong value " + result);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(20 + " -> " + returnFirstMultipleOf5(20));
        System.out.println(18 + " -> " + returnFirstMultipleOf5(18));
        System.out.println(1 + " -> " + returnFirstMultipleOf5(1));
        System.out.println(4 + " -> " + returnFirstMultipleOf5(4));
        System.out.println(11 + " -> " + returnFirstMultipleOf5(11));
        System.out.println("");

        System.out.println(20 + " -> " + returnNextMultimpleOf5(20));
        System.out.println(18 + " -> " + returnNextMultimpleOf5(18));
        System.out.println(1 + " -> " + returnNextMultimpleOf5(1));
        System.out.println(4 + " -> " + returnNextMultimpleOf5(4));
        System.out.println(11 + " -> " + returnNextMultimpleOf5(11));
        System.out.println(0 + " -> " + returnNextMultimpleOf5(0));


    }
}
