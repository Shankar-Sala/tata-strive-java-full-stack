package basic_code;


abstract class Animal5 {
    abstract void sound();

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Dog2 extends Animal5 {
    void sound() {
        System.out.println("Bark");
    }
}


public class Abstraction {
     static void main(String[] args) {
        Dog2 d2 = new Dog2();
        d2.sound();
        d2.sleep();
    }
}
