package ch09.pe_08;

import ch09.ChoiceQuestion;
import ch09.Question;

import java.util.ArrayList;

public class AnyCorrectChoiceQuestion extends ChoiceQuestion {
    private ArrayList<Integer> correctChoices;
    private Integer correctChoiceIdx;

    public AnyCorrectChoiceQuestion() {
        correctChoices = new ArrayList<>();
        correctChoiceIdx = 0;
    }

    @Override
    public void addChoice(String choice, boolean correct) {
        super.addChoice(choice, correct);
        correctChoiceIdx++;
        if (correct) {

            correctChoices.add(correctChoiceIdx);
        }
    }

    @Override
    public boolean checkAnswer(String response) {
        if (correctChoices.contains(Integer.valueOf(response))) {
            return true;
        } else {
            return false;
        }
    }
}
