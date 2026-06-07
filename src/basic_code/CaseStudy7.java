package basic_code;

/* problem Statement
DMart wants to develop a smart billing & Employee management system

manage employee details
manage biling details
diplay department information
calculate salary
display product list
* */


class Dmart{
    static String mallName = "Dmart India";
    final String country = "India";

    int bonus= 10000;
    static{
        System.out.println("Dmart System Started....!");
    }

    Dmart(){
        System.out.println("Dmart Constructor3");
    }

    void mallDeatils(){
        System.out.println("Mall Name: "+ mallName);
        System.out.println("Country :"+ country);
    }

    void department(){
        System.out.println("General Department");
    }

}

class Employees extends Dmart{
    String empName;
    int salary = 25000;

    Employees(String emp){
        empName = emp;
        System.out.println("Employee Constructor3");
    }

    // note : in two class method same then it is overriding
    void department()
    {
      super.department();
        System.out.println("Biling Department");
    }

    void employeeDetails(){
        System.out.println("Employee Name: "+ empName);
        System.out.println("Employee Salary: "+ salary);
        System.out.println("Parent Bonus :"+super.bonus);
    }
}

class Billing22 extends Employees{
    int totalBill;
    Billing22(String emp, int bill){
        super(emp);
        totalBill = bill;
        System.out.println("Biling Constructor3");
    }

    void billDeatils(){
        System.out.println("Total Bill: "+totalBill);
        if(totalBill >= 5000){
            System.out.println("Discount Applied");
        }else{
            System.out.println("No discount");
        }
    }

    void paymentMode(int choice){
        switch(choice){
            case 1:
                System.out.println("Cash Payment");
                break;
            case 2:
                System.out.println("UPI Payment");
                break;
            case 3:
                System.out.println("Card Payment");
                break;
            default:
                System.out.println("Invalid Payment");

        }
    }

   void productList(){
        String product[] = {"Rice", "Soap", "Oil", "Biscuits"};
       System.out.println("Products: ");
       for(int i=0; i< product.length; i++){
           System.out.println(product[i]);
       }
   }

    void mallDetails(){
        super.mallDeatils();
        System.out.println("welcome to Dmart Biling system ");
    }
}

public class CaseStudy7 {
    public static void main() {
        {
            Billing22 b1 = new Billing22("Rahul", 6500);
            System.out.println("-------------------------");
            b1.department();
            System.out.println("-------------------------");
            b1.employeeDetails();
            System.out.println("-------------------------");
            b1.billDeatils();
            System.out.println("-------------------------");
            b1.paymentMode(1);
            System.out.println("-------------------------");
            b1.productList();
            System.out.println("-------------------------");

            //upcasting
            Dmart dd1 = new Billing22("Shankar",45000);
            dd1.department();
            System.out.println("-------------------------");
            System.out.println("-------------------------");
            //static variable access
            System.out.println("Mall Name :"+ Dmart.mallName);

        }
    }
}
