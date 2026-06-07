package basic_code;
/*
class MCQ2 {

	public static void main(String[] args) {

		int a = 10;
		//post increment
		System.out.println(a++);//10----11
		//pre increment---11--12
		System.out.println(++a);//12

		System.out.println(a--);//12
		System.out.println(a);//11




	}
}

//------------
//can not make static refernece to non-static feild a---
*/

/*
class MCQ2 {

    final int a = 100;

    void display() {

        System.out.println(a);
    }

    public static void main(String[] args) {

    	MCQ2 t1 = new MCQ2();

        t1.display();
    }
}
-----------100
*/

/*
class Demo {

    static {

        System.out.println("A");
    }

    public static void main(String[] args) {

        System.out.println("B");
    }
}

---A
---B
----------------------------------------

*/
/*
class MCQ2 {

    int a = 20;

    void show() {

        int a = 50;

        System.out.println(a);
    }

    public static void main(String[] args) {

    	MCQ2 s1 = new MCQ2();

        s1.show();
        System.out.println(s1.a);

    }
}

---50
---20
--------------------------------------




public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++) {

            System.out.print(i + " ");
        }
    }
}
--1 2 3


class Parent {

    void show() {

        System.out.println("Parent");
    }
}

class Child extends Parent {

    void display() {

        System.out.println("Child");
    }
}

public class Main {

    public static void main(String[] args) {

        Child c1 = new Child();

        c1.show();

        c1.display();
    }
}




class Demo {

    int a = 10;

    void change(int a) {

        a = a + 20;

        System.out.println(a);
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();

        d1.change(30);
    }
}


class Demo {

    static {

        System.out.println("Static Block");
    }

    Demo() {

        System.out.println("Constructor3");
    }

    public static void main(String[] args) {

        Demo d1 = new Demo();
    }
}




*/



