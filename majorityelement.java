import java.util.Scanner;

public class majorityelement {
    public static int majorityElement(int[] nums) {
        int votes = 1;
        int majorityElement = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (votes == 0) {
                majorityElement = nums[i];
                votes++;
            } else if (majorityElement != nums[i]) {
                votes--;
            } else {
                votes++;
            }
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == majorityElement) {
                count++;
            }
        }
        if (count > nums.length / 2) {
            return majorityElement;
        }
        return 0;
    }

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
        int majorityElement = majorityElement(a);
        System.out.print("Majority element is :" + majorityElement);
    }
}
