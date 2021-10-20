package ch08.pe_10;

import java.util.ArrayList;

public class GradeBook {
    private ArrayList<Student> students;

    public GradeBook(){
        students = new ArrayList<>();
    }


    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(Student student) {
        this.students.add(student);
    }
}
