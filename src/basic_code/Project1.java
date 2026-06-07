package basic_code;

//class 1
class CalculatorInfo {
    // Static variable
    static String instituteName = "Tata STRIVE";
    // Final variable
    final String calculatorName = "Smart Calculator";

    void displayInfo() {
        System.out.println("\nInstitute : " + instituteName);
        System.out.println("Calculator : " + calculatorName);
        System.out.println("\n");

    }
}

//class 2
class Operation {
    int num1;
    int num2;

    void calculate(int choice) {
        // local variable
        int result;

        // Switch Case
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("---------Addition-------------");
                System.out.println("Result : " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("---------Subtraction-------------");
                System.out.println("Result : " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("---------Multiplication -------------");
                System.out.println("Result : " + result);
                break;
            case 4:
                // if-else condition
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("---------Division -------------");
                    System.out.println("Result : " + result);

                } else {
                    System.out.println("Division by zero not allowed..");
                }
                break;
            default:
                System.out.println("Invalid Choice");

        }
    }
}

//class 3
class WelcomeMessage {
    void showMessage() {
        System.out.println("\n**********************************\n");
        System.out.println("Welcome to Tata STRIVE Calculator\n");
        System.out.println("**********************************");

    }
}

//class 4
public class Project1 {
    public static void main(String args[]) {
        WelcomeMessage w1 = new WelcomeMessage();
        w1.showMessage();

        CalculatorInfo c1 = new CalculatorInfo();
        c1.displayInfo();

        Operation op1 = new Operation();
        op1.num1 = 100;
        op1.num2 = 25;

        // Method calling
        op1.calculate(1);// Addition
        op1.calculate(2);// Subtraction
        op1.calculate(3);// Multiplication
        op1.calculate(4);// Division
        op1.calculate(9);// deafult

    }
}
