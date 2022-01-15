package ch11.pe_04;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {
    static final String INPUT = "src/main/java/ch11/pe_04/file_in.txt";
    static final String OUTPUT = "src/main/java/ch11/pe_04/file_out.txt";
    public static void main(String[] args) {

        File inFile = new File(INPUT);
        try (Scanner in = new Scanner(inFile);PrintWriter outFile = new PrintWriter(OUTPUT)) {
            int count = 1;
            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);
                if(!line.isBlank()) {
                    outFile.printf("/* %d */ %s\n", count, line.trim());
                }
                count++;
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
