package ch11.pe_05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileInOut {
    static final String INPUT = "src/main/java/ch11/pe_04/file_in.txt";
    static String OUTPUT;
    public static void main(String[] args) {

        if(args.length == 0) {
            Scanner enterFileName = new Scanner(System.in);
            System.out.print("Enter File name: ");
            OUTPUT = enterFileName.nextLine();
        } else {
            OUTPUT = args[0];
        }
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
