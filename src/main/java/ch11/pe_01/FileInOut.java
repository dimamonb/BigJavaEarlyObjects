package ch11.pe_01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {
    public static void main(String[] args) {

        try (PrintWriter out = new PrintWriter("src/main/java/ch11/pe_01/file_in.txt")) {
            out.println("Some useful text");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        File inFile = new File("src/main/java/ch11/pe_01/file_in.txt");
        try (Scanner in = new Scanner(inFile)) {
            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
