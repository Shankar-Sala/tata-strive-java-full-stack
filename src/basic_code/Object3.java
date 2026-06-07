package basic_code;

class RailwayPassenger {

    // final variable--can not be changed
    final static String railwayName = "Indian Railways";

    // instance variable
    String passengerName;
    int seatNumber;

    // method
    void displayTicket() {
        System.out.println("Railway Name : " + railwayName);
        System.out.println("Passenger Name : " + passengerName);
        System.out.println("Seat Number : " + seatNumber);
        System.out.println("--------------------------");
    }
}

public class Object3 {
    public static void main(String args[]) {
        RailwayPassenger R1=new RailwayPassenger();
        R1.passengerName="Snehal";
        R1.seatNumber=11;
        RailwayPassenger R2=new RailwayPassenger();
        R2.passengerName="Nisha";
        R2.seatNumber=12;
        RailwayPassenger R3=new RailwayPassenger();
        R3.passengerName="Aziz";
        R3.seatNumber=13;

        R1.displayTicket();
        R2.displayTicket();
        R3.displayTicket();

    }
}
