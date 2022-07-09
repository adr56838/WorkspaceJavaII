package devmindJava.Curs3;
import java.util.Scanner;
import java.util.Arrays;

public class FilterStringTemplate {




    public static String[] filter(String[] Array, String key, int matchKey) {
        String[] filterArray = new String[Array.length];
        int cnt = 0;
        key = key.toLowerCase();

        int contor = 0;
        for (int i = 0; i < Array.length; i++) {
            String crtWord = Array[i].toLowerCase();
            int minLength = Math.min(crtWord.length(), key.length());
            contor = 0;
            for (int j = 0; j < minLength; j++) {
                if (crtWord.charAt(j) == key.charAt(j)) {
                    contor++;
                }
            }
            if (contor >= matchKey) {
                filterArray[cnt] = Array[i];
                cnt++;
            }
        }


        return Arrays.copyOf(filterArray, cnt);
    }

    public static void main(String[] args){

        String[] Array = {"clothes", "ant", "drop", "Fly", "racoon", "class", "Plane"};
        System.out.println(Arrays.toString(filter(Array, "plot", 3)));
        System.out.println(Arrays.toString(filter(Array, "plot", 2)));
        System.out.println(Arrays.toString(filter(Array, "plot", 1)));
        System.out.println(Arrays.toString(filter(Array, "plot", 4)));





    }


}
