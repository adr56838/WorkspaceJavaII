package devmindJava.Curs3;
import java.util.Arrays;


public class Anagrama {
    // Creare string-uri doar din litere
    public static String onlyLetters(String a) {

        StringBuilder aNew = new StringBuilder(a);
        for (int i = 0; i < aNew.length(); i++) {
            char c = aNew.charAt(i);
            if (!Character.isLetter(c)) {
                aNew.deleteCharAt(i);
                i--;
            }
        }
        return aNew.toString();
    }

    public static boolean anagramSolver(String anag1, String anag2) {

        //folosim metoda pentru a returna doar literele din String
        //Convertim tot String-ul la litere mici
        String anag1let = onlyLetters(anag1).toLowerCase();
        String anag2let = onlyLetters(anag2).toLowerCase();

        //string -- array de char
        char[] anag1char = anag1let.toCharArray();
        char[] anag2char = anag2let.toCharArray();


        //sortare arrays
        Arrays.sort(anag1char);
        Arrays.sort(anag2char);

        return Arrays.equals(anag1char,anag2char);
    }

    public static void main(String[] args){
        System.out.println(anagramSolver("fairy tales!", "rail, safety"));
        System.out.println(anagramSolver("silver bullet", "sunny day"));
        System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller!"));




    }
}
  /*//solutie- convertim String-ul in array, iar mai apoi parcurgem fiecare array si copiem in noul array cu Arrays.copyOf doar literele conform for-ului de mai jos
        for(int i = 0; i < anag1.length(); i++){
            char a = anag1.charAt(i);
            if(!Character.isLetter(a)){
                continue;
            }
            for(int j = 0 ; j < anag2.length(); i++){
                char b = anag2.charAt(j);
                if(!Character.isLetter(b)){
                    continue;
                }


            }
        }`

         */