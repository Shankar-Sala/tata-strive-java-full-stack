package basic_code;

class Students {
    String name;
    int rollNo;

    Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Result extends Students {
    int sub1, sub2, sub3, sub4, sub5;
    int total;
    double percentage;

    Result(String name, int rollNo,
           int sub1, int sub2, int sub3,
           int sub4, int sub5) {

        //call parent constructor
        super(name, rollNo);

        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.sub5 = sub5;
    }

    void calculateResult() {
        total = sub1 + sub2 + sub3 + sub4 + sub5;
        percentage = total / 5.0;
    }

    void displayResult() {
        super.displayStudentInfo();

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class SuperKey {
    static void main() {
        String studentName = "Shankar";
        int rollNumber = 101;

        int subject1 = 85;
        int subject2 = 90;
        int subject3 = 78;
        int subject4 = 88;
        int subject5 = 92;

        Result r1 = new Result(studentName,rollNumber, subject1, subject2, subject3, subject4, subject5);

        r1.calculateResult();
        r1.displayResult();
    }
}
