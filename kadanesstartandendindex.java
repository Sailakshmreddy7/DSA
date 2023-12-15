import java.util.Scanner;

public class kadanesstartandendindex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println("Entered array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        maxSubArray(a, size);
    }

    public static void maxSubArray(int a[], int size) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int k = 0;
        for (int i = 0; i < size; i++) {
            curr_sum += a[i];
            if (max_sum < curr_sum) {
                max_sum = curr_sum;
                start = k;
                end = i;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
                k = i + 1;
            }
        }
        System.out.println("MaximumSum: " + max_sum);
        System.out.println("startindex: " + start);
        System.out.println("endindex: " + end);

    }
}
