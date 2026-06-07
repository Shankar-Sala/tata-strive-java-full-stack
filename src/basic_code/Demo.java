package basic_code;

class Demo {

    public static void main(String[] args) {

        int a = 10;

        //       11 +  11  + 11 + 11==44
        int b = ++a + a++ + --a + a--;

        System.out.println("Value of b : " + b);
        a=900;

        System.out.println("Value of a : " + a);
    }
}
