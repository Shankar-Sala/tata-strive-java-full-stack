package Extra;

/*
A hospital want to manage:
doctor details
patient details
both doctor and patient belong to same hospital
 */
class Hospital6{
    static String hospitalName ="Tata Strive Hospital";
    final String countryName ="India";
    Hospital6(){
        System.out.println("-------------------------");
        System.out.println("Hospital System Started");
        System.out.println("-------------------------");
    }
    void displayHospital(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Country Name: "+countryName);
    }
}
class Doctor6 extends Hospital6{
    String doctorName;
    String specialization;
    int experience;
    boolean available=true;
    Doctor6(){
        System.out.println("Doctor Constructor");
    }
    void displayDetails(String doctorName,String specialization,int experience){
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Specialization: "+specialization);
        System.out.println("No. of Experience: "+experience);

        if (available == true) {
            System.out.println("Doctor Available");
        }
        else {
            System.out.println("Doctor Not Available");
        }

        // consultation fee
        if (specialization.equals("Cardiologist")) {
            System.out.println("Consultation Fee: 1000");
        }
        else if (specialization.equals("Dentist")) {
            System.out.println("Consultation Fee: 500");
        }
        else {
            System.out.println("Consultation Fee: 300");
        }
    }
}
class Patient6 extends Hospital6{
    String patientName;
    int age;
    int mobileNumber;
    Patient6(){
        System.out.println("Patient Constructor");
    }
    void displayPatient(String patientName,int age,int mobileNumber){
        System.out.println("Patient Name: "+patientName);
        System.out.println("Patient Age:"+age);
        System.out.println("Patient Contact Number: "+mobileNumber);
        if (age < 12) {
            System.out.println("Child Department");
        }

        else if (age > 60) {
            System.out.println("Senior Citizen Department");
            System.out.println("Emergency Attention Needed");
        }

        else {
            System.out.println("General Department");
        }
    }
}
public class CaseStudy7 {
   public static void main(String[] args){
       Doctor6 d6 = new Doctor6();
       d6.displayHospital();
       d6.displayDetails("Vivek","Cardiologist",5);

       Patient6 p6 = new Patient6();
       p6.displayPatient("Shabina",21,12345);
   }

}
