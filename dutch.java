import java.util.*;

public class dutch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the elements of the array(only 0s,1s and 2s):");
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Entered array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        sortArray(a, size);
        printArray(a, size);
    }

    public static void sortArray(int[] a, int size) {
        int low = 0;
        int high = size - 1;
        int mid = 0;
        while (mid <= high) {
            if (a[mid] == 0) {
                swap(a, low, mid);
                low++;
                mid++;
            } else if (a[mid] == 1) {
                mid++;
            } else if (a[mid] == 2) {
                swap(a, mid, high);
                high--;
            }

        }
    }

    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public static void printArray(int a[], int size) {
        System.out.println("sorted array is: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
