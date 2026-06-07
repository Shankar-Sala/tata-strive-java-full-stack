package basic_code;


/*      Dmart
*        /   \
*   Billing   Delivery
*       \        /
*        Manager
*
*       interface                    interface                class
*               extends                   implements                extends
*       interface                     class                   class
*
*
* */

//Parent Interface
interface  Dmart2{

}
//child Interface
interface Billing2 extends Dmart2{

}

interface Delivery extends Dmart2{

}
class Manager implements Billing2, Delivery{
    String managerName;
    //constructor
    Manager(String managerName){
        this.managerName = managerName;
    }

    public void mallRules(){
        System.out.println("Follow Dmart Mall Rules");
    }
    public  void billingSection(){
        System.out.println("Billing Managed by: "+managerName);
    }

    public void deliverySection(){
        System.out.println("Delivery Managed by : "+ managerName);
    }

    void managerDetails(){
        System.out.println("Manager Name : "+ managerName);
    }
}
public class Interference {
    static void main(String[] args) {
        Manager m1 =new Manager("Shankar");
        System.out.println("--------------------");
        m1.managerDetails();
        System.out.println("--------------------");
        m1.mallRules();
        System.out.println("--------------------");
        m1.billingSection();
        System.out.println("--------------------");
        m1.deliverySection();
        System.out.println("--------------------");
    }
}
