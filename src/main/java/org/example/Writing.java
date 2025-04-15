package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void main(String[] args) {
        try {
            File f = new File("files/file2.txt");
            if (!f.exists()) {
                f.createNewFile();
            } else {
                System.out.println("String writting...");
                FileWriter fw = new FileWriter(f);
                BufferedWriter brw = new BufferedWriter(fw);
                System.out.println("Writting...");
                brw.write("1. Ndayishimiye");
                brw.newLine();
                brw.write("2. Alice");
                brw.newLine();
                brw.write("3. Micheline");
                brw.newLine();
                brw.newLine();
                brw.write("4. Aline");
                brw.newLine();
                brw.close();
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
