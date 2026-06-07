package basic_code;
/*
 * Method Overriding
 *-----inheritances must
 * -----Method name same-------list of parameter same-------but  different class
 * -----to achieve method overriding ----inheritance is compalsary
 *
 */

//parent class
class Animal {
    void sound() {

        System.out.println("Animal Sound");
    }
}

//child class
class Dog extends Animal {
    void sound() {

        System.out.println("Dog Barking");
    }
}

public class Poly2 {
    public static void main(String args[]) {


        Dog d1 = new Dog();
        d1.sound();
    }
}