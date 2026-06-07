package basic_code;

public class Object1 {
    //instance variable
    // data member
    String name;
    int marks1, marks2, marks3;

    // method defination or method declaration
    void calculateTotal() {
        int total = marks1 + marks2 + marks3;
        System.out.println("Total Marks: " + total);

    }

    void display() {
        System.out.println("Learners Name: " + name);
    }

    public static void main(String args[]) {
        // classname objectname=new classname();
        Object1 obj1 = new Object1();
        obj1.name = "Sonam";
        obj1.marks1 = 70;
        obj1.marks2 = 40;
        obj1.marks3 = 90;

        obj1.calculateTotal();//method calling...
        obj1.display();

    }
}
