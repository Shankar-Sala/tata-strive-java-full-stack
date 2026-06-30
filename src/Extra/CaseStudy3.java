package Extra;

/*
Smart Restaurant Order Management System
 Problem Statement

A restaurant wants to develop a Java-based system to manage:

customer details -- ok
food ordering --ok
bill generation --ok
table booking --ok
menu display -- ok

The system should help staff manage restaurant operations efficiently.
 */
class Restaurant{
    static String restaurantName= "Tata Restuarant";
    final String countryName="India";
    static {
        System.out.println("Restaurant Management System");
    }

    void displayInfo(){
        System.out.println("Restuarant Name: "+restaurantName);
        System.out.println("Country Name:"+countryName);
    }
}
class Customer{
   String  customerName;
   int tokenNumber;
   int phoneNumber;

   Customer(String  name, int token, int mobile ){
       customerName = name;
       tokenNumber = token;
       phoneNumber = mobile;
       System.out.println("--------------------------------");
       System.out.println("Customer Name: "+name);
       System.out.println("Customer Token Number: "+token);
       System.out.println("Mobile Number: "+mobile);
       System.out.println("--------------------------------");
   }
}
class Food{
    int foodChoice;
    void selectFood(){
        switch (foodChoice){
            case 1:
                System.out.println("Customer choiced Indian Food");
                break;
            case 2:
                System.out.println("Customer choiced Korean Food");
                break;
            case 3:
                System.out.println("Customer choiced Italian Food");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        }
    void bill(){
        if (foodChoice==1){
            System.out.println("Total Bill: 1500");
        } else if (foodChoice==2) {
            System.out.println("Total Bill : 2000");
        } else if (foodChoice==3){
            System.out.println("Total Bill : 1800");
        }
    }
}

class Table {
    int availableTables = 10;
    int tokenNumber;

    Table(int number) {
        tokenNumber = number;
    }

    void bookTable() {
        if(tokenNumber <= availableTables) {

            System.out.println("Table Assigned : " + tokenNumber);
            System.out.println("Booking Confirmed");
        }
        else {
            System.out.println("No Table Available");
            System.out.println("Customer Added To Waiting List");
        }
        System.out.println("--------------------------------");
    }
}
class Menu {
    void displayMenu() {
        System.out.println("---------- RESTAURANT MENU ----------");

        System.out.println("\n 1. Indian Food");
        System.out.println("   - Butter Chicken");
        System.out.println("   - Paneer Tikka");
        System.out.println("   - Biryani");
        System.out.println("   - Rice");
        System.out.println("   - Naan");

        System.out.println("\n 2. Korean Food");
        System.out.println("   - Kimchi");
        System.out.println("   - Bibimbap");
        System.out.println("   - Tteokbokki");
        System.out.println("   - Ramen");
        System.out.println("   - Korean Fried Chicken");

        System.out.println("\n 3. Italian Food");
        System.out.println("   - Pizza");
        System.out.println("   - Pasta");
        System.out.println("   - Lasagna");
        System.out.println("   - Garlic Bread");
        System.out.println("   - Risotto");

        System.out.println("\n-------------------------------------");
    }
}
public class CaseStudy3 {
    public static void main(String args[]){
    Restaurant r1 = new Restaurant();
    r1.displayInfo();

    Menu m1= new Menu();
    Customer c1 = new Customer("Shabina",5,123);
    Table t1 = new Table(5);
    Food f1 = new Food();


    t1.bookTable();
    m1.displayMenu();
    f1.foodChoice=2;
    f1.selectFood();
    f1.bill();

    }
}
