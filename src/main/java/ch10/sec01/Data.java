package ch10.sec01;

import ch10.sec01.Measurable;

public class Data {
    public static double average(Measurable[] objects) {
        double sum = 0;
        for (Measurable obj: objects) {
            sum = sum + obj.getMeasure();
        }
        if(objects.length > 0){
            return sum / objects.length;
        } else {
            return  0;
        }
    }
}
