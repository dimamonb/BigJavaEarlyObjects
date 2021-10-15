package ch07;

import java.util.Arrays;

public class AdaptAlgoritm {

    public static void main(String[] args) {
        double[] scores = new double[]{8, 7, 8.5, 9.5, 7, 4, 10};

        //Original algoritm
        double smallest = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] < smallest){
                smallest = scores[i];
            }
        }
        System.out.println("Smallest: " + smallest);

        int smallestPosition = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] < scores[smallestPosition]){
                smallestPosition = i;
            }
        }
        System.out.println("Smallest position: " + smallestPosition);

        scores[smallestPosition] = scores[scores.length - 1];

        System.out.println(Arrays.toString(scores));
    }
}
