package Aggregation;

class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;
        this.state = state;
    }
}

class Student {
    String studentName;
    Address address;   

    Student(String studentName, Address address) {
        this.studentName = studentName;
        this.address = address;
    }

    void display() {
        System.out.println("Student Name: " + studentName);
        System.out.println("City: " + address.city);
        System.out.println("State: " + address.state);
    }
}

public class AggregationExample2 {
    public static void main(String[] args) {
        Address a1 = new Address("Mumbai", "Maharashtra");

        Student s1 = new Student("Amit", a1);

        s1.display();
    }
}