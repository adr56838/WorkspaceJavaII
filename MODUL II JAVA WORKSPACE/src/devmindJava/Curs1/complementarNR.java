/*package devmindJava.Curs1;

import java.util.Scanner;

public class complementarNR {

    public static int complementarNumar ( int n){
        int putere = 1;
        while (n > putere){
            putere *= 10;
        }
        return putere - n;
    }


    public static void main(String[] args) {
        System.out.println("Introdu numarul pentru a afla complementarul lui: ");
        Scanner sc = new Scanner(System.in);
        int numar = sc.nextInt();
        System.out.println(numar + "-->" + complementarNumar(numar));
    }
}

 */