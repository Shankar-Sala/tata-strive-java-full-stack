package hw_code;
//E-Shop Management System
class Shop {

    String shopName = "Online Mart";

    void displayShop() {

        System.out.println("Shop Name : " + shopName);
    }
}

class Product extends Shop {

    int productId;
    String productName;
    double price;

    Product(int id, String name, double p) {

        productId = id;
        productName = name;
        price = p;
    }

    void displayProduct() {

        System.out.println("Product ID : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price : " + price);
    }
}

public class Inheritance2 {

    public static void main(String[] args) {

        Product p1 = new Product(11, "Laptop", 55000);

        p1.displayShop();
        p1.displayProduct();
    }
}
