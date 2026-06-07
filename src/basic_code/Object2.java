package basic_code;

public class Object2 {
    String productName;
    double price;

    // parameterised method
    void applyDiscount(double discount) {
        price = price - (price * discount / 100);
        System.out.println("Discount applied");
    }

    void display() {
        System.out.println("Product :" + productName);
        System.out.println("Final Price: " + price);

    }

    public static void main(String args[]) {
        Object2 o1 = new Object2();
        o1.productName = "Laptop";
        o1.price = 80000;
        // method calling
        o1.applyDiscount(10);
        o1.display();

    }
}
