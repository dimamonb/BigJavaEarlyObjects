package ch09;

import ch09.pe_05.NumericQuestion;
import ch09.pe_06.FillInQuestion;

public class QuestionDemo5 {
    public static void main(String[] args) {
//        Question first = new Question();
//        first.setText("What was the original name of the Java language?");
//        first.setAnswer("Oak");
//
//        ChoiceQuestion second = new ChoiceQuestion();
//        second.setText("In which country was the inventor of Java born?");
//        second.addChoice("Australia", false);
//        second.addChoice("Canada", true);
//        second.addChoice("Denmark", false);
//        second.addChoice("United States", false);
//
//
//        NumericQuestion third = new NumericQuestion();
//        third.setText("I don`t know what to ask here:");
//        third.setNumericAnswer(25.36);

        FillInQuestion forth = new FillInQuestion();
        forth.setText("The inventor of Java was");
        forth.setAnswer("James Gosling");

//        first.presentQuestion();
//        second.presentQuestion();
//        third.presentQuestion();
        forth.presentQuestion();
    }

}
