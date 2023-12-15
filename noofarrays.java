public class noofarrays {

    public static void main(String[] args) {
        int a[] = { 1, -2, 4, -5, 1 };
        int n = a.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += a[j];
                if (sum < 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
