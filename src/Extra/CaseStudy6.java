package Extra;

/*
A training institute want to build on Online Exam Result
The system should:
store student marks
calculate result
display grade
use inheritance
use static variable
use final variable
use constructor
use loops and arrays
Rules:
Marks ≥ 75 -> Distinction
Marks ≥ 50 -> Pass
Otherwise → Fail
 */
class Institute{
    static String instituteName="Tata Strive";
    final String countryName="India";
    Institute(){
        System.out.println("Online Exam Result");
    }
    void showInstitute(){
        System.out.println("Institute Name: "+instituteName);
        System.out.println("Country Name: "+countryName);
    }
}
class Student extends Institute{
    String studentName;
    int marks[] = {78, 65, 80, 55, 90};
    int total=0;
    int average;
    Student(){
        System.out.println("Student Result");
    }
    void displayStudent( String studentName){
        System.out.println("Student Name: "+studentName);
    }
    void result(){
        for(int i=0;i < marks.length;i++){
          total = total+marks[i];
        }
        System.out.println("Total Marks: "+total);
        average=total/ marks.length;
        System.out.println("Average Marks: "+average);
        if (average>=75){
            System.out.println("Distinct");
        } else if (average>=50){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }

}

public class CaseStudy6 {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.showInstitute();
        s1.displayStudent("Shabina");
        s1.result();

    }
}
