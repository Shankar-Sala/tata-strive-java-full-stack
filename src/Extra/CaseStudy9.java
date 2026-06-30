package Extra;

/*
DMart wants to develop a Smart Billing & Employee Management System.
manage employee details
manage billing details
display department information
calculate salary
display product list
 */
class DMart{
    static String name="DMart India";
    final String country="India";
    int bonus = 20000;
    static {
        System.out.println("DMart System Started");
    }
    DMart(){
        System.out.println("DMart Constructor");
    }
    void mallDetails(){
        System.out.println("Mall Name: "+name);
        System.out.println("Country Name: "+country);
    }
    void department(){
        System.out.println("General Department");
    }
}
class Employee2 extends DMart{
    String empName;
    int salary = 25000;
    Employee2(String emp){
        empName = emp;
        System.out.println("Employee Constructor");
    }
    void department(){
        super.department();
        System.out.println("Billing Department");
    }
    void employeeDetails(){
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+salary);
        System.out.println("Parent Bonus: "+super.bonus);
    }
}
class Billing2 extends Employee2{
    int totalBill;
    Billing2(String emp ,int bill) {
        super(emp);
        totalBill = bill;
        System.out.println("Billing Constructor");
    }
    void billDetails(){
        System.out.println("Total Bill : "+totalBill);
        if (totalBill>=5000){
            System.out.println("Discount Applied");
        } else {
            System.out.println("No Discount");
        }
    }
    void paymentMode(int choice){
        switch (choice){
            case 1:
                System.out.println("Cash Payment");
                break;
            case 2:
                System.out.println("UPI Payment");
                break;
            case 3:
                System.out.println("Card Payment");
                break;
            case 4:
                System.out.println("Invalid Payment");
                break;
        }
    }
    void productList(){
        String product[]={"Rice","Bread","Soap","Oil"};
        for (int i=0;i< product.length;i++){
            System.out.println("Product: "+product[i]);
        }
    }
    void mallDetails()
    {
         super.mallDetails();
        System.out.println("Welcome To DMart Billing System");
    }
}
public class CaseStudy9 {
    public static void main(String[] args){
        Billing2 b2 = new Billing2("Shabina",6500);
        System.out.println("---------------------------------");
        b2.department();
        System.out.println("---------------------------------");
        b2.employeeDetails();
        System.out.println("---------------------------------");
        b2.billDetails();
        System.out.println("---------------------------------");
        b2.paymentMode(1);
        System.out.println("---------------------------------");
        b2.productList();
        System.out.println("---------------------------------");

        DMart d1 = new Billing2("Shriya",7000);
        d1.department();


    }
}
