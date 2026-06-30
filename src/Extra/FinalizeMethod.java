package Extra;/*
final--- it is keyword...
Example: final int a-900;
--variable,method class
--Restrict changes

finally--- it is a block, but it is a keyword also
---Used in Exception Handling.
---Exception Handling
---Execute important code always
--after try-catch
finally

finalize() Method
--Garbage Collection
GC-Garbage Collector.
--Used before object is destroyed by Garbage Collector.
--Cleanup before object destruction
---Object class---root class
Syntax: protected void finalize(){
}
//Output is not Guaranteed
 */

class AD{
    protected void finalize(){
        System.out.println("Object is Removed...");
    }
}
public class FinalizeMethod {
    public static void main(String[] args) {
        AD a1 = new AD();
        a1 = null;
        System.gc();
    }
}
