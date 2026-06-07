package basic_code;

class Constructor2 {

    final int a;

    Constructor2() {

        a = 100;
    }

    void display() {

        System.out.println(a);
    }

    public static void main(String[] args) {

        Constructor2 t1 = new Constructor2();

        t1.display();
    }
}
//Final variable can be initialized inside constructor.

 /*

 class Student {

 Student() {

     System.out.println("Constructor3 Called");
 }

 public static void main(String[] args) {

     Student s1 = new Student();

     Student s2 = new Student();

     Student s3 = new Student();
 }
}

 */