package ch09.pe_05;

import ch09.Question;

public class NumericQuestion extends Question {
    private double numericAnswer;

    public void setNumericAnswer(double numericAnswer) {
        this.numericAnswer = numericAnswer;
    }

    @Override
    public boolean checkAnswer(String response) { //ToDo Program not working as expected. May be I should use BigDecimal

        final double percision = 0.01;

        double numbersDiff = Math.abs(Double.parseDouble(response) - numericAnswer);
        if (Math.abs(numbersDiff - percision)<= percision) {
            return true;
        } else {
            return false;
        }
    }
}
