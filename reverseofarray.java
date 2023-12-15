import java.util.Scanner;

public class reverseofarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] a = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.print("Entered array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        reverseOfArray(a, size);
    }

    public static void reverseOfArray(int a[], int size) {
        int low = 0;
        int high = size - 1;
        while (low < high) {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            low++;
            high--;
        }
        System.out.print("Reverse of the array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
