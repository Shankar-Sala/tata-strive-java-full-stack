package basic_code;

import java.util.Scanner;


/*
 * Develop a Rajasthan Tourism Management System using Java concepts such as:
•	Class and Object
•	Inheritance
•	Method Overriding
•	Method Overloading
•	Scanner Class
•	Menu Driven Program
The system should display famous tourist places of Rajasthan like:
•	Hawa Mahal
•	Jaisalmer Fort
•	City Palace
•	Sahaliyo ki badi
The application should allow users to:
1.	View tourist place details
2.	Check city name and ticket price
3.	View number of visitors
4.	Book tickets for tourists
5.	Exit the application
The program should be menu-driven and demonstrate the use of Object-Oriented Programming concepts in Java.


 */

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
        System.out.println("\n\nTourist Place :" + placeName);
        System.out.println("City :" + city);
        System.out.println("Ticket Price :" + ticketPrice);
    }
}

class RajasthanTour extends TouristPlace {
    int visitors;

    void setVisitors(int v) {
        visitors = v;

    }

    // Method Overriding
    void displayPlace() {
        System.out.println("\n===== Rajasthan Tourism Details =====");
        System.out.println("\n\nTourist Place :" + placeName);
        System.out.println("City :" + city);
        System.out.println("Ticket Price :" + ticketPrice);
        System.out.println("Visitors      : " + visitors);

    }

    // methos overlading
    void booking() {
        System.out.println("General Booking Completed.");

    }

    void booking(int persons) {
        System.out.println(persons + "  Tickets book successfully...!");
    }
}

public class Poly4 {
    public static void main(String args[]) {
        RajasthanTour r1 = new RajasthanTour();
        r1.setDetails("Hawa Mahal", "Jaipur", 250);
        r1.setVisitors(300);
        System.out.println("------------------------------------------------");

        RajasthanTour r2 = new RajasthanTour();
        r2.setDetails("Jaisalmer fort", "Jaisalmer", 250);
        r2.setVisitors(270);
        System.out.println("------------------------------------------------");

        RajasthanTour r3 = new RajasthanTour();
        r3.setDetails("City Palace", "Udaipur", 250);
        r3.setVisitors(500);
        System.out.println("------------------------------------------------");

        RajasthanTour r4 = new RajasthanTour();
        r4.setDetails("Sahaliyo ki badi", "Udaipur", 250);
        r4.setVisitors(400);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Rajasthan Tourism Menu =====");
            System.out.println("1. View Hawa Mahal");
            System.out.println("2. View Jaisalmer Fort");
            System.out.println("3. View City Palace");
            System.out.println("4. Sahaliyo ki badi");
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
                    System.out.print("Enter Number of Persons: ");
                    int person = sc.nextInt();
                    r1.booking(person);
                    break;
                case 6:

                    System.out.println("Thank You for Visiting Rajasthan Tourism.");
                    break;

                default:

                    System.out.println("Invalid Choice.");

            }
        } while (choice != 6);

        sc.close();
    }
}