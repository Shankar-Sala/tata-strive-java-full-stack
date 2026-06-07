package hw_code;

class Student {

    int studentId;
    String studentName;

    Student(int id, String name) {

        studentId = id;
        studentName = name;
    }

    void displayStudent() {

        System.out.println("Student ID : " + studentId);
        System.out.println("Student Name : " + studentName);
    }
}

class Result extends Student {

    int m1, m2, m3, m4, m5;
    int total;
    double percentage;

    Result(int id, String name,
           int a, int b, int c, int d, int e) {

        super(id, name);

        m1 = a;
        m2 = b;
        m3 = c;
        m4 = d;
        m5 = e;
    }

    void calculateResult() {

        total = m1 + m2 + m3 + m4 + m5;

        percentage = total / 5.0;
    }

    void displayResult() {

        System.out.println("Total Marks : " + total);
        System.out.println("Percentage : " + percentage + "%");
    }
}

public class Inheritance4{

    public static void main(String[] args) {

        Result r1 = new Result(101, "Rohan",
                78, 88, 67, 90, 80);

        r1.displayStudent();

        r1.calculateResult();

        r1.displayResult();
    }
}
