import java.util.*;

public class Dequeue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        // First window
        for (int i = 0; i < m; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = map.size();

        // Slide the window
        for (int i = m; i < n; i++) {

            // Remove left element
            int left = arr[i - m];

            map.put(left, map.get(left) - 1);

            if (map.get(left) == 0)
                map.remove(left);

            // Add new element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            max = Math.max(max, map.size());
        }

        System.out.println(max);
    }
}