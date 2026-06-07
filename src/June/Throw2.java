package June;

public class Throw2 {
    static void main(String[] args) {
        int balance1 = 80000;
        int withdraw = 50000;
        try {
            if (withdraw > balance1)
                {
                    throw new ArithmeticException("Insufficient Balance");
                }
                System.out.println("withdrawal Successful");
            }
         catch(ArithmeticException e1){
                System.out.println(e1.getMessage());
            }
        }
    }

