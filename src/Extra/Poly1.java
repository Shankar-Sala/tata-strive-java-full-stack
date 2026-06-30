package Extra;/*
PolyMorphism in Java
--means many form
--one thing/method -- can be in many form
2 Types - Method Overloading -- compile ---static
        - Method Overriding -- Run -- Dynamic

        Method Overloading -- same class - same method name - but list of parameter different

        Method Overriding -- inheritance compulsory -- method name same -- list of parameter also same
                          -- but different class
 */
/*
// Method Overloading
class Calculate {
    // Method with 2 parameters
    void add(int a, int b) {
        System.out.println(a + b);
    }

    // Method with 3 parameters
    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // Method with 4 parameters
    void add(int a, int b, int c, int d) {
        // Note: The image shows (a * b + c + d)
        System.out.println(a * b + c + d);
    }
}

public class Poly1 {
    public static void main(String args[]) {
        Calculate c1 = new Calculate();
        c1.add(12, 12);       // Calls 2-parameter version (Output: 24)
        c1.add(12, 12, 1);    // Calls 3-parameter version (Output: 25)
        c1.add(2, 3, 3, 4);   // Calls 4-parameter version (Output: 13)
    }
}
*/
/*
// Method Overriding
class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Bark");
    }
}
public class Poly1 {
    public static void main(String args[]) {
        Dog d1 = new Dog();
        d1.sound();
    }
}
*/

import java.util.Scanner;

class TouristPlace {
    String placeName;
    String city;
    double ticketPrice;

    public void setDetails(String pl, String ci, double ti) {
        placeName = pl;
        city = ci;
        ticketPrice = ti;
    }

    void displayPlace() {
        System.out.println("\nTourist Place : " + placeName);
        System.out.println("City : " + city);
        System.out.println("Ticket Price : " + ticketPrice);
    }
}

class RajasthanTour extends TouristPlace {
    int visitors;

    void setVisitors(int v) {
        visitors = v;
    }

    // Method Overriding
    void displayPlace() {
        System.out.println("\n==== Rajasthan Tourism Details ====");
        System.out.println("\nTourist Place : " + placeName);
        System.out.println("City : " + city);
        System.out.println("Ticket Price : " + ticketPrice);
        System.out.println("Visitors : " + visitors);
    }
    // Method Overloading
    void booking(){
        System.out.println("General Booking System");
    }
    void booking(int persons){
        System.out.println(persons+" Tickets book Successfully...!");
    }
}
public class Poly1 {
    public static void main(String args[]) {
        RajasthanTour r1 = new RajasthanTour();
        r1.setDetails("Hawa Mahal","Jaipur",250);
        r1.setVisitors(300);
        System.out.println("----------------------------------");

        RajasthanTour r2 = new RajasthanTour();
        r2.setDetails("Jaisalmer Fort","Jaisalmer",250);
        r2.setVisitors(270);
        System.out.println("----------------------------------");

        RajasthanTour r3 = new RajasthanTour();
        r3.setDetails("City Palace","Udaipur",250);
        r3.setVisitors(500);
        System.out.println("----------------------------------");

        RajasthanTour r4 = new RajasthanTour();
        r4.setDetails("Saheliyon ki bari", "Udaipur", 250);
        r4.setVisitors(400);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Rajasthan Tourism Menu =====");
            System.out.println("1. View Hawa Mahal");
            System.out.println("2. View Jaisalmer Fort");
            System.out.println("3. View City Palace");
            System.out.println("4. Saheliyon ki bari");
            System.out.println("5. Book Ticket");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    r1.displayPlace();
                    break;

                case 2:
                    r2.displayPlace();
                    break;

                case 3:
                    r3.displayPlace();
                    break;
                case 4:
                    r4.displayPlace();
                    break;
                case 5:
                    System.out.println("Enter Number of Person");
                    int person = sc.nextInt();
                    r1.booking(person);
                    break;
                case 6:
                    System.out.println("Thank You for Visiting");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }
        } while (choice != 6);

    sc.close();
    }
}