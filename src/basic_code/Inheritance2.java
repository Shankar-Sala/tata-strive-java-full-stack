package basic_code;

//Multilevel Inheritance
//parent class
class University {
    // static variable
    static String universityName = "Tata STRIVE University";
    final String country = "India";
    // static block
    static {
        System.out.println("------------------------------------");
        System.out.println("University System Started");
        System.out.println("------------------------------------\n");

    }

    // constructor
    University() {
        System.out.println("University Constructor3");
    }

    void universityRules() {
        System.out.println("Follow University Rules");
    }

    void displayUniversity() {
        System.out.println("University Name : " + universityName);
        System.out.println("Country : " + country);
        System.out.println("------------------------------------");
    }
}

//child class
class College extends University {
    String collegeName = "Engineering College";

    College() {
        System.out.println("College Constructor3");
    }

    void displayCollege() {
        System.out.println("College Name : " + collegeName);
    }

    // if-else ladder
    void departmentCheck(int code) {
        if (code == 1) {
            System.out.println("Computer Department");

        } else if (code == 2) {
            System.out.println("Mechanical Department");

        } else if (code == 3) {
            System.out.println("Civil Department");

        } else if (code == 4) {
            System.out.println("IT Department");

        } else if (code == 5) {
            System.out.println("Electrical Department");

        } else {
            System.out.println("Electronic Department");

        }

        System.out.println("--------------------------------");

    }
}

//child class
class Student4 extends College {
    // instance variable
    // actual parameter
    int studentId;
    String studentName;
    int marks;

    Student4(int id, String name, int m) // formal parameter
    {
        studentId = id;
        studentName = name;
        marks = m;
        System.out.println("Student Constructor3");
    }

    void displayStudent() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Studnet Name : " + studentName);
        System.out.println("Marks  : " + marks);
    }

    // if-else
    void result() {
        if (marks >= 75) {
            System.out.println("Result : Distinction");
        } else if (marks >= 50) {
            System.out.println("Result : Pass");

        } else {
            System.out.println("Result : Fail");

        }
        System.out.println("--------------------------------");

    }

    // switch case
    void courseSelection(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Java Full Stack");
                break;
            case 2:
                System.out.println("Cyber Security");
                break;
            case 3:
                System.out.println("Data Analytics");
                break;
            default:
                System.out.println("Invalid Course");
        }
        System.out.println("--------------------------------");
    }

    void subjects() {
        // array length start from 1--------5
        // array indexing start from -------0
        String sub[] = { "Java", "SQL", "HTML", "CSS", "Javascript" };// element of an array----Java,SQL....
        System.out.println("Subjects:");

        // length------it is property
        for (int i = 0; i < sub.length; i++) {

            System.out.println(sub[i]);// Java---SQL----HTML----CSS---Javascript

        }
        System.out.println("--------------------------------");
    }

}

//Main class
public class Inheritance2 {
    public static void main(String args[]) {
        Student4 s1 = new Student4(11, "Edzil", 91);
        s1.universityRules();
        s1.displayUniversity();
        s1.displayCollege();
        s1.departmentCheck(1);
        s1.displayStudent();
        s1.result();
        s1.courseSelection(1);
        s1.subjects();
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        //upcasting
        //reference of parent & object of child
        University u1=new Student4(22,"Amit",78);
        u1.universityRules();
        u1.displayUniversity();
        System.out.println("--------------------------------");

        College c1=new Student4(33,"Vishal",67);
        c1.displayCollege();
        c1.departmentCheck(2);
        System.out.println("--------------------------------");









    }
}
