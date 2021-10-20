package ch08.pe_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Student {

    public static double[] readInputs() {
        double[] scores = new double[100];
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values, Q to quit:");
        while (scanner.hasNextDouble() && index < scores.length) {
            scores[index] = scanner.nextDouble();
            index++;
        }
        return Arrays.copyOf(scores, index);
    }

    public static double sum(double[] values) {
        double total = 0;
        for (int i = 0; i < values.length; i++) {
            total += values[i];
        }
        return total;
    }

    public static double minimum(double[] values) {
        double smallest = values[0];
        for (int i = 0; i < values.length; i++) {
            if (values[i] < smallest) {
                smallest = values[i];
            }
        }
        return smallest;
    }

    public static double finalScore(double[] values) {
        if (values.length == 0) {
            return 0;
        } else if (values.length == 1) {
            return values[0];
        } else {
            return sum(values) - minimum(values);
        }
    }

    public static void readStudentsAndScores(ArrayList<String> students, ArrayList<Double> finalScores) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please students, Q to quit:");
        String studentName = "";
        while (!(studentName = in.next()).equalsIgnoreCase("q")) {
            students.add(studentName);
            double fs = finalScore(readInputs());
            finalScores.add(fs);
        }
    }
}
