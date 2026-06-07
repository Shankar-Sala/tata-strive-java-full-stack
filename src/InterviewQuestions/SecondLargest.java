package InterviewQuestions;

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {10, 20, 5, 40, 30};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > largest) {
                second = largest;
                largest = n;
            } else if (n > second && n != largest) {
                second = n;
            }
        }

        System.out.println(second);
    }
}
