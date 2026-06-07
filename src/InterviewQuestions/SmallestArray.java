package InterviewQuestions;

public class SmallestArray {
    public static void main(String[] args) {
        int arr[] = {10, 2, 30, 4};

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(min);
    }
}