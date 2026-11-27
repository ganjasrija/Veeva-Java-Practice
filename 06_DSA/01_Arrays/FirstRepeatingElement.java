
import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingElement {

    public static int findFirstRepeating(int[] arr) {

        Map<Integer, Integer> map = new HashMap<>();

        // First traversal: Count frequencies
        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Second traversal: Find first repeating element
        for (int num : arr) {

            if (map.get(num) > 1) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 5, 3, 4, 3, 5, 6};

        int result = findFirstRepeating(arr);

        if (result != -1) {
            System.out.println("First Repeating Element: " + result);
        } else {
            System.out.println("No repeating element found");
        }
    }
}
