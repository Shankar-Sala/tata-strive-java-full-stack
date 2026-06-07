package basic_code;

//Types of variables in java

//3 types
//local
//static
//instance

//static---Shared by all objects
//Common value for everyone



public class TypesOfVariable1 {

    // Static variable (shared by all students)
    //static belong to class not object
    final static String instituteName = "Tatastrive";

    // instance variable
    String studentName;
    int studentId;
    /*
        static
        {
            instituteName="Aabhas Foundation";
        }
        */
    // method
    void displayStudentDetails() {

        // local variable
        String course = "Java Full Stack";
        System.out.println("Institute Name: " + instituteName);
        System.out.println("Student Name: " + studentName);
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String args[]) {
        // object1
        TypesOfVariable1 tt1 = new TypesOfVariable1();
        tt1.studentName = "Sumit";
        tt1.studentId = 121;

        // object2
        TypesOfVariable1 tt2 = new TypesOfVariable1();
        tt2.studentName = "Mohit";
        tt2.studentId = 122;

        // object3
        TypesOfVariable1 tt3 = new TypesOfVariable1();
        tt3.studentName = "Vishal";
        tt3.studentId = 123;

        //Method calling
        tt1.displayStudentDetails();
        tt2.displayStudentDetails();
        tt3.displayStudentDetails();
        tt1.displayStudentDetails();
        tt2.displayStudentDetails();
        tt2.displayStudentDetails();


    }
}



