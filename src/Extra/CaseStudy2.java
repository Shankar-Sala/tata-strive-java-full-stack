package Extra;

/*
 * a hospital want simple java based project:
 * patient record
 * doctor appointment
 * consultation fees
 * medical test info
 * a sys should help hospital staff management appointment efficiently
 * and provide basic hospital services
 */
class HospitalManagement  {
    static String hospitalName ="Reliance Hospital";
    final String country="India";

    static {
        System.out.println("Hospital Management System");
    }

    static void hospitalRule(){
        System.out.println("Follow Hospital Safety Rule");
    }

    void displayHosiptal(){
        System.out.println("Hospital Name: "+hospitalName);
        System.out.println("Country Name: "+country);
    }
}
class PatientManagement
{
    int patientId;
    String patientName;
    int patientAge;

    // Constructor
    PatientManagement(int id, String name, int age) {

        patientId = id;
        patientName = name;
        patientAge = age;
    }

    void displayPatient()
    {
        System.out.println("--------------------------------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Patient Name : " + patientName);
        System.out.println("Patient Age : " + patientAge);
    }

    void patientCategory()
    {

        if(patientAge < 12)
        {
            System.out.println("Child Patient");
        }

        else if(patientAge >= 12 && patientAge <= 59)
        {
            System.out.println("Adult Patient");
        }

        else
        {
            System.out.println("Senior Citizen Patient");
        }

    }
}
class Doctor1 {

    int doctorChoice;

    void selectChoice() {

        switch (doctorChoice) {

            case 1:
                System.out.println("Cardiologist Selected");
                break;

            case 2:
                System.out.println("Neurologist Selected");
                break;

            case 3:
                System.out.println("Orthopedic Selected");
                break;

            case 4:
                System.out.println("General Physician Selected");
                break;

            default:
                System.out.println("Invalid Doctor Choice");
        }

    }

    void cosultationFee() {

        if (doctorChoice == 1) {

            System.out.println("Consultation Fee : 1500");

        } else if (doctorChoice == 2) {

            System.out.println("Consultation Fee : 2000");

        } else if (doctorChoice == 3) {

            System.out.println("Consultation Fee : 800");

        } else {

            System.out.println("Consultation Fee : 800");
        }

        System.out.println("--------------------------------");
    }
}
class Appointment {
    int appointmentNumber;
    Appointment(int number) {
        appointmentNumber = number;
    }
    void appointStatus() {
        if(appointmentNumber<=50) {
            System.out.println("Appointment Confirmed ");
        } else {
            System.out.println("Appointment Not Confirmed ");
        }
    }
    void displayAppointment() {
        System.out.println("Appointment No: "+appointmentNumber);
    }
}
class MedicalTest{
    void displaytest(){
        String test[]= {"Blood Test","X-Ray","MRI Scan","CT Scan"};
        System.out.println("Available Medical Test ");
        for(int i=0;i< test.length;i++) {
            System.out.println(test[i]);
        }
    }
    void testMessage() {
        System.out.println("Medical Test Available 24/7");
    }
}
public class CaseStudy2 {
    public static void main(String[] args) {
        HospitalManagement.hospitalRule();
        HospitalManagement h1 = new HospitalManagement();
        h1.displayHosiptal();

        PatientManagement p1 = new PatientManagement(05,"Shabina",21);
        p1.displayPatient();
        p1.patientCategory();

        Doctor1 d1 = new Doctor1();
        d1.doctorChoice =1;
        d1.selectChoice();
        d1.cosultationFee();

        Appointment a1 = new Appointment(25);
        a1.displayAppointment();
        a1.appointStatus();

        MedicalTest m1 = new MedicalTest();
        m1.displaytest();
        m1.testMessage();

    }

}
