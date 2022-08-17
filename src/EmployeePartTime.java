public class EmployeePartTime extends Employee{
    private int hourWork;

    public EmployeePartTime(){}
    public EmployeePartTime(int hourWork){
        this.hourWork=hourWork;
    }

    public EmployeePartTime(int employeeId, String empName, int empAge, String phoneNumber, String email, int hourWork) {
        super(employeeId, empName, empAge, phoneNumber, email);
        this.hourWork = hourWork;
    }

    public double getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }
    public double calSalary(){
        double realSalary= getHourWork()*100000.0;
        return  realSalary;
    }

    @Override
    public String toString() {
        return super.toString()+
                "hourWork=" + hourWork
                ;
    }
}
