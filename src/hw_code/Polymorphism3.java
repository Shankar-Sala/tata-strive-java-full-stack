package hw_code;

class Employee22 {

    void work() {

        System.out.println("Employee Working");
    }
}

class Manager extends Employee22 {

    void work() {

        System.out.println("Manager Managing Team");
    }
}

public class Polymorphism3 {

    public static void main(String[] args) {

        Employee22 e1 = new Manager();

        e1.work();
    }
}