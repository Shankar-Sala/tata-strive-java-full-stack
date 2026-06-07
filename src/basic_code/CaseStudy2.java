package basic_code;

/*
 * Problem Statement

A hospital wants to develop a simple Java-based system to manage:-----ok

patient records-----ok
doctor appointments----ok
consultation fees----ok
medical test information

The system should help hospital staff manage appointments efficiently
and provide basic hospital services digitally.

The project should use core Java concepts for learning and practical implementation.
 */

class Hospital {
    // Static variable
    static String hospitalName = "Tata STRIVE Hospital";

    // Final variable
    final String country = "India";

    // Static block
    static {

        System.out.println("Hospital Management System Started");
    }

    static void hospitalRules() {
        System.out.println("Follow Hospital Safety Rules");
    }

    // Method---Non-static method...
    void displayHospital() {

        System.out.println("Hospital Name : " + hospitalName);
        System.out.println("Country : " + country);
        System.out.println("-----------------------------------");
    }

}

class Patient1 {
    int patientId;
    String patientName;
    int patientAge;

    // Constructor3
    Patient1(int id, String name, int age) {

        patientId = id;
        patientName = name;
        patientAge = age;
    }

    void displayPatient() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient Age : " + patientAge);
    }

    void patientCategory() {
        if (patientAge < 12) {
            System.out.println("Child Patient");

        } else if (patientAge >= 12 && patientAge <= 59) {
            System.out.println("Adult Patient");

        } else {
            System.out.println("Senior Citizen Patient");

        }
    }

}

class Doctor1 {
    int doctorChoice;

    void selectDoctor() {
        switch (doctorChoice) {
            case 1:
                System.out.println("Cardiologist Selected");
                break;
            case 2:
                System.out.println("Neurologist Selected");
                break;
            case 3:
                System.out.println("Orthopedic Selected");
                break;
            case 4:
                System.out.println("General Physician Selected");
                break;
            default:
                System.out.println("Invalid Doctor Choice");

        }
    }

    void cosultationFee() {
        if (doctorChoice == 1) {
            System.out.println("Consultation Fee : 1500");

        } else if (doctorChoice == 2) {
            System.out.println("Consultation Fee : 2000");

        } else if (doctorChoice == 3) {
            System.out.println("Consultation Fee : 800");

        } else {
            System.out.println("Consultation Fee : 800");

        }
        System.out.println("-----------------------------------");

    }

}

class Appointment {
    int appointmentNumber;

    Appointment(int number) {
        appointmentNumber = number;
    }

    void appointmentStatus() {
        if (appointmentNumber <= 50) {
            System.out.println("Appointment Confirmed");

        } else {
            System.out.println("Waiting List");

        }
    }

    // Method
    void displayAppointment() {

        System.out.println("Appointment Number : " + appointmentNumber);
    }
}

class MedicalTests {
    void displayTests() {
        String tests[] = { "Blood Test", "X-Ray", "MRI Scan", "CT Scan", "ECG" };

        System.out.println("Available Medical Tests:");
        for (int i = 0; i < tests.length; i++) {
            System.out.println(tests[i]);

        }

    }

    // Method
    void testMessage() {

        System.out.println("Medical Tests Available 24/7");
    }
}

public class CaseStudy2 {
    public static void main(String[] args) {
        Hospital.hospitalRules();
        Hospital h1 = new Hospital();
        h1.displayHospital();

        Patient1 p1 = new Patient1(101, "Siddhi", 22);
        p1.displayPatient();
        p1.patientCategory();

        Doctor1 d1 = new Doctor1();
        d1.doctorChoice = 2;
        d1.selectDoctor();
        d1.cosultationFee();


        Appointment a1=new Appointment(25);
        a1.displayAppointment();
        a1.appointmentStatus();

        MedicalTests m1=new MedicalTests();
        m1.displayTests();
        m1.testMessage();


    }
}
