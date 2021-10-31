package ch09.pe_12;

public class Student extends Person {
    private String major;

    public Student(String name, int birthYear) {
        super(name, birthYear);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "major='" + major + '\'' +
                '}';
    }
}
