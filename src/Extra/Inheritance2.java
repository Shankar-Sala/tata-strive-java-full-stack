package Extra;

class University {

    static String universityName = "Tata STRIVE University";
    final String country = "India";

    static {
        System.out.println("------------------------------------");
        System.out.println("University System Started");
        System.out.println("------------------------------------\n");
    }

    University() {
        System.out.println("University Constructor");
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

class College extends University{
    String collegeName="Engineering College";
    College(){
        System.out.println("College Constructor");
    }
    void displayCollege(){
        System.out.println("College Name: "+collegeName);
    }

    void departmentCheck(int code) {
            if (code == 1)
            {
                System.out.println("Computer Department");
            }
            else if (code == 2)
            {
                System.out.println("Mechanical Department");
            }
            else if (code == 3)
            {
                System.out.println("Civil Department");
            }
            else if (code == 4)
            {
                System.out.println("IT Department");
            }
            else if (code == 5)
            {
                System.out.println("Electrical Department");
            }
            else
            {
                System.out.println("Electronic Department");
            }
        }


}
class Student4 extends College {
    // Instance variable
    // actual parameter
    int studentId;
    String studentName;
    int marks;

    Student4(int id, String name, int m) // formal parameter
    {
        studentId = id;
        studentName = name;
        marks = m;
        System.out.println("Student Constructor");
    }
    void displayStudent(){
        System.out.println("Student ID: "+studentId);
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Marks: "+marks);
    }

    void result() {
        if (marks >= 75) {
            System.out.println("Result : Distinction");
        } else if (marks >= 50) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
        System.out.println("------------------------------------");
    }
    void courseSelection(int choice){
        switch(choice){
            case 1:
                System.out.println("Java Full Stack ");
                break;
            case 2:
                System.out.println("Cyber Security");
                break;
            case 3:
                System.out.println("Data Analyst");
                break;
            default:
                System.out.println("Invalid Course");
                break;
        }
        System.out.println("------------------------------------");
    }
    void subject(){
        String sub[] ={"Java","SQL","HTML","CSS","JavaScript"};
        System.out.println("Subjects: ");
        for(int i=0;i<sub.length;i++){
            System.out.println(sub[i]);
        }
        System.out.println("------------------------------------");
    }
}




public class Inheritance2 {
    public static void main(String[] args){
        Student4 s4 = new Student4(5,"Shabina",95);
        s4.universityRules();
        s4.displayUniversity();
        s4.displayCollege();
        s4.departmentCheck(1);
        s4.displayStudent();
        s4.result();
        s4.courseSelection(1);
        s4.subject();

        //upcasting -- we can call one parent class using child class
        University u1 = new Student4(4,"Saira",91);
        u1.universityRules();
        u1.displayUniversity();
        System.out.println("------------------------------------");

        College c1 = new Student4(24,"Saima",97);
        c1.displayCollege();
        c1.departmentCheck(1);
        System.out.println("------------------------------------");
    }
}
