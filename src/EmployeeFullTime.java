public class EmployeeFullTime extends Employee {
    private double bonus;
    private double punishment;
    private double salary;

    public EmployeeFullTime(){}

    public EmployeeFullTime(double bonus, double punishment,double salary) {
        this.bonus=bonus;
        this.punishment = punishment;
        this.salary=salary;
    }

    public EmployeeFullTime(int employeeId, String empName, int empAge, String phoneNumber, String email, double bonus, double punishment, double salary) {
        super(employeeId, empName, empAge, phoneNumber, email);
        this.bonus = bonus;
        this.punishment = punishment;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPunishment() {
        return punishment;
    }

    public void setPunishment(double punishment) {
        this.punishment = punishment;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double calSalary(){
        double realSalary= getSalary()+(getBonus()-getPunishment());
        return  realSalary;
    }

    @Override
    public String toString() {
        return super.toString() +
                "bonus=" + bonus +
                ", punishment=" + punishment +
                ", salary=" + salary
                ;
    }
}
