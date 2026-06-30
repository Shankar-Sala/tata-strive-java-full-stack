/*
* Problem Statement

Indian Railways wants to develop a Smart Railway Reservation System.

The system should:

Store passenger details.
Store train details.
Passenger HAS-A Ticket (Aggregation).
Ticket HAS-A Train (Aggregation).
Generate ticket numbers automatically using static.
Use final variable for railway name.
Create train categories:
Express Train
Superfast Train
Use inheritance and method overriding.
Define payment rules using interface.
Use abstraction for booking process.
Throw exception if seats are unavailable.
Use try-catch-finally for error handling.
Use upcasting and instanceof.
Display reservation details.
* */

package june.casestudy;

import java.util.*;

// Interface for Payment
interface Payment {
    void makePayment(double amount);
}

// Concrete Payment Class
class OnlinePayment implements Payment {
    @Override
    public void makePayment(double amount) {
        System.out.println("Payment of ₹" + amount + " completed successfully.");
    }
}

// Custom Exception
class SeatUnavailableException extends Exception {
    public SeatUnavailableException(String message) {
        super(message);
    }
}

// Passenger Class
class Passenger {
    private String name;
    private int age;

    public Passenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Train Class (Parent)
class Train {
    protected int trainNo;
    protected String trainName;
    protected int availableSeats;

    public Train(int trainNo, String trainName, int availableSeats) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        this.availableSeats = availableSeats;
    }

    public void displayTrainInfo() {
        System.out.println("Train No: " + trainNo);
        System.out.println("Train Name: " + trainName);
        System.out.println("Available Seats: " + availableSeats);
    }

    public void reserveSeat() throws SeatUnavailableException {
        if (availableSeats <= 0) {
            throw new SeatUnavailableException("Seats are unavailable!");
        }
        availableSeats--;
    }
}

// Express Train (Inheritance + Overriding)
class ExpressTrain extends Train {

    public ExpressTrain(int trainNo, String trainName, int availableSeats) {
        super(trainNo, trainName, availableSeats);
    }

    @Override
    public void displayTrainInfo() {
        System.out.println("=== Express Train ===");
        super.displayTrainInfo();
    }
}

// Superfast Train (Inheritance + Overriding)
class SuperfastTrain extends Train {

    public SuperfastTrain(int trainNo, String trainName, int availableSeats) {
        super(trainNo, trainName, availableSeats);
    }

    @Override
    public void displayTrainInfo() {
        System.out.println("=== Superfast Train ===");
        super.displayTrainInfo();
    }
}

// Abstract Class for Booking Process
abstract class Booking {
    abstract void bookTicket(Passenger passenger, Train train)
            throws SeatUnavailableException;
}

// Ticket Class (Aggregation: Ticket HAS-A Train)
class Ticket {
    private static int counter = 1000; // Static for auto ticket number

    private int ticketNo;
    private Passenger passenger; // Aggregation
    private Train train; // Aggregation

    public Ticket(Passenger passenger, Train train) {
        this.ticketNo = ++counter;
        this.passenger = passenger;
        this.train = train;
    }

    public void displayTicket() {
        System.out.println("\n===== TICKET DETAILS =====");
        System.out.println("Ticket No : " + ticketNo);
        System.out.println("Passenger : " + passenger.getName());
        System.out.println("Age       : " + passenger.getAge());
        System.out.println("Train No  : " + train.trainNo);
        System.out.println("Train Name: " + train.trainName);
    }
}

// Reservation System Class
class RailwayReservation extends Booking {

    public static final String RAILWAY_NAME = "INDIAN RAILWAYS"; // Final variable

    private Payment payment;

    public RailwayReservation(Payment payment) {
        this.payment = payment;
    }

    @Override
    public void bookTicket(Passenger passenger, Train train)
            throws SeatUnavailableException {

        train.reserveSeat();

        Ticket ticket = new Ticket(passenger, train);

        payment.makePayment(500);

        System.out.println("\nWelcome to " + RAILWAY_NAME);
        ticket.displayTicket();
    }
}

// Main Class
public class SmartRailwayReservationSystem {

    public static void main(String[] args) {

        Passenger passenger =
                new Passenger("Rahul Sharma", 25);

        // Upcasting
        Train train = new SuperfastTrain(
                11020,
                "Konark Express",
                2);

        Payment payment = new OnlinePayment();

        RailwayReservation reservation =
                new RailwayReservation(payment);

        try {

            // instanceof check
            if (train instanceof SuperfastTrain) {
                System.out.println("Selected Train is Superfast.");
            } else if (train instanceof ExpressTrain) {
                System.out.println("Selected Train is Express.");
            }

            train.displayTrainInfo();

            reservation.bookTicket(passenger, train);

            // Booking more tickets to demonstrate exception
            Passenger p2 = new Passenger("Amit", 30);
            reservation.bookTicket(p2, train);

            Passenger p3 = new Passenger("Rohit", 35);
            reservation.bookTicket(p3, train);

        } catch (SeatUnavailableException e) {

            System.out.println("\nError: " + e.getMessage());

        } finally {

            System.out.println("\nThank you for using Indian Railways Reservation System.");

        }
    }
}
