package devmindJava.Curs30.I.O.FluxulDeIntrareIesire;

import java.io.*;
import java.util.Scanner;

public class Words {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        String short1 = next;
        String long1 = next;
        String first = next;
        String last = next;
        int size = 0;

        while(!next.equals("quit")){
            next = scanner.next();
            size++;

            if(short1.length() > next.length()){
                short1 = next;
            }
            if(long1.length() < next.length()){
                long1 = next;
            }
            if(first.compareTo(next) > 0){
                first = next;
            }
            if(last.compareTo(next) < 0){
                last = next;
            }

        }



        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("result.txt"))){
            outputFile.write("1. cel mai scurt cuvant " + short1+ '\n');
            outputFile.write("2. cel mai lung cuvant: " + long1+ '\n');
            outputFile.write("3. primul cuvant in ordine alfabetica: " + first + '\n');
            outputFile.write("4. ultimul cuvant in ordine alfabetica: " + last+ '\n');
            outputFile.write("5. numarul total de cuvinte: " + size + '\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
