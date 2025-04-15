package org.example;

import java.io.*;
import java.util.Scanner;

public class ReadWriter {
    public static void main(String[] args) {
        System.out.println("** WELCOME TO FILE READER AND WRITER PROGRAM **");
        System.out.println("\n1. Write\n2. Read");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose an activity:");
        int choice = sc.nextInt();
        if(choice == 1) {
            System.out.println("Provide the path of the file you want to read.");
            String path = sc.next();
            System.out.println("Now provide the text: ");
            String text = sc.next();
            writeToFile(path, text);
        } else {

        }
//        writeToFile("files/example.txt", "Lorem ipsum");
//        readFromFile("files/example.txt");
    }

    public static void readFromFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("The file you are trying to read is not available!");
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader bfr = new BufferedReader(fr);
                String line;
                while ((line = bfr.readLine()) != null) {
                    System.out.println(line);
                }
                bfr.close();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(String filePath, String text) {
        try {
            File file = new File(filePath);
//            if (!file.exists()) {
//                file.createNewFile();
//            }
            if (text.length() == 0) {
                System.out.println("No text provided");
            } else {
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bwr = new BufferedWriter(fw);
                bwr.write(text);
                bwr.newLine();
                bwr.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
