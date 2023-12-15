class Kadanes {
    public static void maxArray(int arr[], int size) {
        int max_sum = 0;
        int curr_sum = 0;
        int start = 0;
        int end = 0;
        int s = 0;
        for (int i = 0; i < size; i++) {
            curr_sum += arr[i];
            if (max_sum < curr_sum) {
                max_sum = curr_sum;
                start = s;
                end = i;
            }
            if (curr_sum < 0) {
                curr_sum = 0;
                s++;
            }
        }
        System.out.println("starting index: " + start);
        System.out.println("ending index: " + end);
        System.out.println("maxsum: " + max_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 100, -5002, -2, -3, 4, -1, -2, 1, 5, -5 };
        int n = arr.length;
        maxArray(arr, n);

    }
}
