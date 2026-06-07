package basic_code;
//date: 28-05-2026
//what is static block

//abstract class
abstract class Institute1{
    static  String instituteName = "Tata Strive";
    //final variable
    final String country = "India";
    static {
        System.out.println("-------------------------");
        System.out.println("----Quiz System Started----");
        System.out.println("-------------------------");
    }

    //constructor
    Institute1(){
        System.out.println("Institute Constructor3");
    }
    // Abstract Method
    abstract void quizRules();
    void  instituteDetails(){
        System.out.println("Institute : "+ instituteName);
        System.out.println("Country : "+ country);
    }
}

class Student6 extends  Institute1{
    String studentName;
    int rollNo;

    public Student6(String studentName, int rollNo){
        this.studentName =studentName;
        this.rollNo = rollNo;
        System.out.println("Student Constructor3");
    }

    void quizRules(){
        System.out.println("No Negative Marking");
    }
    void studentDetails(){
        System.out.println("Student name: "+ studentName);
        System.out.println("Student RollNo: " + rollNo);
    }
}

class Quiz extends Student6{
    int totalMarks;

    //constructor
    public Quiz(String studentName, int rollNo, int totalMarks){
        super(studentName, rollNo);
        this.totalMarks = totalMarks;
        System.out.println("Quiz Constructor3");
    }
    //if-else
    void resultStatus(){
     if(totalMarks >=80){
         System.out.println("Excellent Performance");
     }else if(totalMarks >= 60){
         System.out.println("Good Performance");
     }else if(totalMarks >= 40){
         System.out.println("Average Performance");
     }else{
         System.out.println("Fail");
     }
    }

    //switch-case
    void subjectSelection(int choice){
        switch(choice){
            case 1:
                System.out.println("Java Selected");
                break;

            case 2:
                System.out.println("Python Selected");
                break;

            case 3:
                System.out.println("SQL Selected");
                break;

            case 4:
                System.out.println("Web Development Selected");
                break;

            default:
                System.out.println("Invalid Subject");
        }
    }

    //array+for loop
    void mcqQuestions()
    {
        String questions[] = {"1. Java is Platform Independent", "2. JVM Executes Bytecode", "3. Constructor3 Name Same As Class", "4. Array Index Starts From 0", "5. Inheritance Resues Code"};
        System.out.println("Quiz Question: ");
        for(int i=0; i<questions.length; i++){
            System.out.println(questions[i]);
        }
    }

    //++/--
    void scoreCalculation(){
         int a = 5;
         int b=++a + a++ + --a;
        System.out.println("Score Calculator : "+b);
    }

    //this concept
    //method chaining...
    Quiz addBonusMarks(int bonus){
        this.totalMarks = this.totalMarks + bonus;
        return this;
    }

    //this concept
    Quiz displayMarks(){
        System.out.println("Updated Marks :"+ totalMarks);
        return this;
    }

}

class Trainer2 extends Quiz{
    String trainerName;
    public Trainer2(String studdentName, int rollNo, int totalMarks, String trainerName){
        super(studdentName, rollNo, totalMarks);
        this.trainerName = trainerName;
        System.out.println("Trainer Constructor3");
    }

    void trainerDetails(){
        System.out.println("Trainer Name : "+trainerName);
    }

    void attendenceStatus(int attendence){
        if(attendence>=80){
            System.out.println("Eligible for placement");
        }else{
            System.out.println("Improve Attendence");
        }
    }
}
public class Project4 {
    static void main(String[] args) {
         Trainer2 t1 = new Trainer2("Om", 11,85, "Sagar Sir");
        System.out.println("------------------------------------");
        //parent method+super
        t1.instituteDetails();
        System.out.println("------------------------------------");
        //abstract Method
        t1.quizRules();
        System.out.println("------------------------------------");
        //student details
        t1.studentDetails();
        System.out.println("------------------------------------");
        //trainer details
        t1.trainerDetails();
        System.out.println("------------------------------------");
        //Result
        t1.resultStatus();
        System.out.println("------------------------------------");
        //switch case
        t1.subjectSelection(2);
        System.out.println("------------------------------------");
        //array+loop
        t1.mcqQuestions();
        System.out.println("------------------------------------");
        //increment operator
        t1.scoreCalculation();
        System.out.println("------------------------------------");
        //method chaining--this
        t1.addBonusMarks(20).displayMarks();
        System.out.println("------------------------------------");
        //attendance
        t1.attendenceStatus(85);
        System.out.println("------------------------------------");

        //upcasting
        Institute1 i1 = new Trainer2("Aman",22,56,"Swati  Maam");
        i1.quizRules();
        System.out.println("------------------------------------");
        //static variable
        System.out.println("Institute Name: "+Institute1.instituteName);
        System.out.println("------------------------------------");

        //array
        int marks[]={70,80,89,78};
        int total = 0;
        for(int i=0; i<marks.length; i++){
            total = total+ marks[i];
        }
        System.out.println("Total Marks : "+total);
        System.out.println("------------------------------------");
        //nested loop
        for(int i=1; i<=3; i++){
            for(int j=1; j<=2; j++){
                System.out.println("Quiz Round: "+i+"  Question : "+j);
            }
        }

    }
}
