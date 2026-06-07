package basic_code;

/*
 * 1]Platform Independent---Write once,Run Anywhere
 * ----Windows
 * ----Linux
 * ----Mac
 * -----JVM--(Java Virtual Machine).
 *
 * 2]Object-Oriented Programming
 *
 * Java follows OOP concepts:
     Class
      Object
      Inheritance
      Polymorphism
      Encapsulation
      Abstraction
 *
 *
 * 3]Simple
 * no pointers
 * automatic memory management
 *
 * 4]Secure
 *    JVM Security
 *    byte code...
 *
 *  5]Robust
 *    strong memory management
 *    exception handling
 *    static
 *
 *    6]Multithreaded
 *    Java supports multiple tasks at same time using threads.
 *
 *    7]Portable
 *    Java bytecode can move easily between systems.
 *
 *    8]High Performance
 *
 *    JDK---JRE---->JVM
 *
 *    9]Distributed
 *    ---------------------------------------------------------------------------
 *    ---------------------------------------------------------------------------
 *
 *
 *    JVM--(Java Virtual Machine)
 *
 *
 *    Run java Bytecode
 *    converts bytecode into machine language
 *    JVM is responsible for executing Java programs.
 *    ----------Loads the class files
 *    ----------Allocates memory
 *    ---------bytecode into machine language
 *    --------Removes unused objects---Garbage Collection
 *
 *
 *    Java Program-----Sonam.java----source code
 *                 |
 *    Compiler--------Javac Sonam.java
 *                 |
 *              Bytecode----(Sonam.class)
 *                 |
 *                JVM
 *                 |
 *             Machine code
 *                 |
 *              Output
 *
 *
 *
 *  JRE-- (Java Runtime Environment )
   JRE provides environment to run Java applications.
   Cannot develop Java programs
   JRE---------JVM+Library Files
 *
 *
 *  JDK---Java Development Kit
 *
 *  JDK is used to:
      develop Java programs
      compile Java code---javac
      run Java programs---java


      JVM----Engine
      JRE-----Car
      JDK----Car factory
 *
 *          What is the difference between JDK, JRE, and JVM?
 *          JVM--Execute bytecode
 *          JRE--Runs java program
 *          JDK--- Develops Java programs
 *
 *          Why Java is platform independent?
 *           Which component contains compiler?----javac
 *
 *           Can we run Java program without JDK?
 *           - ---Yes, if JRE is installed.
 *
 *           Can we compile Java program using JRE?
 *           Yes
 *
 *           What is bytecode in Java?
 *           .class ---files contains the bytecode
 *
 *
 *           Who converts bytecode into machine code?
 *           JVM
 *
 *
 *
 */
/*
 * A Smart Tourism Company wants to create a Tourism Management System to:---ok
 *
 * manage tourist details-----ok
   assign tour packages------ok
   allocate hotels---------ok
   manage transportation-----ok
   calculate bills--------------ok
   display tourist places-----ok
   verify age eligibility------ok
   provide tourism rules--------ok
 *
 * The system includes:

    Tour packages-----------ok
    Hotel booking------------ok
    Vehicle allocation-------ok
     Food preferences---------ok
     Tourist attractions------ok
     Billing section----------ok
 *
 *
 *
 */

//class ---1
class TourismCompany {
    static String companyName = "Tata STRIVE Tourism";
    final String country = "India";

    static {
        System.out.println("Welcome...!!!    \nTourism Managment System Started..");
    }

    static void tourismRules() {
        System.out.println("Follow Tourism safety Rules");
    }

    void displayCompanyInfo() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Country : " + country);
        System.out.println("-----------------------------------");
    }
}

//class ---2
class Tourist1 {
    int touristId;
    String touristName;
    int touristAge;

    void displayTourist() {
        System.out.println("Tourist ID : " + touristId);
        System.out.println("Tourist Name : " + touristName);
        System.out.println("Tourist Age : " + touristAge);
    }

    void ageEligibility() {
        // if else ladder
        if (touristAge < 18) {

            System.out.println("Minor Tourist");

        } else if (touristAge >= 18 && touristAge <= 40) {

            System.out.println("Adult Tourist");

        } else if (touristAge > 40 && touristAge <= 60) {
            System.out.println("Family Tourist");

        } else {
            System.out.println("Senior Citizen Tourist");

        }
        System.out.println("-----------------------------------");

    }

}

//class ---3
class TourPackage1 {

    int packageChoice;

    void selectPackage() {
        switch (packageChoice) {
            case 1:
                System.out.println("Goa Beach Package Selected");
                break;
            case 2:
                System.out.println("Kashmir Snow Package Selected");
                break;
            case 3:
                System.out.println("Kerala Backwater Package Selected");
                break;
            case 4:
                System.out.println("Rajasthan Desert Package Selected");
                break;
            default:
                System.out.println("Invalid Package Selected");

        }
    }

