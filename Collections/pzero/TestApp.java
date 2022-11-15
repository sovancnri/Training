package pzero;

class Employee{
    String empname;
    double empsalary;
    int yoj;

    public Employee(String empname, double empsalary, int yoj) {
        this.empname = empname;
        this.empsalary = empsalary;
        this.yoj = yoj;
    }

    public String toString() {
        return empname+" "+empsalary+" "+yoj;
    }
}

public class TestApp {
    public static void main(String[] args) {
        Employee empobj = new Employee("Rohan",50000,2015);
        System.out.println(empobj);
    }
}
