package casestudy1.employee;

public abstract class Employee implements CompanyPolicy {

    protected int empId;
    protected String name;
    protected double salary;

    private static int counter = 1000;

    public static final String COMPANY_NAME = "TCS";

    public Employee() {
        this.empId = ++counter;
        this.name = "Unknown";
        this.salary = 0;
    }

    public Employee(String name, double salary) throws Exception {
        this.empId = ++counter;
        this.name = name;

        if (salary < 0) {
            throw new Exception("Salary cannot be negative!");
        }

        this.salary = salary;
    }

    public void displayEmployee() {
        System.out.println("Company : " + COMPANY_NAME);
        System.out.println("Employee ID : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public abstract void displayRole();
}