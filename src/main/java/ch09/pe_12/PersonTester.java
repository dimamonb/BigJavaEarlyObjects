package ch09.pe_12;

public class PersonTester {
    public static void main(String[] args) {
        Person person = new Person("Maksim", 1978);
        System.out.println(person.getBirthYear());
        System.out.println(person.getName());
        System.out.println(person);

        System.out.println();

        Student student = new Student("Vova", 1985);
        student.setMajor("Biologist");
        System.out.println(student.getName());
        System.out.println(student.getBirthYear());
        System.out.println(student);
    }
}
