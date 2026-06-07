package hw_code;


class Shop33 {

    String shopName;

    Shop33(String shopName) {

        this.shopName = shopName;

        System.out.println("Shop Name : " + shopName);
    }
}

class Product12 extends Shop33 {

    int productId;
    String productName;

    final double GST = 18.0;

    Product12(String shopName, int productId, String productName) {

        super(shopName);

        this.productId = productId;
        this.productName = productName;
    }

    void displayProduct() {

        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("GST : " + GST + "%");
    }
}

public class superKey {

    public static void main(String[] args) {

        Product12 p1 = new Product12("Online Mart", 101, "Laptop");

        p1.displayProduct();
    }
}