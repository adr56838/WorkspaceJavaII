package devmindJava.Curs2;

import java.util.Arrays;
import java.util.Scanner;

public class TesteArrays {
    //metoda de a creste marimea unui array clasica
    /*public static String[] increaseCapacity(String[] array, int newLength){
        String[] largerArray = new String[newLength];

        for(int i =0; i<array.length;i++){
            largerArray[i] = array[i];
        }
        return largerArray;
    }*/

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String stopKeyword = "St0p!";

        int initCapacity = 2;
        String[] array = new String[initCapacity];
        int numberOfElements = 0;

        String read = sc.next();
        while(!read.equals(stopKeyword)){
            array[numberOfElements] = read;
            numberOfElements++;

            if(numberOfElements == array.length){
                array = Arrays.copyOf(array, array.length *2);
            }
            read = sc.next();
        }

        System.out.println("Number of elements read and stored: " + numberOfElements);
        System.out.println("Array dimension: " + array.length);
        System.out.println("Elements: ");

        for(int i =0; i< numberOfElements;i++){
            System.out.print(array[i] + " ");
        }
    }
}
