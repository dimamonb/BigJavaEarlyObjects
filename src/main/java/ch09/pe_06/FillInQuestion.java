package ch09.pe_06;

import ch09.Question;

public class FillInQuestion extends Question {
    @Override
    public void setText(String questionText) {
        super.setText(questionText+"_____");
    }
}
