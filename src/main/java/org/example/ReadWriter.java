package org.example;

import java.io.*;

public class ReadWriter {
    public static void main(String[] args) {
        readFromFile("files/example.txt");
        writeToFile("files/file2.txt", "Lorem ipsum");
    }

    public static void readFromFile(String filePath) {
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);
            String line;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
            bfr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void writeToFile(String filePath, String text) {
        try {
            File file = new File(filePath);
            FileWriter fw = new FileWriter(file);
            BufferedWriter bwr = new BufferedWriter(fw);
            bwr.write(text);
            bwr.newLine();
            bwr.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
