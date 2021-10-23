package ch09.pe_01;

public class ManagerTester {
    public static void main(String[] args) {
        Manager manager = new Manager(2369.00);

        manager.setName("Maxim");
        manager.setBaseSalary(25000.00);
        System.out.println("Manager " + manager.getName() + " and his salary with bonus: " + manager.getSalaryWithBonus());
    }
}
