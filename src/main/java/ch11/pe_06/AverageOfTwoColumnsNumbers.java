package ch11.pe_06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfTwoColumnsNumbers {
    static String INPUT;

    public static void main(String[] args) {

        if (args.length == 0) {
            Scanner enterFileName = new Scanner(System.in);
            System.out.print("Enter File name: ");
            INPUT = enterFileName.nextLine();
        } else {
            INPUT = args[0];
        }

        ArrayList<Double> left = new ArrayList<>();
        ArrayList<Double> right = new ArrayList<>();

        File inFile = new File(INPUT);
        try (Scanner in = new Scanner(inFile)) {

            while (in.hasNextLine()) {
                    String[] str = in.nextLine().split("\\s+");

                    Double line1 = Double.parseDouble(str[0]);
                    System.out.println(line1);
                    left.add(line1);

                    Double line2 = Double.parseDouble(str[1]);
                    System.out.println(line2);
                    right.add(line2);
                }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double leftSum = left.stream().mapToDouble(Double::doubleValue).sum();
        double rightSum = right.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println("Avg left: " + leftSum/left.size());
        System.out.println("Avg right: " + rightSum/right.size());
    }
}
