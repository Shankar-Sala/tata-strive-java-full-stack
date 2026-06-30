package Extra;

abstract class Institute1{
    static String instituteName="Tata Strive";
    final String country="India";
    static{
        System.out.println("Quiz System Started...");
    }
    Institute1(){
        System.out.println("Institute Constructor");
    }
    abstract void quizRules();
    void instituteDetails(){
        System.out.println("Institute Name: "+instituteName);
        System.out.println("Country Name: "+country);
    }
}
class Student1 extends Institute1{
    String studentName;
    int rollNo;
    public  Student1(String studentName,int rollNo){
        this.studentName = studentName;
        this.rollNo = rollNo;
    }
    void quizRules(){
        System.out.println("No Negative Marking");
    }
    void studentDetails(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Student Roll No.: "+rollNo);
    }
}
class Quiz extends Student1 {
    int totalMarks;

    public Quiz(String studentName, int rollNo, int totalMarks) {
        super(studentName, rollNo);
        this.totalMarks = totalMarks;
        System.out.println("Quiz Constructor");
    }

    // Method Overriding
    void instituteDetails() {
        super.instituteDetails();
        System.out.println("Welcome to Quiz Competition");
    }
    // if-else
    void resultStatus() {
        if (totalMarks >= 80) {
            System.out.println("Excellent Performance");
        } else if (totalMarks >= 60) {
            System.out.println("Good Performance");
        } else if (totalMarks >= 40) {
            System.out.println("Average Performance");
        } else {
            System.out.println("Fail");
        }
    }

    // switch-case
    void subjectSelection(int choice) {
        switch (choice) {
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

    // array+for loop
    void mcqQuestions() {
        String questions[] = { "1. Java is Platform Independent",
                "2. JVM Executes Bytecode",
                "3. Constructor Name Same As Class",
                "4. Array Index Starts From 0",
                "5. Inheritance Reuses Code" };

        System.out.println("Quiz Questions:");
        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
        }
    }

    // ++/--
    void scorecalculation() {
        int a = 5;
        int b = ++a + a++ + a;
        System.out.println("Score Calculation = " + b);
    }

    //this concept
//method chaining...
    Quiz addBonusMarks(int bonus)
    {
        this.totalMarks = this.totalMarks+bonus;
        return this;
    }
    //this concept
    Quiz displayMarks()
    {
        System.out.println("Updated Marks: "+totalMarks);
        return this;
    }

}
class Trainer extends Quiz
{
    String trainerName;

    public Trainer(String studentName, int rollNo, int totalMarks, String trainerName) {
        super(studentName, rollNo, totalMarks);
        this.trainerName = trainerName;
        System.out.println("Trainer Constructor");
    }

    void trainerDetail()
    {
        System.out.println("Trainer Name : " + trainerName);
    }

    void attendanceStatus(int attendance)
    {
        if(attendance >= 90)
        {
            System.out.println("Eligible for Placement");
        }
        else
        {
            System.out.println("Improve Attendance");
        }
    }
}


public class Project1 {
    public static void main(String[] args){
        Trainer t1=new Trainer("Shabina",05,95,"Sonam");
        t1.instituteDetails();
        t1.quizRules();
        t1.studentDetails();
        t1.trainerDetail();
        t1.resultStatus();
        t1.subjectSelection(1);
        t1.mcqQuestions();
        t1.scorecalculation();
        //method chaining
        t1.addBonusMarks(20).displayMarks();
        t1.attendanceStatus(85);

        Institute1 i1 = new Trainer("Shabina",05,95,"Sonam");
        i1.quizRules();
        System.out.println("Institute Name: "+Institute1.instituteName);
        int marks[]={70,80,75,89,78};
        int total=0;
        for (int i = 0;i< marks.length;i++){
            total = total + marks[i];
        }
        System.out.println("Total Marks: "+total);
        for (int i=1;i<=3;i++){
            for (int j=1;j<=2;j++){
                System.out.println("Quiz round: "+i+"Questions: "+j);
            }
        }
    }
}
