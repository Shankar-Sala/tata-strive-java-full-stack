package basic_code;

//Class 1
class TourismInfo {

    // Static variable
    static String companyName = "Tata STRIVE Tourism";

    // Final variable
    final String country = "India";

    void displayCompanyInfo() {

        System.out.println("Company : " + companyName);
        System.out.println("Country : " + country);

        System.out.println("----------------------------");
    }
}



//Class 2
class Tourist {

    // Instance variables
    String touristName;
    int touristAge;

    void checkEligibility() {

        // if-else ladder
        if(touristAge >= 18 && touristAge <= 30) {

            System.out.println(touristName + " Eligible for Youth Package");
        }

        else if(touristAge > 30 && touristAge <= 50) {

            System.out.println(touristName + " Eligible for Family Package");
        }

        else if(touristAge > 50) {

            System.out.println(touristName + " Eligible for Senior Citizen Package");
        }

        else {

            System.out.println("Not eligible for booking");
        }

        System.out.println("----------------------------");
    }
}



//Class 3
class TourPackage {

    void selectPackage(int choice) {

        // switch case
        switch(choice) {

            case 1:

                System.out.println("Goa Package Selected");
                break;

            case 2:

                System.out.println("Kashmir Package Selected");
                break;

            case 3:

                System.out.println("Kerala Package Selected");
                break;

            default:

                System.out.println("Invalid Package");
        }

        System.out.println("----------------------------");
    }

    void displayPlaces() {

        String places[] = {"Beach", "Temple", "Mountain", "Museum"};

        System.out.println("Tourist Attractions:");

        // for loop
        for(int i = 0; i < places.length; i++) {

            System.out.println(places[i]);
        }

        System.out.println("----------------------------");
    }
}



//Class 4
public class Project2 {

    public static void main(String[] args) {

        // Object 1
        TourismInfo t1 = new TourismInfo();

        t1.displayCompanyInfo();

        // Object 2
        Tourist tr1 = new Tourist();

        tr1.touristName = "Sonam";
        tr1.touristAge = 28;

        tr1.checkEligibility();

        // Object 3
        TourPackage p1 = new TourPackage();

        p1.selectPackage(2);

        p1.displayPlaces();
    }
}