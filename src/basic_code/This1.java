package basic_code;
/*
* This iy is a keyword
* access current class variable, method and constructor....
* local variable --instance variable..inside class outside method
* formal & actual...
* this.variablename
* */


class Bank5
//    instance variable..inside class outside method
{
    String customerName;
    int balance;

    Bank5(String c, int b){
        customerName = c;
        balance = b;
    }

    void display(){
        System.out.println("Customer Name :"+ customerName);
        System.out.println("Balance :"+ balance);
    }

    void deposit(int amount){
        balance = balance + amount;
        System.out.println("Updated Balance : "+balance);
    }
}

public class This1 {
    static void main() {
        Bank5 b1 = new Bank5("Shankar", 500000);
        b1.display();
        b1.deposit(50000);
    }
}
