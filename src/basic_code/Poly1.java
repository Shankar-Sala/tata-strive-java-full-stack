package basic_code;

/*
 * Polymorphism in Java
 * IMP Concept in OOP
 * many forms
 * one thing----> can be many form of ways...
 * Human being---->Doctor---Teacher---Nurse---can perform different roles.
 * 2 TYPES-----Method Overloading---Compile------Static
 *        -----Method Overriding----Run--------Dynamic
 *
 *     -Method Overloading---same class
 *     ----------------------same method name
 *     ----------------------but list of parameter are different...
 */
//Method Overloading
class Calculate {

    void add(int a, int b) {
        System.out.println(a + b);
    }

    void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add(int a, int b, int c, int d) {
        System.out.println(a * b + c+d);
    }

}

public class Poly1 {
    public static void main(String args[]) {
        Calculate c11 = new Calculate();
        c11.add(12, 12);
        c11.add(12, 12,3);
        c11.add(2, 3,3,4);


    }
}