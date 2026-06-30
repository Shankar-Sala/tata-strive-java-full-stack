package Aggregation;

class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }
}

class Employee {
    String empName;
    Department dept;

    Employee(String empName, Department dept) {
        this.empName = empName;
        this.dept = dept;
    }

    void display() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Department: " + dept.deptName);
    }
}

public class AggregationExample1 {
    public static void main(String[] args) {
        Department d1 = new Department("IT");

        Employee e1 = new Employee("Shankar", d1);

        e1.display();
    }
}