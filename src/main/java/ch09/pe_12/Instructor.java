package ch09.pe_12;

public class Instructor extends Person {

    private double salary;

    public Instructor(String name, int birthYear) {
        super(name, birthYear);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                '}';
    }
}
