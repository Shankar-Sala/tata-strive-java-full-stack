package InterviewQuestions;
import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n, sum = 0;

        while (n > 0) {
            int r = n % 10;
            int fact = 1;

            for (int i = 1; i <= r; i++)
                fact *= i;

            sum += fact;
            n /= 10;
        }

        if (temp == sum)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong Number");
    }
}