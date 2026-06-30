package basic_code.access_modifier;
//private
//accessible only within the same class.
//cannot be accessed outside class
//used for data hiding....


//default
//---no keyword Modifier
//----no keyword used
//----accessible only within the same package.


/*
* Protected Access Modifier */

class Student{
    private int marks =90;
    void display()
    {
        System.out.println("I am a display method()........");
        System.out.println(marks);
    }
}

public class demo {
    static void main(String[] args) {
     Student s1 = new Student();
     s1.display();
//        System.out.println(s1.marks);
    }
}
