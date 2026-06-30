package Extra;/*
 * throw is used to create an exception manually.
 * throw new ArithmeticException();
 *
 * ----Only one exception object can be thrown at a time.
 *  -------- throw new ArithmeticException(),new NullPointerException ----wrong
 *
 *
 *  throw ----used inside the try block...
 *
 *  try
 *  {
 *
 *        throw new ArithmeticException();
 *
 *
 *   }
 *
 *   catch(Exception  e)
 *   {
 *
 *
 *   }
------------------------------------------------

After throw, remaining statements are skipped.
 *  try
 *  {
 *
 *           throw new ArithmeticException();
 *            System.out.println("Java");
               System.out.println("Java");

 *
 *   }
 *
 *   Exception object can contain custom(User) message
 *
 *   try
 *   {
 *
 *         throw new ArithmeticException("Be Negative...!");

 *
 *   }
 *
 *
 *   --------------------------------------------
 *
 *   throw works with predefined exceptions.
 *   throw new NullPointerException();
     throw new ArithmeticException();
     throw new ArrayIndexOutOfBoundsException();
 *   ---------------------------------------------------
 *   throw can be used with if condition.
 *   if(age<18)
 *   {
 *
 *  throw new ArithmeticException(
            "Not Eligible");
            }

          --------------------------------------------------------------
          throw transfers control to catch block immediately.



 */


/*
public class Throw1 {
    public static void main(String[] args) {
    	int age=15;
    	try
    	{
    		if(age<18)
    		{

                throw new ArithmeticException(
                        "Not Eligible For Voting");
    		}
            System.out.println("Eligible");

    	}
    	catch(ArithmeticException e)
    	{
            System.out.println(e.getMessage());

    	}

    }

}
*/

public class Throw1 {
    public static void main(String[] args) {
        int balance=8000;
        int withdraw=5000;

        try
        {
            if(withdraw>balance)
            {

                throw new ArithmeticException(
                        "Insufficient Balance");
            }
            System.out.println("Withdrawal Successful");

        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());

        }

    }

}