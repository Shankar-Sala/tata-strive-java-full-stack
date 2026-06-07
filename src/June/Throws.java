package June;

/*
* -----throws keyword is used to declare an exception.
* --------throws is used in method declaration
* ----it declares an exception
* ----------it does bot handle the exception
* ----Multiple exceptions  can be declared
* ---used mainly with checked exception
* --- written after
*
*
*
* throw--used inside method
* ---declares exception
* followed by class name
* --- Multiple exception possible
*
*
*
*
* */


/*class Bank4{
  void withdraw(int balance2, int amount1) throws ArithmeticException{
      if(amount1 > balance2){
          throw new ArithmeticException("insufficient balance");
      }
        System.out.println("withdrawal Successful");
    }
}



public class Throws {
    static void main() {

        Bank4 bb1 = new Bank4();

        try{
            bb1.withdraw(8000,10000);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}*/

//program without throw
public class Throws{
    static void main() {
        int balance = 8000;
        int withdraw = 5000;
        if(withdraw > balance){
            System.out.println("Insufficient Balance");
        }else{
            System.out.println("withdrawal Successful");
        }
    }
}
