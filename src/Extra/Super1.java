package Extra;

/*
Super -- it is a keyword
-- it is used to refer immediate parent class,var,method,constructor

super() calls parent constructor

super() must be in first line in constructor
Student(){
    super();
}
super only works with inheritance
-- cannot access private member directly

super and this cannot be first together

helps to avoid variable confusion
--mainly used in method overriding concepts
 */
/*
class Company1{
    int salary=80000;
    void show(){
        System.out.println("I am Parent class....");
    }
    Company1(){
        System.out.println("I am Parent class constructor ....");
    }
}
class Employee1 extends Company1{
    int salary =60000;
    void display(){
        System.out.println("Child class salary "+salary);
        System.out.println("Parent class salary "+super.salary);
    }
    void show(){
        super.show();
        System.out.println("I am Child class....");
    }
    Employee1(){
        System.out.println("I am Child class constructor....");
    }
}
public class Super1 {
    public static void main(String[] args){
        Employee1 e1=new Employee1();
        e1.display();
        e1.show();
    }
}
*/
// Parent class
class House {

    // final variable
    final String country = "India";

    String houseType;

    // constructor
    House(String hType) {

        houseType = hType;

        System.out.println("House Constructor");
    }

    void displayHouse() {

        System.out.println("House Type: " + houseType);
        System.out.println("Country: " + country);
    }
}

// Child class
class Room1 extends House {

    int rooms;

    // constructor using super keyword
    Room1(String hType, int r) {

        super(hType);

        rooms = r;

        System.out.println("Room Constructor");
    }

    void displayRoom() {

        System.out.println("Number of Rooms: " + rooms);
    }
}

public class Super1 {

    public static void main(String[] args) {

        // object calling
        Room1 r1 = new Room1("Bungalow", 5);

        r1.displayHouse();
        r1.displayRoom();
    }
}
