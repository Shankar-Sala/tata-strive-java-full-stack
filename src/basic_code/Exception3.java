package basic_code;

public class Exception3 {
    static void main() {
        //length---2---0-1
        try{
            int arr[] = new int[2];
            arr[5] = 10;
            int a = 10/ 0;
        }catch (ArrayIndexOutOfBoundsException aa){
            System.out.println("Array Error");
        }
        catch (ArithmeticException e){
            System.out.println("Math Error");
        }

        System.out.println("-------------------------");
        System.out.println("-------------------------");
        System.out.println("-------------------------");
    }
}
