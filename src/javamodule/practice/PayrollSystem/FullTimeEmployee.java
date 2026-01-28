package javamodule.practice.PayrollSystem;

public class FullTimeEmployee extends Employee {
    private int baseSalary;
    private int bonus;

    public FullTimeEmployee(String name, int baseSalary, int bonus) {
        super(name);
        setBaseSalary(baseSalary);
        setBonus(bonus);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new InvalidPayrollDataException("Base salary cannot be negative or zero");
        this.baseSalary = baseSalary;
    }

    public void setBonus(int bonus) {
        if (bonus < 0) throw new InvalidPayrollDataException("Bonus cannot be negative");
        this.bonus = bonus;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getBonus() {
        return bonus;
    }

    private String getClassName() {
        return "Full time employee";
    }

    @Override
    public int calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public String toString() {
        return "Employee details:\n"+"\tID: "+super.getId()+"\n"+"\tType: "+getClassName()+"\n"+"\tBase Salary: "+getBaseSalary()+"\n"+"\tBonus: "+getBonus()+"\n"+"\tSalary: "+calculateSalary();
    }
}
