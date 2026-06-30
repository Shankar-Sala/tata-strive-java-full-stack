package Extra;

/*
---interface
---Interface created using interface keyword
---Interface provides 100% abstraction
---Methods inside interface are public & abstract by default
---Variables inside interface are public static final
---Cannot create object of interface---Interface supports multiple inheritance
---Class uses implements keyword
---Child class must override interface methods
---Has no Constructor
---No normal(non-abstract)methods
---Use for Flexibility
---Mainly use for Security
---Interface widely used in Spring Boot
---Interface supports runtime polymorphism
---Interface used for loose coupling
syntax
interface A
{
int a=9000;
void show();
}
interface Building
{
}
---why---?
---to achieve security
---100% abstraction
---only abstract method allowed.
---JDK 8 feature in interface
--we can declare default & static method also...
 */
/*
interface Payment{
    //Abstract Method
    void makePayment();
}

class UPI implements Payment{
    public void makePayment(){
        System.out.println("UPI Payment Successful");
    }
}

class CardPayment implements Payment{
    public void makePayment(){
        System.out.println("Card Payment Successful");
    }
}

public class Interface1 {
    public static void main(String[] args){
        UPI u1 = new UPI();
        u1.makePayment();

        CardPayment c1 = new CardPayment();
        c1.makePayment();
    }
}
*/
/*
interface Billing1{
    void billingSection();
}
interface Delivery {
    // Abstract Method
    void deliverySection();
}

//child class
class Employee8 implements Billing1, Delivery {
    String empName;

    Employee8(String empName) {
        this.empName = empName;
    }

    // Overriding Method
    public void billingSection() {
        System.out.println("Billing Handled By : " + empName);
        System.out.println("Product Billing Completed");
    }

    // Overriding Method
    public void deliverySection() {
        System.out.println("Delivery Managed By : " + empName);
        System.out.println("Order Delivered Successfully");
    }

    // Normal Method
    void employeeDetails() {
        System.out.println("Employee Name : " + empName);
    }
}
public class Interface1 {
    public static void main(String[] args){
        Employee8 e1 = new Employee8("Shabina");
        e1.employeeDetails();
        e1.billingSection();
        e1.deliverySection();
    }
}
*/
interface Billing10 {
    // public static final by default
    String storeName = "DMart";

    // Methods are public abstract by default
    void generateBill();
}

interface Delivery10 {
    void deliverOrder();
}

class StoreManager implements Billing10, Delivery10 {
    String managerName;

    StoreManager(String managerName) {
        this.managerName = managerName;
    }

    // Must override interface methods
    public void generateBill() {
        System.out.println("Bill Generated");
    }

    // Must override interface methods
    public void deliverOrder() {
        System.out.println("Order Delivered");
    }

    void managerDetails() {
        System.out.println("Manager : " + managerName);
    }

    void storeInfo() {
        System.out.println("Store : " + storeName);
    }
}
public class Interface1 {
    public static void main(String[] args){
        StoreManager s1 = new StoreManager("Shabina");
        s1.storeInfo();
        s1.managerDetails();
        s1.deliverOrder();
        s1.generateBill();

        Billing10 b10 = new StoreManager("Shriya");
        b10.generateBill();

        Delivery10 d10 = new StoreManager("Saira");
        d10.deliverOrder();
    }
}