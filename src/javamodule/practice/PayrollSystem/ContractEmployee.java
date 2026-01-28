package javamodule.practice.PayrollSystem;

public class ContractEmployee extends Employee {
    private int hourlyRate;
    private int hoursWorked;

    public ContractEmployee(String name, int hourlyRate, int hoursWorked) {
        super(name);
        setHourlyRate(hourlyRate);
        setHoursWorked(hoursWorked);
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new InvalidPayrollDataException("Hourly rate cannot be zero or negative");
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        if (hoursWorked < 0) throw new InvalidPayrollDataException("Hours worked cannot be negative");
        this.hoursWorked = hoursWorked;
    }

    private String getClassName() {
        return "Contact Employee";
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public int calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public String toString() {
        return "Employee details:\n"+"\tID: "+super.getId()+"\n"+"\tType: "+getClassName()+"\n"+"\tHourly Rate: "+getHourlyRate()+"\n"+"\tHours Worked: "+getHoursWorked()+"\n"+"\tSalary: "+calculateSalary();
    }
}
