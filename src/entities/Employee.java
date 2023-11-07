package entities;

public class Employee { // classe funcionário

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return grossSalary - tax;
    }


    public void increaseSalary(double percentage) {
        double increase;
        increase = (percentage / 100) * grossSalary;
        grossSalary = increase + grossSalary - tax;
    }
}
