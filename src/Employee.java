public abstract class Employee implements Comparable<Employee> {
    private int employeeId;
    private String empName;
    private int empAge;
    private String phoneNumber;
    private String email;

    public Employee(){
    }

    public Employee(int employeeId, String empName, int empAge, String phoneNumber, String email) {
        this.employeeId = employeeId;
        this.empName = empName;
        this.empAge = empAge;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public abstract double calSalary();

    public int compareTo(Employee o){
        double com=  (this.calSalary()- o.calSalary());
        return (int) com;
    }
    @Override
    public String toString() {
        return "Employee" +
                "employeeId=" + getEmployeeId() +
                ", empName='" + getEmpName() + '\'' +
                ", empAge=" + getEmpAge() +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", email='" + getEmail() + '\''
                ;
    }
}
