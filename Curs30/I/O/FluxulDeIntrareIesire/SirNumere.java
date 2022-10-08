package devmindJava.Curs30.I.O.FluxulDeIntrareIesire;

import devmindJava.Curs24.MyStack;

import java.io.*;
import java.util.Scanner;

public class SirNumere {
    public static void main(String[] args) throws IOException {
        try (Scanner scanText1 = new Scanner(new BufferedReader(new FileReader("W:\\MODUL II JAVA WORKSPACE\\src\\devmindJava\\Curs30\\I\\O\\FluxulDeIntrareIesire\\Numbers1.txt")));
             Scanner scanText2 = new Scanner(new BufferedReader(new FileReader("W:\\MODUL II JAVA WORKSPACE\\src\\devmindJava\\Curs30\\I\\O\\FluxulDeIntrareIesire\\Numbers2.txt")));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter("NumbersMerge.txt"))) {


            boolean crtList1 = !scanText1.hasNextInt();
            boolean crtList2 = !scanText2.hasNextInt();
            int list1 = -1;
            int list2 = -1;

            if (!crtList1) {
                list1 = scanText1.nextInt();
            }
            if (!crtList2) {
                list2 = scanText2.nextInt();
            }

            while (!crtList1 && !crtList2) {

                if (list1 < list2) {
                    outputFile.write(list1 + " ");
                    crtList1 = !scanText1.hasNextInt();
                    if (!crtList1) {
                        list1 = scanText1.nextInt();
                    }

                } else if (list1 > list2) {
                    outputFile.write(list2 + " ");
                    crtList2 = !scanText2.hasNextInt();
                    if (!crtList2) {
                        list2 = scanText2.nextInt();
                    }
                }
            }
            if(list1 < list2){
                outputFile.write(list2 + " ");
            }else{
                outputFile.write(list1 + " ");
            }
        }
    }
}




