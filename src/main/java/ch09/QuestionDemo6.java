package ch09;

import ch09.pe_05.NumericQuestion;
import ch09.pe_06.FillInQuestion;
import ch09.pe_08.AnyCorrectChoiceQuestion;

public class QuestionDemo6 {
    public static void main(String[] args) {
        Question first = new Question();
        first.setText("What was the original name of the Java language?");
        first.setAnswer("Oak");

        ChoiceQuestion second = new ChoiceQuestion();
        second.setText("In which country was the inventor of Java born?");
        second.addChoice("Australia", false);
        second.addChoice("Canada", true);
        second.addChoice("Denmark", false);
        second.addChoice("United States", false);


        NumericQuestion third = new NumericQuestion();
        third.setText("I don`t know what to ask here:");
        third.setNumericAnswer(25.36);

        FillInQuestion forth = new FillInQuestion();
        forth.setText("The inventor of Java was");
        forth.setAnswer("James Gosling");

        AnyCorrectChoiceQuestion fifth = new AnyCorrectChoiceQuestion();
        fifth.setText("Which of the following reserved words in java");
        fifth.addChoice("break", true);
        fifth.addChoice("start", false);
        fifth.addChoice("milk", false);
        fifth.addChoice("static", true);
        fifth.addChoice("long", true);

        second.presentQuestion();
        third.presentQuestion();
        forth.presentQuestion();
        fifth.presentQuestion();
    }

}
