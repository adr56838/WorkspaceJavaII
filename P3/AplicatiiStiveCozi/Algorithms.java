package devmindJava.P3.AplicatiiStiveCozi;

public class Algorithms {



    public static boolean isOperator(char c){
        if(c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
            return true;
        }
        return false;
    }

     public static int precedenceValue(char c) {
            if(c == '+' || c == '-'){
                return 1;
            } else if(c == '*' || c == '/'){
                return 2;
            } else if( c == '^'){
                return 3;
            }
            return -1;
         }

    public static int convertStringToNumber(String numberStr) {
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int numValue = 0;

        for (int i=0; i<numberStr.length(); i++) {
            for (int j=0; j<digits.length; j++) {
                if (numberStr.charAt(i) == digits[j]) {
                    // the letter has the value j
                    numValue = numValue * 10 + j;
                }
            }
        }

        return numValue;
    }

    public static boolean leftRightAssociativity(char c){
        if(c == '+' || c == '-' || c == '*' || c == '/'){
            return true;
        }
        return false;
    }

    public static boolean isLeftParanthesis(char c){
        if(c == '(' || c == '[' || c =='{'){
            return true;
        }
        return false;
    }

}
