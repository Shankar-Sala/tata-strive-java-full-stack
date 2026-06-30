package java8Features;

import java.util.ArrayList;

class Vehicle {
    String name;
    int price;

    Vehicle(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return name + " - " + price;
    }
}

public class StreamAPI_Vehicle {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Vehicle("BMW", 80));
        vehicles.add(new Vehicle("Audi", 60));
        vehicles.add(new Vehicle("Toyota", 25));
        vehicles.add(new Vehicle("BMW", 80));


        System.out.println("Original Vehicles");
        System.out.println(vehicles);


        System.out.println("\nPrice above 50 lakh");
        vehicles.stream()
                .filter(v -> v.price >= 50)
                .forEach(System.out::println);


        System.out.println("\nSorted Vehicles");
        vehicles.stream()
                .sorted((v1, v2) -> v1.price - v2.price)
                .forEach(System.out::println);


        long count = vehicles.stream()
                .filter(v -> v.price >= 50)
                .count();

        System.out.println("\nPremium Vehicle Count : " + count);
    }
}