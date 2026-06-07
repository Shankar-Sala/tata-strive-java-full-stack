package hw_code;


class Library12 {

    void issueBook() {

        System.out.println("Issue Normal Book");
    }

    void issueBook(String name) {

        System.out.println("Issue Book : " + name);
    }
}

class DigitalLibrary11 extends Library12 {

    void issueBook() {

        System.out.println("Issue E-Book");
    }
}

public class method1 {

    public static void main(String[] args) {

        DigitalLibrary11 d1 = new DigitalLibrary11();

        d1.issueBook();
        d1.issueBook("Java");
    }
}