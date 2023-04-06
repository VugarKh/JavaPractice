package practice;

import java.io.*;
import java.util.*;

public class ReadFile {
    public static void main(String [] arg) throws Exception {

        FileReader file = new FileReader("src/practice/text.txt");
        BufferedReader read = new BufferedReader(file);

        System.out.println(read.readLine());
        System.out.println(read.readLine());
        System.out.println(read.readLine());
        System.out.println(read.readLine());


        System.out.println("===================================");


        Scanner scan = new Scanner(new FileReader("src/practice/text.txt"));
        while (scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }

        FileWriter file2 = new FileWriter("src/practice/textToWrite.txt");
        BufferedWriter writer = new BufferedWriter(file2);

        writer.write("Azerbaijan" );
        writer.write("\nBaku");

        writer.close();


    }
}
