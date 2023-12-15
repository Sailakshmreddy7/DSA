public class majorityelement2 {
    public static void solve(int n, int[] nums) {
        // code here
        // Boyer Moore's voting algorithm
        int ele1 = Integer.MIN_VALUE, ele2 = Integer.MAX_VALUE, cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < n; i++) {
            if (cnt1 == 0 && ele2 != nums[i]) {
                cnt1++;
                ele1 = nums[i];
            } else if (cnt2 == 0 && ele1 != nums[i]) {
                cnt2++;
                ele2 = nums[i];
            } else if (ele1 == nums[i])
                cnt1++;
            else if (ele2 == nums[i])
                cnt2++;
            else {
                cnt1--;
                cnt2--;
            }
        }
        cnt1 = 0;
        cnt2 = 0;
        for (int i : nums) {
            if (i == ele1)
                cnt1++;
            if (i == ele2)
                cnt2++;
        }

        int[] b = new int[2];
        int index = 0;
        if (cnt1 > n / 3)
            b[index++] = ele1;
        if (cnt2 > n / 3)
            b[index++] = ele2;
        if (index == 0)
            b[index++] = -1;

        // Print the elements of the array
        for (int i = 0; i < index; i++) {
            System.out.print(b[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = { 3, 6, 5, 5, 5, 5, 6, 6, 6 };
        solve(nums.length, nums);
    }
}
