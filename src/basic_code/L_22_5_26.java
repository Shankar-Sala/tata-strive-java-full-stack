package basic_code;


import jdk.dynalink.beans.StaticClass;

/* Hospital
          /      \
        Doctor    Patient*/
/*class Hospital {
    void diaplayDetail(){
        System.out.println("--------------------------------");
        System.out.println("TATA HOSPITAL");
        System.out.println("--------------------------------");
        System.out.println("\n");
    }

}

class Doctor extends Hospital{

    void displayDoc(String b,String c ){
        System.out.println("-----Doctor Details-----");
        System.out.println("Doctor appointed: "+b);
        System.out.println("Specialization: "+c);
        System.out.println("--------------------------------");
    }
}

class Patient extends Hospital{

    void displayPatient(String a, int d, String e){

        System.out.println("\n-----Patient Details-----");
        System.out.println("Patient Name:  "+a);
        System.out.println("Patient Age: "+ d);
        System.out.println("Patient Disease: "+e);
    }
}

public class Main {
    static {
        System.out.println("-----Hospital Managemnet System-----\n");
    }
    public static void main(String[] args) {
        Doctor d1 = new Doctor();
        d1.diaplayDetail();
        d1.displayDoc("Dr.Shelar", "Cardiologist");
        Patient p1 = new Patient();
        p1.displayPatient("Sumit Shelar", 22, "Heart Blockage");
    }
}*/


/*class Company {
    int salary=90000;

    void show(){
        System.out.println("I am parent class..........");
    }

    Company (){
        System.out.println("i am p-constructor");
    }
}

class Employee extends Company{
    int salary=100000;

    void display(){
        System.out.println("C-class salary "+salary);
        System.out.println("P-class salary "+super.salary);
    }

    void show(){
        super.show();
        System.out.println("I am child class..........");
    }

    Employee (){
        System.out.println("i am c-constructor");
    }

}

public class Main {
    public void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        e1.show();

    }
}*/



/*class Animal{
    final int age=10;

    void show(){
        System.out.println("Animal Sound");

    }
    Animal(){
        System.out.println("Animals are good");
        System.out.println("Age "+age);
    }
}

class Dog extends Animal{

    void show(){
        super.show();
        System.out.println("Dog Barking");
    }

    void dogAge(int age){
        System.out.println("Dog Age "+age);

    }
}

public class Main {
    static void main(String[] args) {
        Dog d1 = new Dog();
        d1.show();
        d1.dogAge(12);
    }
}*/


/*
class Railway{
    static String railwayName = "Indian Railway";
    final String country = "India";
    int fare= 500;

    static {
        System.out.println("Railway System Started");
    }

    Railway(){
        System.out.println("Railway Construtor");
    }

    void railwayDetails(){
        System.out.println("RAilway Name "+railwayName);
        System.out.println("Country "+country);
    }

    void ticketType(){
        System.out.println("General Ticket");
    }
}

class Passenger extends Railway{
    String passengerName;
    int age;
    int fare =1000;

    Passenger(String name, int ag){
        passengerName=name;
        age=ag;
    }

    void passengerDetails(){
        System.out.println("Name:"+passengerName);
        System.out.println("Age:"+age);
    }

    void ticketType(){
        super.ticketType();
        System.out.println("AC coach Ticket");
    }

    void  ageCategory(){
        if (age>60){
            System.out.println("Senior Citizen");
        }else {
            System.out.println("Regular Passenger");
        }
    }

    void coachSelection(int choice){
        switch (choice){
            case 1:
                System.out.println("Sleeper coach");
                break;
            case 2:
                System.out.println("Ac coach");
                break;
            case 3:
                System.out.println("First coach");
                break;
            default:
                System.out.println("Invalid Coach");
                break;
        }
    }

    void station(){
        String station[] = {"Mumbai", "Nagpur", "Kanpur", "Jaipur"};
        System.out.println("Stations: ");

        for (int i=0;i<station.length;i++){
            System.out.println(station[i]);
        }
    }

    void ticketCalculaton(){
        int a=5;
        int b= ++a + a++;
        System.out.println("Value of b "+b);
    }
}

public class Main {
    static void main(String[] args) {
        Passenger p1 = new Passenger("Sumit", 22);
        p1.railwayDetails();
        System.out.println("--------------------------------");
        p1.ticketType();
        System.out.println("--------------------------------");
        p1.passengerDetails();
        System.out.println("--------------------------------");
        p1.ageCategory();
        System.out.println("--------------------------------");
        p1.coachSelection(2);
        System.out.println("--------------------------------");
        p1.station();
        System.out.println("--------------------------------");
        p1.ticketCalculaton();
        System.out.println("--------------------------------");
        Railway r1 = new Passenger("SUjal", 21);
        r1.ticketType();
    }
}*/




public class L_22_5_26 {
}
