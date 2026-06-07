package June;

/*
 * Problem Statement

Create a Smart Student Management System where:

Student age must be validated.
Student marks must be validated.
Invalid age should throw exception.
Invalid marks should throw exception.
Method should use throws.
Main method should handle exception using try-catch.
finally should execute every time.
 */
class Student11 {
    String name;
    int age;
    int marks;

    public Student11(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void validateStudent() throws ArithmeticException {
        System.out.println("Validation Started....!");
        if (age < 18) {

            throw new ArithmeticException("Age Must Be 18+");
        }

        if (marks < 0 || marks > 100) {
            throw new ArithmeticException("Invalid Marks");
        }
        System.out.println("Validation Successful");
    }

    void displayStudent() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
    }
}

public class Excep1 {
    public static void main(String[] args) {

        System.out.println("===== STUDENT SYSTEM =====");
        try {
            Student11 s1 = new Student11("Sonam", 5, 80);
            s1.displayStudent();
            System.out.println("---------------------------------------------");
            try {
                System.out.println("Nested Try Started");

                int arr[] = new int[2];

                arr[5] = 100;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Error");

                System.out.println(e.getMessage());
            } finally {
                System.out.println("Nested Finally");
            }

            s1.validateStudent();

            System.out.println("Validation Completed");
        } catch (Exception e) {

            System.out.println("General Exception");
        }

        finally {

            System.out.println("Main Finally Executed");
        }
        System.out.println("---------------------------------------------");
        try {
            String name = null;
            System.out.println(name.length());
        } catch (NullPointerException e) {
            System.out.println("Null Error Handled");
        } finally {
            System.out.println("Second Finally");
        }
        System.out.println("---------------------------------------------");

    }
}
