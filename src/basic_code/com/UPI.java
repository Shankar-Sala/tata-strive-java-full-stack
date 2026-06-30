package basic_code.com;

public class UPI implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment Successful");
    }
}