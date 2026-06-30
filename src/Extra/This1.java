package Extra;

/*
this-it is a keyword
access current class variable, method & constructor...
local variable--instance variable.
formal & actual.
this.variablename
 */
/*
class Bank5 {
    //instance variable
    String customerName;
    int balance;

    Bank5(String c, int b) {
        customerName = c;
        balance = b;
    }

    void display() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Balance : " + balance);
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Updated Balance : " + balance);
    }
}

public class This1 {
    public static void main(String args[]) {
        Bank5 b1 = new Bank5("Shabina", 5000);
        b1.display();
        b1.deposit(50000);
    }
}
*/
/*
class Demo3
{
    Demo3()
    {
        //calling constructor using this
        this(6000);
        System.out.println("Default constructor...!");
    }

    Demo3(int a)
    {
        System.out.println(a);
    }
}

public class This1 {
    public static void main(String args[]) {
        Demo3 dd1 = new Demo3();
    }
}
*/
/*
class Test{
    void display(Test t){
        System.out.println("Method called ...");
    }
    void show(){
        display(this);
    }
}
public class This1 {
    public static void main(String args[]) {
        Test t1 = new Test();
        t1.show();
    }
}
*/
/*
class Demo
{
    Demo show()
    {
        return this;
    }
    void display() {
        System.out.println("Hello Java");
    }
}

public class This1 {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.show().display();
    }
}
*/
class Influence {
    static String platform = "Instagram";
    final String country = "India";
    String name;
    int followers;

    Influence()
    {

    }

    void show()
    {

    }

    public Influence(String name, int followers) {
        this.name = name;
        this.followers = followers;
        System.out.println("Influencer Account Created");
    }

    Influence increaseFollowers(int addFollowers) {
        this.followers = this.followers + addFollowers;
        return this;
    }

    Influence displayProfile() {
        System.out.println("Platform : " + platform);
        System.out.println("Country : " + country);
        System.out.println("Influencer Name : " + this.name);
        System.out.println("Followers : " + this.followers);
        return this;
    }

    void checkFollowers()
    {
        if (this.followers>=1000000){
            System.out.println("Blue Tick Approved");
        }
        else {
            System.out.println("Keep Growing");
        }
    }
    void contentTypes() {
            String content[] = {"Reels", "Vlogs", "Gaming", "Education"};
            System.out.println("Content Categories:");
            for (int i = 0; i < content.length; i++) {
                System.out.println(content[i]);
            }
        }
    }

    public class This1 {
        public static void main(String args[]) {
            Influence i1 = new Influence("Vishakha", 70000);
            System.out.println("----------------------------");
            //method chaining
            i1.increaseFollowers(6000).displayProfile();
            System.out.println("----------------------------");
            i1.checkFollowers();
            System.out.println("----------------------------");
            i1.contentTypes();
        }
    }




