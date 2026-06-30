package Extra;/*
 * ---------throws keyword is used to declare an exception.
 * ------throws is used in method declaration
 * ------It declares an exception
 * -----It does not handle the exception
 * -----Multiple exceptions can be declared
 * ------Used mainly with checked exceptions
 * ------Written after method signature
 * -------------------------------------------------------------------------
 * throw creates exception, throws declares exception
 *
 * --------------------------------------------------------------------------
 *
 *
 * returnType methodName() throws ExceptionName
{

}
 *
 * void display() throws ArithmeticException
 * {
 *
 *
 *
 * }
 *
 *
 * throw--Used inside method
 * -------------Creates exception
 * ------------Followed by object
 * -----------Single exception object
 *
 *
 * throws--Used with method declaration
 *---------Declares exception
 *--------Followed by class name
 *--------Multiple exceptions possible
 *
 */

/*
class Bank4 {
	void withdraw(int balance, int amount) throws ArithmeticException {
		if (amount > balance) {
			throw new ArithmeticException("Insufficient Balance");
		}
		System.out.println("Withdrawal Successful");

	}

}

public class Throws1 {
	public static void main(String args[]) {
		Bank4 bb1 = new Bank4();
		try {
			bb1.withdraw(80000, 100000);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
*/
/*
//Program Without throw
public class Throws1 {
	public static void main(String args[]) {
		int balance = 8000;
		int withdraw = 5000;
		if (withdraw > balance) {
			System.out.println("Insufficient Balance");
		} else {
			System.out.println("Withdrawal Successful");
		}
	}

}

*/
/*
//Business Rule Errors---with throw keyword..

public class Throws1 {
	public static void main(String args[])
	{
		int balance = 5000;
		int withdraw = 7000;
		try {

			if(withdraw > balance) {

				throw new ArithmeticException(
						"Insufficient Balance");
			}

			System.out.println(
					"Withdrawal Successful");
		}
		catch(ArithmeticException e) {

			System.out.println(
					e.getMessage());
		}
		System.out.println(
				"Transaction Completed");

	}

}
*/
//throws does not create the exception
//throws does not handle an exception.

//when ever we call method....This method may generate an exception.
/*
//without throws keyword...
public class Throws1 {
	void checkAge(int age) {

		if (age < 18) {

			throw new ArithmeticException("Not Eligible");
		}
	}

	public static void main(String args[]) {
	}
}

*/


//The teacher is not conducting the test right now.
//The teacher is only giving a warning.
public class Throws1 {
    void checkAge(int age) throws ArithmeticException {

        if (age < 18) {

            throw new ArithmeticException("Not Eligible");
        }
    }

    public static void main(String args[]) {
    }
}
/*
 * checkAge()--throws declaration found
 *          ----method execute
 *          ---if condition true
 *          ---throw create exception
 *          ----Exception goes back to caller
 *          -----catch handles the exception
 *
 */