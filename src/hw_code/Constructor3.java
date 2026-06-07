package hw_code;
//Create a Java program for a Mobile Store System using constructors.

class Mobile {

    int mobileId;
    String mobileName;
    double price;

    // Default Constructor
    Mobile() {

        System.out.println("Welcome To Mobile Store");
        System.out.println("--------------------------");
    }

    // Parameterized Constructor
    Mobile(int id, String name, double p) {

        mobileId = id;
        mobileName = name;
        price = p;
    }

    void displayMobile() {

        System.out.println("Mobile ID : " + mobileId);
        System.out.println("Mobile Name : " + mobileName);
        System.out.println("Price : " + price);
    }

    void checkPriceCategory() {

        if(price > 30000) {

            System.out.println("Premium Phone");
        }
        else {

            System.out.println("Budget Phone");
        }

        System.out.println("--------------------------");
    }
}

public class Constructor3 {

    public static void main(String[] args) {

        Mobile m1 = new Mobile();

        Mobile p1 = new Mobile(101,"Samsung",45000);
        p1.displayMobile();
        p1.checkPriceCategory();

        Mobile p2 = new Mobile(102,"Redmi",15000);
        p2.displayMobile();
        p2.checkPriceCategory();
    }
}
