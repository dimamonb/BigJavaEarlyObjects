package ch10.pe_02;

import ch10.pe_01.Measurable;

public class Quiz implements Measurable {
    private double score;
    private String letterScore;

    public Quiz() {
    }

    public Quiz(double score) {
        this.score = score;
        // this.letterScore = letterScore;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getLetterScore() {
        if (score >= 90) {
            letterScore = "A";
        } else if (score < 90 && score >= 87) {
            letterScore = "B+";
        } else if (score < 87 && score >= 80) {
            letterScore = "B";
        } else if (score < 80 && score >= 77) {
            letterScore = "C+";
        } else if (score < 77 && score >= 70) {
            letterScore = "C";
        } else if (score < 70 && score >= 67) {
            letterScore = "D+";
        } else if (score < 67 && score >= 60) {
            letterScore = "D";
        } else if (score < 60 && score >= 0) {
            letterScore = "F";
        }
        return letterScore;
    }

    public void setLetterScore(String letterScore) {
        this.letterScore = letterScore;
    }

    @Override
    public double getMeasure() {
        return score;
    }
}
