package casestudy1.employee;

public class Developer extends Employee {

    public Developer(String name, double salary) throws Exception {
        super(name, salary);
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Developer");
    }

    @Override
    public void workHours() {
        System.out.println("Developer Work Hours: 9 AM - 6 PM");
    }

    @Override
    public void leavePolicy() {
        System.out.println("Developer Leave Policy: 24 leaves/year");
    }
}