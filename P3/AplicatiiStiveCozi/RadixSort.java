package devmindJava.P3.AplicatiiStiveCozi;

import java.util.*;

public class RadixSort {
    private static final String[] nrAliniate = new String[13];

    public static int maxCifre(int[] nrNaturale) {
        int max = nrNaturale[0];
        String maxCount = null;

        for (int i : nrNaturale) {
            if (i > max) {
                max = i;
                maxCount = String.valueOf(max);
            }
        }
        assert maxCount != null; // pentru a nu primi eroare null exception
        return maxCount.length();
    }

    public static String[] aliniereElemente(int[] nrNaturale) {
        int maxLength = maxCifre(nrNaturale);

        for (int i = 0; i < nrNaturale.length; i++) {
            nrAliniate[i] = String.valueOf(nrNaturale[i]);
            while (nrAliniate[i].length() < maxLength) {
                nrAliniate[i] = 0 + "" + nrAliniate[i];
            }
        }
        return nrAliniate;
    }

    public static void radixIndexQueue(String[] nrAliniate, int maxLength) {
        Queue[] myQueues = new Queue[10];

        //initializare cozi
        for (int i = 0; i < 10; i++) {
            myQueues[i] = new ArrayDeque();
        }
        for (int i = maxLength - 1; i >= 0; i--) {
            for (int k = 0; k < nrAliniate.length;k++) {
                int index = nrAliniate[k].charAt(i) - '0';
                myQueues[index].add(nrAliniate[k]);
            }
                int cnt = 0;
            // for (int k = 9; k >= 0; k--) { // descrescator
                    for(int k = 0; k < 10 ;k++){
                    while (!myQueues[k].isEmpty()) {
                    nrAliniate[cnt] = (String) myQueues[k].poll();
                    cnt++;
                    }
                }
        }
        System.out.println("Colectie sortata: " + Arrays.toString(nrAliniate));
        }

    public static void main (String[]args){
        int[] colectie = new int[]{1000, 4, 25, 319, 88, 51, 3430, 8471, 701, 1, 2989, 657, 713};
        System.out.println("Numar maxim de cifre = " + maxCifre(colectie));
        System.out.println("Colectie de numere cu acelasi numar de cifre: " + Arrays.toString(aliniereElemente(colectie)));
        radixIndexQueue(nrAliniate,maxCifre(colectie));
    }
}
