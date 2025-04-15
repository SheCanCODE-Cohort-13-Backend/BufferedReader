package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br;
        try {
            File file1 = new File("files/example.txt");
            System.out.println("File exists at location: " + file1.getAbsolutePath());
            FileReader fr = new FileReader(file1);
            /* Using the filereader itself will give you the content of the file character by character */
//            int character;
//            while ((character = fr.read()) != -1) {
//                System.out.println((char) character);
//            }

            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
//            br.close();
        }
    }
}