    void packageAmount() {
        if (packageChoice == 1) {
            System.out.println("Package Amount : 15000");

        }

        else if (packageChoice == 2) {
            System.out.println("Package Amount : 25000");

        }

        else if (packageChoice == 3) {
            System.out.println("Package Amount : 20000");

        }

        else if (packageChoice == 4) {
            System.out.println("Package Amount : 18000");

        }

        else {
            System.out.println("No Package Amount Available");

        }
        System.out.println("-----------------------------------");

    }

}

//class ---4
class HotelBooking {
    int hotelChoice;

    void selectHotel() {
        switch (hotelChoice) {

            case 1:
                System.out.println("3 Star Hotel Booked");
                break;

            case 2:
                System.out.println("4 Star Hotel Booked");
                break;

            case 3:
                System.out.println("5 Star Hotel Booked");
                break;

            default:
                System.out.println("Invalid Hotel Choice");
        }
    }

    void hotelFacilities() {
        if (hotelChoice == 1) {
            System.out.println("Facilities : WiFi + Breakfast");

        } else if (hotelChoice == 2) {
            System.out.println("Facilities : WiFi + Pool + Breakfast");

        } else {
            System.out.println("Facilities : Luxury Suite + Pool + Gym");

        }
        System.out.println("-----------------------------------");

    }
}

//class---5
class Transport {
    int vehicleChoice;

    void allocateVehicle() {
        switch (vehicleChoice) {
            case 1:
                System.out.println("Bus Allocated");
                break;
            case 2:
                System.out.println("Car Allocated");
                break;
            case 3:
                System.out.println("Luxury Van Allocated");
                break;
            default:
                System.out.println("No Vehicle Allocated");

        }
    }

    void transportCharges() {
        if (vehicleChoice == 1) {
            System.out.println("Transport Charge : 2000");

        } else if (vehicleChoice == 2) {
            System.out.println("Transport Charge : 5000");

        } else if (vehicleChoice == 3) {
            System.out.println("Transport Charge : 8000");

        } else {
            System.out.println("Fixed  Charge : 400 per person");

        }
        System.out.println("-----------------------------------");

    }
}

//class---6
class FoodSection {
    int foodChoice;

    void selectFood() {
        switch (foodChoice) {
            case 1:
                System.out.println("Veg Food Selected");
                break;

            case 2:
                System.out.println("Non-Veg Food Selected");
                break;

            default:
                System.out.println("Special Food Selected");
        }
    }

    void foodMessage() {
        System.out.println("Healthy Food Will Be Provided");
        System.out.println("-----------------------------------");
    }
}

//class ---7
class TouristPlaces {
    void displayPlaces() {
        String places[] = { "Beach", "Temple", "Museum", "Waterfall", "Mountain" };
        System.out.println("Tourist Attractions : ");
        // for loop
        for (int i = 0; i < places.length; i++) {
            System.out.println(places[i]);

        }
    }

    void tourismMessage() {

        System.out.println("Enjoy Your Trip Safely");
        System.out.println("-----------------------------------");
    }
}

//class---8
class Billing1 {
    int totalAmount;

    void calculateBill() {
        int gst = 2000;
        totalAmount = totalAmount + gst;
        System.out.println("GST Added : " + gst);
        System.out.println("Final Bill : " + totalAmount);
    }

    void discountCheck() {
        if (totalAmount > 30000) {
            System.out.println("Discount Applied");
        } else {
            System.out.println("No Discount Available");

        }
        System.out.println("-----------------------------------");

    }
}

//class----9
class TourismGuide {
    void guideDetails() {
        System.out.println("Guide Name : Rahul Sharma");
        System.out.println("Experience : 5 Years");

    }

    void guideInstructions() {

        System.out.println("Please Follow Guide Instructions");
        System.out.println("-----------------------------------");
    }
}

public class Java_Features {
    public static void main(String args[]) {
        TourismCompany.tourismRules();
        TourismCompany t1 = new TourismCompany();
        t1.displayCompanyInfo();

        Tourist1 tt1 = new Tourist1();
        tt1.touristId = 11;
        tt1.touristName = "Nisha";
        tt1.touristAge = 20;
        tt1.displayTourist();
        tt1.ageEligibility();

        TourPackage1 to1 = new TourPackage1();
        to1.packageChoice = 2;
        to1.selectPackage();
        to1.packageAmount();

        HotelBooking h1 = new HotelBooking();
        h1.hotelChoice = 3;
        h1.selectHotel();
        h1.hotelFacilities();

        Transport tr1 = new Transport();
        tr1.vehicleChoice = 2;
        tr1.allocateVehicle();
        tr1.transportCharges();

        FoodSection f1 = new FoodSection();
        f1.foodChoice = 1;
        f1.selectFood();
        f1.foodMessage();

        TouristPlaces tp1 = new TouristPlaces();
        tp1.displayPlaces();
        tp1.tourismMessage();

        Billing1 b1 = new Billing1();
        b1.totalAmount = 35000;
        b1.calculateBill();
        b1.discountCheck();

        TourismGuide g1 = new TourismGuide();
        g1.guideDetails();
        g1.guideInstructions();

    }
}
