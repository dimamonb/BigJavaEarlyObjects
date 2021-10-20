package ch08.pe_10;

import java.util.ArrayList;
import java.util.Scanner;

public class ScoreAnalyzer {
    public static void main(String[] args) {
        String studentName = "";
        GradeBook gradeBook = new GradeBook();

        while (true){
            Scanner in = new Scanner(System.in); //May be create new Scanner in loop is not good idea
            System.out.println("Please enter student name");
            studentName = in.next();
            if(studentName.equalsIgnoreCase("q")) {break;}
            Student student = new Student(100, studentName);

            System.out.println("Please enter values, Q to quit:");
            while (in.hasNextDouble()) {
                student.addScore(in.nextDouble());
            }
            gradeBook.setStudents(student);
        }

        ArrayList<Student> studentArrayList = gradeBook.getStudents();
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            if( student == null){
                System.out.println("NO STUDENTS");
                return;
            }
            System.out.println("Student: " + student.getStudentName() + " Final score: " + student.finalScore());
        }
    }
}
