package Extra.basic_code.access_modifier;
//private
//Accessible only within the same class.
//Cannot be accessed outside the class.
//Used for data hiding...
/*
Which modifier provides maximum security?
private
Which modifier provides maximum accessibility?
public
What is default access modifier?
No keyword specified.
Can private methods be inherited?
No.
private---only for me
default--same package
I
protected---same package +*+*+*+*+*+child class with another package...
public--everyone...

ranking in protection : private -> default -> protected -> public
 */

class Student {
    private int marks = 90;

    void display() {
        System.out.println("I am a display method()........?");
        System.out.println(marks);
    }
}

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        //System.out.println(s1.marks);
    }
}
