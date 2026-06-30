package Extra;/*
/* Explain the diamond problem
* Hybrid inheritance
*
*      A
*     / \
*    B   C
*     \ /
*      D
*
*      DMart
*     /     \
* Billing  Delivery
*     \     /
*     Manager
*
*   Interface               Interface               class
*       |                       |                     |
*    extends               implements              extends
*       |                       |                     |
*   Interface                 class                 class
*
*/
/*
// Parent Interface
interface DMart5 {
    void mallRules();
}

// Child Interface 1
interface Billing3 extends DMart5 {
    void billingSection();
}

// Child Interface 2
interface Delivery2 extends DMart5 {
    void deliverySection();
}

class Manager implements Billing3, Delivery2 {
    String managerName;

    // Constructor
    Manager(String managerName) {
        this.managerName = managerName;
    }

    public void mallRules() {
        System.out.println("Follow DMart Mall Rules");
    }

    public void billingSection() {
        System.out.println("Billing Section managed by: " + managerName);
    }

    public void deliverySection() {
        System.out.println("Delivery Section managed by: " + managerName);
    }
    void managerDetails(){
        System.out.println("Manager Name: " + managerName);
    }
}

public class DiamondProblem {
    public static void main(String args[]) {
        Manager m1 = new Manager("Nisha");
        System.out.println("-------------------------");
        m1.managerDetails();
        System.out.println("-------------------------");
        m1.mallRules();
        System.out.println("-------------------------");
        m1.billingSection();
        System.out.println("-------------------------");
        m1.deliverySection();
        System.out.println("-------------------------");
    }

}
*/

/*
    University
   /          \
Teacher      Student
   \          /
    Department
 */

interface University5 {
    void universityName();
}

// First Interface
interface Teacher extends University5 {
    void subject();
}

// Second Interface
interface Student5 extends University5 {
    void semester();
}

// Implementing Class
class Department5 implements Teacher, Student5 {

    String deptName;

    Department5(String deptName) {
        this.deptName = deptName;
    }

    public void universityName() {
        System.out.println("Welcome to Tata Strive University");
    }

    public void subject() {
        System.out.println("Teacher handles Java Subject");
    }

    public void semester() {
        System.out.println("Students are in 2nd Semester");
    }

    void departmentInfo() {
        System.out.println("Department: " + deptName);
    }
}

public class DiamondProblem {

    public static void main(String args[]) {

        Department5 d1 = new Department5("Computer Science");

        System.out.println("-------------------");
        d1.universityName();

        System.out.println("-------------------");
        d1.departmentInfo();

        System.out.println("-------------------");
        d1.subject();

        System.out.println("-------------------");
        d1.semester();

        System.out.println("-------------------");
    }
}


