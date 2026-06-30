package Extra;

class Railways {
    static String railwayName = "Indian Railways";
    final String country = "India";
    int fare = 500;

    static {
        System.out.println("Railway System Started");
    }

    Railways() {
        System.out.println("Railway Constructor");
    }

    void railwayDetails() {
        System.out.println("Railway Name : " + railwayName);
        System.out.println("Country : " + country);
    }

    void ticketType() {
        System.out.println("General Ticket");
    }
}

class Passenger extends Railways {
    String passengerName;
    int age;
    int fare = 1000;

    Passenger(String name, int ag) {
        passengerName = name;
        age = ag;
    }
    void ticketType(){
        super.ticketType();
        System.out.println("AC Coach Ticket");
    }
    void passengerDetails(){
        System.out.println("Passenger Name: "+passengerName);
        System.out.println("Age: "+age);
        System.out.println("Child Fare: "+fare);
        System.out.println("Parent Fare: "+super.fare);
    }
    void ageCategory(){
        if(age>=60){
            System.out.println("Senior Citizen passenger ..");
        } else {
            System.out.println("Regular passenger ..");
        }
    }
    void coachSelection(int choice){
        switch (choice){
            case 1:
                System.out.println("Sleeper Coach");
                break;
            case 2:
                System.out.println("3 Ac  Coach");
                break;
            case 3:
                System.out.println("First class Coach");
                break;
            default:
                System.out.println("Invalid option ...");

        }
    }

    void station(){
        String[] arr={"Mumbai","Nashik","bhusaval","kandwa","itarsi"};
        System.out.println("railways stop Station name :");
        for(int i=0;i<=arr.length-1;i++){
            System.out.println(arr[i]+" station ");
        }
    }
    void ticketCalculation(){
        int a=5;
        int b= ++a + a++;
        System.out.println("value of ticket is : "+b);
    }
}

public class CaseStudy8 {
    public static void main(String[] args) {
        Passenger p1=new Passenger("Shabina",21);
        p1.railwayDetails();
        System.out.println("---------------------------------");
        p1.ageCategory();
        System.out.println("---------------------------------");

        p1.coachSelection(2);
        System.out.println("---------------------------------");

        p1.ticketType();
        System.out.println("---------------------------------");

        p1.passengerDetails();
        System.out.println("---------------------------------");

        p1.ticketCalculation();
        System.out.println("---------------------------------");

        p1.station();
        System.out.println("---------------------------------");


        Railways r1=new Passenger("Rahul ",68);

        r1.ticketType();


    }
}
