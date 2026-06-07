//package basic_code;
//
////store the railways details
////use inheritence
////use construtor
//
//class Railway{
//    static String railwayName="Indian Railways";
//    final String country="India";
//    int fare=500;
//    static{
//        System.out.println("------------------------");
//        System.out.println("Railway mamangement staterd.....");
//        System.out.println("-------------------------");
//    }
//    Railway(){
//        System.out.println("Railways Constructor3  ");
//    }
//    void railwayDetails(){
//        System.out.println("railways Name : "+railwayName);
//        System.out.println("Railways country :"+country);
//    }
//    void ticketType(){
//        System.out.println("general class Ticket");
//    }
//
//}
//class Passenger1 extends Railway{
//    String passengerName;
//    int age;
//    int fare=1000;
//    Passenger1(String pName,int age){
//        this.passengerName=pName;
//        this.age=age;
//    }
//
//    @Override
//    void ticketType(){
//        super.ticketType();
//        System.out.println("AC Coach Ticket ");
//    }
//
//    void passengerDetails(){
//        System.out.println("Passenger Name  : "+ passengerName);
//        System.out.println("Passenger age : "+age);
//        System.out.println("railways general class fare : "+ super.fare);
//        System.out.println("raiways AC class fare : "+fare);
//
//    }
//    void ageCategory(){
//        if(age>=60){
//            System.out.println("Senior Citizen passenger ..");
//        } else {
//            System.out.println("Regular passenger ..");
//        }
//    }
//    void coachSelection(int choice){
//        switch (choice){
//            case 1:
//                System.out.println("Sleeper Coach");
//                break;
//            case 2:
//                System.out.println("3 Ac  Coach");
//                break;
//            case 3:
//                System.out.println("First class Coach");
//                break;
//            default:
//                System.out.println("Invalid option ...");
//
//        }
//    }
//
//    void station(){
//        String[] arr={"Mumbai","Nashik","bhusaval","kandwa","itarsi"};
//        System.out.println("railways stop Station name :");
//        for(int i=0;i<=arr.length-1;i++){
//            System.out.println(arr[i]+" station ");
//        }
//    }
//    void ticketCalculation(){
//        int a=5;
//        int b= ++a + a++;
//        System.out.println("value of ticket is : "+b);
//    }
//
//
//}
//public class CaseStudy5 {
//    public static void main(String[] args) {
//        Passenger1 p1=new Passenger1("Pradeep",40);
//        p1.railwayDetails();
//        System.out.println("---------------------------------");
//        p1.ageCategory();
//        System.out.println("---------------------------------");
//
//        p1.coachSelection(2);
//        System.out.println("---------------------------------");
//
//        p1.ticketType();
//        System.out.println("---------------------------------");
//
//        p1.passengerDetails();
//        System.out.println("---------------------------------");
//
//        p1.ticketCalculation();
//        System.out.println("---------------------------------");
//
//        p1.station();
//        System.out.println("---------------------------------");
//
//
//        Railway r1=new Passenger1("Rahul ",68);
//
//        r1.ticketType();
//
//
//    }
//}
//
