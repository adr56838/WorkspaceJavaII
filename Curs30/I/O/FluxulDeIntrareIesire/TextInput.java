package devmindJava.Curs30.I.O.FluxulDeIntrareIesire;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class TextInput {


    public static void main(String[] args) throws IOException {
        //Citire fisier
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type the word to be replaced: ");


        String replacedWord = scanner.nextLine();
        System.out.print("Type the new word: ");
        String newWord = scanner.nextLine();
        scanner.close();
        StringBuilder text = new StringBuilder();

        try { Scanner sc = new Scanner(new BufferedReader(new FileReader("src/devmindJava/Curs30/I/O/FluxulDeIntrareIesire/TextInput.txt")));

                while (sc.hasNextLine()) {
                String result = sc.nextLine();
                text.append(result).append("\n");

                }

            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } finally {
            scanner.close();
        }
            //procesare text
        text = new StringBuilder(text.toString().replaceAll(replacedWord, newWord));
        System.out.println(text);


            try (BufferedWriter outputFile = new BufferedWriter(new FileWriter("src/devmindJava/Curs30/I/O/FluxulDeIntrareIesire/TextInput.txt"))){
                outputFile.write(text.toString());
            }

        }
    }

