package basic_code;
/*
* final --it is keyword....
* final int a = 900;
* ---variable , method, class
* --restrict changes
*
* ------------------------------------
* finally --- it is a block but it is a keyword also
* ---used in Exception Handling.
* ---- Exception handling
* -----Execute important code always
* --after try--catch
*
* finally
* {
* }
*
* ----------------------------------------------
* finalize() Method
* ---Garbage Collection
* GC----Garbage Collector
* Used before object is destroyed by garbage collector
* -- Cleanup before object destruction
* --object class----root class
*
* protected void finalize()
* {
*
*
* }
*
* */

//Output is not guaranted because----Garbage
class AD{
    protected void finalize(){
        System.out.println("Object is removed.......!");
    }
}

public class Difference1 {
    static void main(String[] args) {

        AD aa1 = new AD();
        aa1 = null;
        System.gc();
    }
}
