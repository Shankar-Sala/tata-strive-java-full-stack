package Instance_Of_Operator;
/*
* strickfp----------------Strick floating point
* strickfp -- it is a keyword
* It ensures that floating point calculations (float and double) produce the same result.
* the same result on all platform ---- window, linux, mac
* strictfp is a keyword
* Used with floating-point calculations.
* Ensures platform-independent results.
*
* can be applied to a class.
* strictfp class Demo
* {
*
* }
*
* Can be applied to a method.
* strictfp void show()
* {
* }
*
* cannot be applied to variables.
* cannot be applied to constructors.
* Mostly used in scientific and financial applications.
* works only with floating-point calculations.
* from modern Java versions, floating-point calculation are already standardized,
* so strictfp is rarely used today.
*
*
*
*
*  */


strictfp class InterestCalculator{
    double calculateInterest(){
        double principal = 1000.8007;
        double rate = 8.75;
        double interest = (principal * rate)/ 100;
        return interest;
    }
}

public class Strict_FP {
    static void main(String[] args) {
        InterestCalculator obj = new InterestCalculator();
        System.out.println("Interest : "+obj.calculateInterest());
    }
}


/*
*
strictfp class InterestCalculator{
    strictfp double calculateInterest(){
        double principal = 1000.8007;
        double rate = 8.75;
        double interest = (principal * rate)/ 100;
        return interest;
    }
}

public class Strict_FP {
    static void main(String[] args) {
        InterestCalculator obj = new InterestCalculator();
        System.out.println("Interest : "+obj.calculateInterest());
    }
}

* */