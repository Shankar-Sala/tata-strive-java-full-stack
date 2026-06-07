package hw_code;

class Library2 {

    void libraryType() {

        System.out.println("General Library");
    }
}

class DigitalLibrary extends Library2 {

    void libraryType() {

        System.out.println("Digital Library");
    }
}

public class Polymorphism1 {

    public static void main(String[] args) {

        Library2 l1 = new DigitalLibrary();

        l1.libraryType();
    }
}