package ch09.pe_01;

public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalaryWithBonus(){
        return super.getBaseSalary() + bonus;
    }
}
