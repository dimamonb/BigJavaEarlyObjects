package ch07;

public class Student {
    private double[] scores;
    private int scoresSize;

    public Student(int capacity) {

        this.scores = new double[capacity];
        this.scoresSize = 0;
    }

    public boolean addScore(double score){
        if (scoresSize < scores.length)
        {
            scores[scoresSize] = score;
            scoresSize++;
            return true;
        }
        else
        {
            return false;
        }
    }
    public double finalScore(){
        if(scoresSize == 0) {
            return 0;
        } else {
            return sum() - minimum();
        }
    }

    public double sum(){
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i] ;
        }
        return total;
    }
    public double minimum(){
        double smallest = scores[0];
        for (int i = 0; i < scoresSize; i++) {
            if(scores[i] < smallest){
                smallest = scores[i];
            }
        }
        return smallest;
    }
}
