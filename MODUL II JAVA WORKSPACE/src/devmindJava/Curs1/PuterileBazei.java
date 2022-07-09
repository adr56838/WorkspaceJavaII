package devmindJava.Curs1;
import java.util.Scanner;

public class PuterileBazei {

    public static void putereBaza (int baza, int exponent){
        int numar = 1;
        for(int crt = 0; exponent >= crt; crt++ ){
            System.out.print(numar + " ");
            numar *= baza;
        }

    }
    public static void main(String[] args){
        System.out.println("Introdu 2 numere naturale, primul reprezinta baza, iar al doilea exponentul:");
        Scanner sc = new Scanner(System.in);
        int baza = sc.nextInt();
        int exponent = sc.nextInt();
        putereBaza(baza,exponent);

    }
}
