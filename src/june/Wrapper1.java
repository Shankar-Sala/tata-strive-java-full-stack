package june;
/*
* wrapper class in java
* ----A Wrapper class converts a primitive data type(Basic) into an object
* -----Total 8 types....
* ----Every primitive type has a wrapper class.
* -----java.lang------Automatically imported
* ----wrapper objects can store null.
* Integer num = null;
* Primitive Cannot.
*
* ----Wrapper classes provide utility methods.
*    utility methods are ready-made methods provided by wrapper classes.
*    Integer.parseInt("100");
* Convert String -> int
* Convert int -> String
* Find maximum value
* -------used heavily in collections framework.
*
*
*
*
*
* wrapper  classes
* primitive wrapper class
* int        Integer
* double     Double
* char        Character
* boolean      Boolean
* float        Float
* long         Long
* byte         Byte
* short        Short
*
*
* why do we need .....?
* ----- Java collection work with object ------- not primitive data types.
* ArrayList<int> list; -------wrong
* ArrayList<Integer> list; ----- Correct
*
*
*
* autoboxing
* ----Wrapper classes convert primitive -> object.
* ---Autoboxing converts primitive to object automatically.
*
* int a=90;
* Integer obj = Integer.valueOf(a);
* unboxing
* */



//autoboxing
//Wrapper classes convert primitive → object.
public class Wrapper1 {
    public static void main(String args[]) {
        int marks=9000;
        Integer obj=Integer.valueOf(marks);
        System.out.println("Wrapper Object : "+obj);
    }
}
