package hw_code;


abstract class Shop2 {

    abstract void payment();
}

class OnlineShop extends Shop2 {

    void payment() {

        System.out.println("Online Payment Successful");
    }
}

public class Abstraction2 {

    public static void main(String[] args) {

        OnlineShop o1 = new OnlineShop();

        o1.payment();
    }
}
