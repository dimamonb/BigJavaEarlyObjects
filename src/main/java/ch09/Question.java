package ch09;

import java.util.Scanner;

public class Question {
    private String text;
    private String answer;

    public Question() {
        this.text = "";
        this.answer = "";
    }

    public void setText(String questionText) {
        this.text = questionText;
    }

    public void setAnswer(String correctResponse) {
        this.answer = correctResponse;
    }

    public boolean checkAnswer(String response) {
        return response.equals(answer);
    }

    public void display() {
        System.out.println(text);
    }

    public void presentQuestion() {
        display();
        System.out.print("Your answer: ");
        Scanner in = new Scanner(System.in);
        String response = in.nextLine();
        System.out.println(checkAnswer(response));
    }

}
