package basic_code;

class Institute {
    // static variable
    static String instituteName = "Tata STRIVE";
    // Final variable
    final String country = "India";

    // static block
    static {
        System.out.println("Institute System Started\n");

    }

    // static method
    static void displayInstitute() {
        System.out.println("Institute Name : " + instituteName);
    }

    // Normal Method
    void displayCountry() {
        System.out.println("Country : " + country);
        System.out.print("-----------------------------");

    }
}

class Trainer {
    // instance variable
    String trainerName;
    String domain;

    void displayTrainer() {
        System.out.println("Trainer Name : " + trainerName);
        System.out.println("Domain : " + domain);
        System.out.println("--------------------------");
    }

    static void trainerMessage() {
        System.out.println("\nWelcome Trainers");
        System.out.println("--------------------------");
    }
}

class Student1 {
    // staic variable
    static int batchCode = 101;

    // Instance variable
    String studentName;

    // Final variable
    final String course = "Java Full Stack";

    void displayStudent() {
        System.out.println("Student Name : " + studentName);
        System.out.println("Course : " + course);
    }

    static void batchInfo() {
        System.out.println("Batch Code : " + batchCode);
        System.out.println("--------------------------");
    }

}

public class Static2 {
    public static void main(String args[]) {
        // Calling static method directly using class name
        Institute.displayInstitute();

        // Object for Institute
        Institute i1=new Institute();
        i1.displayCountry();

        Trainer.trainerMessage();

        Trainer t1 =new Trainer();
        t1.trainerName="Sonam";
        t1.domain="Backend";
        t1.displayTrainer();

        Student1.batchInfo();
        Student1 s1=new Student1();
        s1.studentName="Snehal";
        s1.displayStudent();
    }
}



/*
 * Which variable is shared among all objects in the program?

A. trainerName
B. studentName
C. instituteName
D. course
--C

Which keyword is used to create constant variable?

A. static
B. final
C. const
D. fixed

---B

Which method can be called without object creation?

A. displayStudent()
B. displayCountry()
C. displayTrainer()
D. displayInstitute()

---D

What is the output of static block?

A. Executes after main()
B. Executes before main()
C. Executes only with object
D. Never executes

---B


Which variable belongs to object?

A. instituteName
B. batchCode
C. trainerName
D. country

---C

Which variable value cannot be changed?

A. studentName
B. instituteName
C. batchCode
D. country

D

Which class contains static block?

A. Student
B. Trainer
C. Institute
D. Main

---C

Which statement is correct for static method?

A. Requires object
B. Belongs to object
C. Belongs to class
D. Cannot be called

---C

 */











