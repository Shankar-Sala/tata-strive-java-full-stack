package June;



/*
Online Movie Ticket Booking System
Problem Statement

A cinema company wants to create an Online Movie Ticket Booking System.

The system should:

Store movie details.
Display available seats.
Allow users to book tickets.
Prevent booking if seats are unavailable.
Calculate total ticket cost.
Generate booking confirmation.
Handle invalid seat numbers through exception handling.
Use abstraction for ticket booking operations.
Use interfaces for payment services.
Use inheritance for different movie categories (2D, 3D, IMAX).
Maintain total bookings using static variables.
Use final variables for GST percentage and booking charges.

Class & Object
Constructor
this Keyword
Inheritance
Multilevel Inheritance
Method Overriding
Abstraction
Interface
static
final
Exception Handling
Array
Upcasting
 */


interface PaymentService {
    void makePayment(double amount);
}

class InvalidSeatException extends Exception {
    public InvalidSeatException(String message) {
        super(message);
    }
}


abstract class Movie implements PaymentService {

    protected String movieName;
    protected int totalSeats;
    protected boolean[] seats;

    static int totalBookings = 0;

    static final double GST = 18;
    static final double BOOKING_CHARGE = 30;

    public Movie(String movieName, int totalSeats) {
        this.movieName = movieName;
        this.totalSeats = totalSeats;
        this.seats = new boolean[totalSeats];
    }

    abstract double ticketPrice();

    public void showMovieDetails() {
        System.out.println("\nMovie Name : " + movieName);
        System.out.println("Ticket Price : ₹" + ticketPrice());
        System.out.println("Total Seats : " + totalSeats);
    }

    public void showAvailableSeats() {

        System.out.println("\nAvailable Seats:");

        for (int i = 0; i < seats.length; i++) {

            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }

    public void bookSeat(int seatNo) throws InvalidSeatException {

        if (seatNo < 1 || seatNo > totalSeats) {
            throw new InvalidSeatException("Invalid Seat Number!");
        }

        if (seats[seatNo - 1]) {
            System.out.println("Seat " + seatNo + " is already booked.");
            return;
        }

        seats[seatNo - 1] = true;

        totalBookings++;

        double basePrice = ticketPrice();

        double gstAmount = (basePrice * GST) / 100;

        double totalAmount = basePrice + gstAmount + BOOKING_CHARGE;

        makePayment(totalAmount);

        System.out.println("\nBooking Confirmed");
        System.out.println("Movie : " + movieName);
        System.out.println("Seat No : " + seatNo);
        System.out.println("Total Amount : ₹" + totalAmount);
    }
}

class Movie2D extends Movie {

    public Movie2D(String movieName, int totalSeats) {

        super(movieName, totalSeats);
    }

    @Override
    double ticketPrice() {
        return 200;
    }

    @Override
    public void makePayment(double amount) {
        System.out.println("\nPayment Successful : ₹" + amount);
    }
}

class Movie3D extends Movie2D {

    public Movie3D(String movieName, int totalSeats) {

        super(movieName, totalSeats);
    }

    @Override
    double ticketPrice() {
        return 350;
    }
}

class IMAX extends Movie3D {

    public IMAX(String movieName, int totalSeats) {

        super(movieName, totalSeats);
    }

    @Override
    double ticketPrice() {
        return 500;
    }
}

public class CaseStudy2 {

    public static void main(String[] args) {

        try {

            // Upcasting
            Movie movie = new IMAX("Avengers Endgame", 10);

            movie.showMovieDetails();

            movie.showAvailableSeats();

            movie.bookSeat(3);

            movie.bookSeat(5);

            movie.bookSeat(2);

            movie.bookSeat(20);

        } catch (InvalidSeatException e) {

            System.out.println("\nError : " + e.getMessage());
        }

        System.out.println("\nTotal Bookings : " + Movie.totalBookings);
    }
}
