package ch11.pe_02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {
    static final String INPUT = "src/main/java/ch11/pe_02/file_in.txt";
    static final String OUTPUT = "src/main/java/ch11/pe_02/file_out.txt";
    public static void main(String[] args) {

        File inFile = new File(INPUT);
        try (Scanner in = new Scanner(inFile);PrintWriter outFile = new PrintWriter(OUTPUT)) {
            while (in.hasNext()) {
                String line = in.nextLine();
                System.out.println(line);
                if(!line.isBlank()) {
                    outFile.println(line.trim());
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
