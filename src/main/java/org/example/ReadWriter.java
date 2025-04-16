package org.example;

import java.io.*;
import java.util.Scanner;

public class ReadWriter {
    public static void main(String[] args) {
        System.out.println("** WELCOME TO FILE READER AND WRITER PROGRAM **");
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Write\n2. Read\nChoose an activity:");
        
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            System.out.println("Provide the path of the file:");
            String path = sc.nextLine();
            System.out.println("Now provide the text:");
            String text = sc.nextLine();
            writeToFile(path, text);
        } else if (choice == 2) {
            System.out.println("Provide the path of the file to read:");
            String path = sc.nextLine();
            readFromFile(path);
        } else {
            System.out.println("Invalid option selected.");
        }
    }

    public static void readFromFile(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("The file does not exist.");
                return;
            }
            BufferedReader bfr = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
            bfr.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }

    public static void writeToFile(String filePath, String text) {
        try {
            if (text.isEmpty()) {
                System.out.println("No text provided.");
                return;
            }
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bwr = new BufferedWriter(fw);
            bwr.write(text);
            bwr.newLine();
            bwr.close();
            System.out.println("Text written successfully.");
        } catch (IOException ex) {
            System.out.println("Error writing to the file: " + ex.getMessage());
        }
    }
}

