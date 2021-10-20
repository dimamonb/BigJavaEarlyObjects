package ch08.pe_09;

import java.util.ArrayList;

public class ScoreAnalyzer {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        ArrayList<Double> finalScores = new ArrayList<>();

        Student.readStudentsAndScores(students, finalScores);

        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + students.get(i) + " Final score: " + finalScores.get(i));
        }
    }
}
