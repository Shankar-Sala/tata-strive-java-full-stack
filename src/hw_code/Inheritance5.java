package hw_code;


class Citizen {

    int citizenId;
    String citizenName;

    Citizen(int id, String name) {

        citizenId = id;
        citizenName = name;
    }

    void displayCitizen() {

        System.out.println("Citizen ID : " + citizenId);
        System.out.println("Citizen Name : " + citizenName);
    }
}

class Voter extends Citizen {

    int age;

    Voter(int id, String name, int age) {

        super(id, name);

        this.age = age;
    }

    void checkVotingEligibility() {

        System.out.println("Age : " + age);

        if(age >= 18) {

            System.out.println("Eligible For Voting");
        }
        else {

            System.out.println("Not Eligible For Voting");
        }
    }
}

public class Inheritance5{

    public static void main(String[] args) {

        Voter v1 = new Voter(11, "Amit", 22);

        v1.displayCitizen();

        v1.checkVotingEligibility();
    }
}
