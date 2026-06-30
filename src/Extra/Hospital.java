package Extra;

//Class 1
class HospitalInfo {

    // Static variable
    static String hospitalName = "Laxmi Hospital";

    // Final variable
    final String country = "India";

    void displayHospital() {

        System.out.println("Hospital : " + hospitalName);
    }

    void displayCountry() {

        System.out.println("Country : " + country);

        System.out.println("--------------------------");
    }
}

//Class 2
class Patient {

    // Instance variables
    String patientName;
    int patientAge;

    void displayPatient() {

        System.out.println("Patient Name : " + patientName);
    }

    void checkAgeGroup() {

        // if-else ladder
        if (patientAge < 18) {

            System.out.println("Child Patient");

        } else if (patientAge >= 18 && patientAge <= 50) {

            System.out.println("Adult Patient");

        } else {

            System.out.println("Senior Citizen Patient");
        }

        System.out.println("--------------------------");
    }
}

//Class 3
class Doctor {

    // Instance variable
    String doctorName;

    void showDoctor() {

        System.out.println("Doctor Name : " + doctorName);
    }

    void department(int choice) {

        // switch case
        switch (choice) {

            case 1:
                System.out.println("Cardiology Department");
                break;

            case 2:
                System.out.println("Neurology Department");
                break;

            case 3:
                System.out.println("Orthopedic Department");
                break;

            default:
                System.out.println("Invalid Department");
        }

        System.out.println("--------------------------");
    }
}

//Class 4
class Room {

    // Instance variable
    int roomNumber;

    void displayRoom() {

        System.out.println("Room Number : " + roomNumber);
    }

    void roomType(int type) {

        if (type == 1) {

            System.out.println("General Room");

        } else {

            System.out.println("Private Room");
        }

        System.out.println("--------------------------");
    }
}

//Class 5
class Billing {

    // Instance variable
    int billAmount;

    void showBill() {

        System.out.println("Bill Amount : " + billAmount);
    }

    void discountCheck() {

        if (billAmount > 5000) {

            System.out.println("Discount Applied");

        } else {

            System.out.println("No Discount");
        }

        System.out.println("--------------------------");
    }
}

//Class 6
class Medicine {

    void showMedicines() {

        String medicines[] = {"Paracetamol", "Vitamin", "Antibiotic"};

        // for loop
        for (int i = 0; i < medicines.length; i++) {

            System.out.println(medicines[i]);
        }
    }

    void medicineMessage() {

        System.out.println("Take medicines on time");

        System.out.println("--------------------------");
    }
}

//Class 7
public class Hospital {

    public static void main(String[] args) {

        // Object 1
        HospitalInfo h1 = new HospitalInfo();

        h1.displayHospital();
        h1.displayCountry();

        // Object 2
        Patient p1 = new Patient();

        p1.patientName = "Shabina";
        p1.patientAge = 21;

        p1.displayPatient();
        p1.checkAgeGroup();

        // Object 3
        Doctor d1 = new Doctor();

        d1.doctorName = "Dr. Sandeep";

        d1.showDoctor();
        d1.department(2);

        // Object 4
        Room r1 = new Room();

        r1.roomNumber = 101;

        r1.displayRoom();
        r1.roomType(1);

        // Object 5
        Billing b1 = new Billing();

        b1.billAmount = 7000;

        b1.showBill();
        b1.discountCheck();

        // Object 6
        Medicine m1 = new Medicine();

        m1.showMedicines();
        m1.medicineMessage();
    }
}