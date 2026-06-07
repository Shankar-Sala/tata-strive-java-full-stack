package basic_code;

/*
 *Upcasting
 *---to achieve flexibility
 *---to achieve run time polymorphism

 */
//parent class
class Animal1 {
    void sound() {

        System.out.println("Animal Sound");
    }
}

//child class
class Dog1 extends Animal1 {
    void sound() {

        System.out.println("Dog Barking");
    }
}

//child class
class BabyDog extends Dog1 {
    void sound() {

        System.out.println("BabyDog Barking");
    }
}

public class Poly3 {
    public static void main(String args[]) {

        BabyDog b11 = new BabyDog();
        b11.sound();

        System.out.println("----------------------");
        System.out.println("----------------------");

        // upcasting
        //flexibility---One parent reference --for many child object
        //Runtime Polymorphism---Child method executes
        //less code

        Animal1 a1 = new Dog1();
        a1.sound();
        Animal1 a2 = new BabyDog();
        a2.sound();

    }
}