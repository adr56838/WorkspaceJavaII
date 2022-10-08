package devmindJava.Curs30.I.O.FluxulDeIntrareIesire;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    // we simulate the data coming from the application
    private static String[] getData() {
        String[] cities =  {"London", "Bucharest", "Berlin", "Moscow"};
        return cities;
    }

    public static void main(String[] args) throws IOException {
        String[] dataToWrite = getData();

        // I. open the file (for writing)
        // Note: if the file does not exist, it is created automatically
        FileWriter outputFile = new FileWriter("output.txt");

        // II. Write the data to file
        for (String city : dataToWrite) {
            outputFile.write(city + " ");
        }

        // III. Close the file afterwards
        outputFile.close();
    }
}
