package ch10.pe_02;

import ch10.pe_01.Measurable;

public class QuizTester {
    public static void main(String[] args) {
       Measurable[] quizes = new Measurable[5];
       quizes[0] = new Quiz(98);
       quizes[1] = new Quiz(88);
       quizes[2] = new Quiz(64);
       quizes[3] = new Quiz(79);
       quizes[4] = new Quiz(53);

       double averageScore = Data.average(quizes);
       Quiz min = (Quiz) Data.minimalScore(quizes);
       Quiz max = (Quiz) Data.maxScore(quizes);

        System.out.println("Average: " + averageScore);
        System.out.println("Minimum score: " + min.getScore() + "\n" + "Minimum letter: " + min.getLetterScore());
        System.out.println("Maximum score: " + max.getScore() + "\n" + "Maximum letter: " + max.getLetterScore());

    }
}
