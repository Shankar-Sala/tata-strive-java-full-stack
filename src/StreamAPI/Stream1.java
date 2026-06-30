package StreamAPI;
//java 8 concept
import java.util.ArrayList;

@FunctionalInterface
interface EmployeeService{
    //abstract method
    void display(String name);

    //default method
    default void message(){
        System.out.println("Welcome to Tata Strive");
    }

    // static method
    static void company(){
        System.out.println("Company : Tata Strive");
    }
}

class Employee{
    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getSalary(){
        return salary;
    }

}

public class Stream1 {
    public static void main() {
       EmployeeService e = (name) -> System.out.println("Hello "+name);
       e.display("Shankar");
       e.message();
       EmployeeService.company();
       //collection ---> list --- interface --- ArrayList -- class
        ArrayList<Employee>  list = new ArrayList<>();
        list.add(new Employee(101, "Rahul", 25000));
        list.add(new Employee(102, "neha", 256000));
        list.add(new Employee(101, "Raju", 257000));
        list.add(new Employee(101, "amit", 250800));
        list.stream().filter(emp ->emp.getSalary() > 30000).forEach(emp-> System.out.println(emp.getId()+ " "+ emp.getSalary()));

    }
}
