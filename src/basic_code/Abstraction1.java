package basic_code;


abstract class Bank7{
    //abstract method
    //Does not have body and attached with abstract keyword.....
    abstract void  interestRate();

    //normal method-- non-abstract method
    void bankRules(){
        System.out.println("Follow RBI Rules");
    }
}

class SBI extends Bank7{
    void interestRate(){
        System.out.println("Sbi Interest: 7%");
    }
}
public class Abstraction1 {
    static void main(String[] args) {
        SBI s1 = new SBI();
        s1.interestRate();
        s1.bankRules();
    }
}
