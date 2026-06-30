package basic_code.com;

import basic_code.access_modifier.Animal;

public class Dog extends Animal {

    void bark() {
        sound(); 
    }

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.bark();
    }
}