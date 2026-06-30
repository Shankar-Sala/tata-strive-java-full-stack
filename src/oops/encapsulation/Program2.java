package oops.encapsulation;

//interface class
interface PlacementRules {
    void checkEligibility();
}

//---------------------------------------------------------

//abstract class
abstract class Learner5 {
    private int learnerId;
    private String learnerName;
    private String batchName;
    private int attendance;
    private int marks;
    private String location;

    public Learner5(int learnerId, String learnerName, String batchName, int attendance, int marks, String location) {
        this.learnerId = learnerId;
        this.learnerName = learnerName;
        this.batchName = batchName;
        this.attendance = attendance;
        this.marks = marks;
        this.location = location;
    }

    public int getLearnerId() {
        return learnerId;
    }

    public String getLearnerName() {
        return learnerName;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getAttendance() {
        return attendance;
    }

    public int getMarks() {
        return marks;
    }

    public String getLocation() {
        return location;
    }

    abstract void display();

}

class PlacementLearner extends Learner5 implements PlacementRules {

    public PlacementLearner(int learnerId, String learnerName, String batchName, int attendance, int marks, String location) {
        super(learnerId, learnerName, batchName, attendance, marks, location);
    }

    public void display() {
        System.out.println("Learners ID : " + getLearnerId());
        System.out.println("Name : " + getLearnerName());
        System.out.println("Batch : " + getBatchName());
        System.out.println("Attendance : " + getAttendance());
        System.out.println("Marks : " + getMarks());
        System.out.println("Location : " + getLocation());
    }

    public void checkEligibility() {
        if (getAttendance() >= 80 && getMarks() >= 60) {
            System.out.println("\nEligible for Placement");
        } else {
            System.out.println("\nNot Eligible");
        }
    }
}

public class Program2 {
    public static void main(String[] args){
        PlacementLearner p1 = new PlacementLearner(05,"Shabina","Tata Strive",90,95,"Navi Mumbai");
        p1.display();
        p1.checkEligibility();
    }
}
