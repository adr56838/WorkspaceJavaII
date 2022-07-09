package devmindJava.Curs3;
import java.util.Scanner;

public class StringToNumber {
    public static int convertStringToNumber(String numberStr) {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int numValue = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            // varianta 1 - calculam folosind codul ASCII
            int digit = numberStr.charAt(i) - '0';
            if (digit < 0 || digit > 9)
                continue;

            //varianta 2 - cautam cifra in array-ul de cifre digits declarat mai sus
            for (int j = 0; j < digits.length; j++) {
                if (digits[i] == numberStr.charAt(i)) {
                    digit = i;
                    break;
                }
            }
            numValue = numValue * 10 + digit;
        }

        return numValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(convertStringToNumber("12345"));
    }
}
