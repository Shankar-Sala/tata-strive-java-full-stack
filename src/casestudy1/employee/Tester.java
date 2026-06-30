package casestudy1.employee;


public class Tester extends Employee {

    public Tester(String name, double salary) throws Exception {
        super(name, salary);
    }

    @Override
    public void displayRole() {
        System.out.println("Role : Tester");
    }

    @Override
    public void workHours() {
        System.out.println("Tester Work Hours: 10 AM - 7 PM");
    }

    @Override
    public void leavePolicy() {
        System.out.println("Tester Leave Policy: 20 leaves/year");
    }
}
