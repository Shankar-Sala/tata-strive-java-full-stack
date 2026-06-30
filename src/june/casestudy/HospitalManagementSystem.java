package june.casestudy;
/*
* Tata Strive wants to develop a smart hospital management system.
*
* Requirement:
* Hospital has Doctors.
* Patient has Address.
* Hospital HAS-A Doctor(Aggregation).
* Patient HAS-A Address( Aggregation).
* Use constructor and this keyword.
* Use Static variable for patient count.
* use final variable for hospital name.
* use inheritance (Doctor -> Senior Doctor).
* Use abstraction for treatment process.
* use inheritance for billing rules.
* use exception handling 9try-catch-finally)
* use throw for invalid bill amount.
* use instanceof operator
* use upcasting
* Display complete hospital details.
*
*
* */

//interface
interface  Billing{
    void generateBill(double amount);
}

//abstract class
abstract  class Treatment{
    abstract  void treatmentProcess();
}

//Aggregation Class
class Address44{
    String city;
    String state;

    public Address44(String city, String state){
        this.city=city;
        this.state=state;
    }

    void displayAddress(){
        System.out.println("City : "+ city);
        System.out.println("State : "+ state);
    }
}

//Parent Class
class Doctor44{
    protected String doctorName;

    public Doctor44(String doctorName){
        this.doctorName = doctorName;
    }

    void displayDoctor(){
        System.out.println("Doctor: "+ doctorName);
    }
}

//child class
class SeniorDoctor extends Doctor44{
    public SeniorDoctor(String doctorName){
        super(doctorName);
    }

    void displayDoctor(){
        System.out.println("Senior Doctor : "+ doctorName);
    }
}

class Patient extends Treatment implements Billing{
    static  int patientCount = 0;
    final String HOSPITAL =" Tata Strive Hospital";

   int patientId;
    String patientName;
    //Aggregation
    Address44 address44;
    //Aggregation
    Doctor44 doctor44;

    public Patient(int patientId, String patientName, Address44 address44, Doctor44 doctor44){
        this.patientId =patientId;
        this.patientName = patientName;
        this.address44 = address44;
        this.doctor44 = doctor44;
    }

    void displayPatient(){
        System.out.println("\nHospital : "+HOSPITAL);
        System.out.println("Patient ID : patientId");
        System.out.println("Patient Name : "+patientName);
        address44.displayAddress();

        doctor44.displayDoctor();
    }

    void treatmentProcess(){
        System.out.println("Treatment Started");
    }

    public void generateBill(double amount){
        try{
            if(amount <=0 ){
                throw new ArithmeticException("Invalid Bill Amount");
            }
            System.out.println("Bill : ₹"+ amount);
        }catch (ArithmeticException ee1){
            System.out.println(ee1.getMessage());
        }finally {
            System.out.println("Billing Completed");
        }
   }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        System.out.println("====Tata Strive Hospital======");
        Address44 a1 = new Address44("Mumbai", "Maharashtra");
        Doctor44 d1 =new SeniorDoctor("Dr. Ram");
        Patient p1 = new Patient(101, "rahul", a1, d1);
        p1.displayPatient();
        p1.treatmentProcess();
        p1.generateBill(8000);
        System.out.println("------------------------");
        p1.generateBill(-5000);
        System.out.println("-------------------");
        System.out.println(d1 instanceof  Doctor44);
        System.out.println(d1 instanceof  SeniorDoctor);
        System.out.println("Thank You");
    }
}