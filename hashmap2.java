import java.util.*;

public class hashmap2 {
    public static void hashmap(int[] a, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);

        }
        for (int i : map.keySet()) {
            if (map.get(i) > n / 3) {
                list.add(i);
            }
        }
        System.out.print(list);
    }

    public static void main(String[] args) {
        int[] a = { 3, 3, 5, 5, 5, 5, 3, 3, 6, 6 };
        int size = a.length;
        hashmap(a, size);
    }
}
