package hw_code;

class Payment {

    void paymentMode() {

        System.out.println("Cash Payment");
    }
}

class OnlinePayment extends Payment {

    void paymentMode() {

        System.out.println("UPI Payment");
    }
}

public class Polymorphism2 {

    public static void main(String[] args) {

        Payment p1 = new OnlinePayment();

        p1.paymentMode();
    }
}
