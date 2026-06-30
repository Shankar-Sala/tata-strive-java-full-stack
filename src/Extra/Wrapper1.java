package Extra;

/*
  Wrapper class in Java: --convert primitive data type(basic) into an object
  -----Every primitive type has a wrapper class.
  -----java.lang ---------Automatically imported.
  ------Wrapper classes provide utility methods.
  ------wrapper objects can store null.
        Integer num=null; --in primitive null is not possible
  ------Utility Methods are ready-made methods provided by wrapper classes
        Integer.parseInt("100");
        Convert String int
        Convert int → String
        Find max value
 ------using wrapper class we can achieve:
  1. autoboxing:
  --wrapper classes convert primitive -> object.
  int a=90;
  integer obj = Integer.valueOf(a);
  2. unboxing:
  --Unboxing converts object to primitive automatically.
  --Wrapper classes convert object ->  primitive.
  Integer obj=500;
  int a=obj.intValue()

Total 8 Types:
Primitive       Wrapper Class
int             Integer
double          Double
char            Character
boolean         Boolean
float           Float
long            Long
byte            Byte
short           Short

why do we need ....?
---Java collection work with object ----not primitive data types.

Ex. ArrayList<int> list; ----wrong
    ArrayList<Integer> list; ----right
 */
/*
//autoboxing
//Wrapper classes convert primitive -> object.
public class Wrapper1 {
    public static void main(String args[]) {
        int marks=9000;
        Integer obj=Integer.valueOf(marks);
        System.out.println("Wrapper Object : "+obj);
    }
}
*/
/*
public class Wrapper1
{
    public static void main(String args[]) {
        Integer salary=79999;
        int amount=salary.intValue();
        System.out.println("Wrapper: "+salary);
        System.out.println("Primitive: "+amount);
    }
}
*/
public class Wrapper1 {
    public static void main(String args[]) {
        int empId=1005;
        Integer obj = Integer.valueOf(empId);
        Double salary = 500000.00;
        double empSalary = salary.doubleValue();
        System.out.println("Emp ID: "+obj);
        System.out.println("Emp Salary : "+empSalary);
    }
}