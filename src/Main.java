import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        EmployeeFullTime e1 = new EmployeeFullTime(1, "Hoang", 20, "04354666", "hoang@gmai.com", 200000.0, 100000.0, 8000000.0);
        EmployeeFullTime e2 = new EmployeeFullTime(2, "Hieu", 29, "09930046", "hieu@gmai.com", 300000.0, 500000.0, 9000000.0);
        EmployeeFullTime e3 = new EmployeeFullTime(3, "Giang", 23, "09428476", "truonggiang@gmai.com", 500000.0, 800000.0, 1100000.0);

        EmployeePartTime e4 = new EmployeePartTime(4, "Hang", 22, "04884993", "hangcutepro@gmail.com", 15);
        EmployeePartTime e5 = new EmployeePartTime(5, "Linh", 23, "09488377", "linhbun@gmail.com", 26);
        EmployeePartTime e6 = new EmployeePartTime(6, "Trung", 27, "0454543", "trungayt@gmail.com", 25);

        Employee[] emlList = {e1, e2, e3, e4, e5, e6};
        for (Employee e : emlList
        ) {
            System.out.println("realSalary which employee will get:" + e.calSalary());
        }
        //average salary of employee
        double ave = 0;
        double sum = 0;
        int size = emlList.length;
        for (Employee e : emlList
        ) {
            sum += e.calSalary();
            ave = sum / size;
        }
        System.out.println("The Average salary of employee " + ave);

        //list EmployeeFullTime  have salary smaller than average

        for (Employee e : emlList
        ) {
            if (e instanceof EmployeeFullTime && e.calSalary() < ave) {
                System.out.println("The employee full time have salary smaller than average is: " + e.getEmpName());
            }
        }

        //Sum salary must be pay for Employee part time
        double totalSum = 0;
        for (Employee e : emlList
        ) {
            if (e instanceof EmployeePartTime) {
                totalSum += e.calSalary();
            }
        }
        System.out.println("The total Sum must be paid for Employee part time: " + totalSum);

//Sort salary Employee FullTime according to increasing
        Arrays.sort(emlList);
        for (Employee e : emlList
        ) {
            if (e instanceof EmployeeFullTime) {
                System.out.println("salary Employee FullTime according to increasing" + e);
            }
        }
    }
}
