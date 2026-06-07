package InterviewQuestions;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40};
        int key = 30;
        boolean found = false;

        for (int n : arr) {
            if (n == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element Found");
        else
            System.out.println("Element Not Found");
    }
}
