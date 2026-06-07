package hw_code;
//Library Management System
class Library {

    String libraryName = "City Library";

    void displayLibrary() {

        System.out.println("Library Name : " + libraryName);
    }
}

class Book extends Library {

    int bookId;
    String bookName;

    Book(int id, String name) {

        bookId = id;
        bookName = name;
    }

    void displayBook() {

        System.out.println("Book ID : " + bookId);
        System.out.println("Book Name : " + bookName);
    }
}

public class Inheritance1 {

    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming");

        b1.displayLibrary();
        b1.displayBook();
    }
}