
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {

    public static void main(String[] args) {

        int[] arr = {1, 2, 2, 3, 1, 1, 4};

        Map<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int num : arr) {

            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Display frequency
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey()
                    + " -> " + entry.getValue());
        }
    }
}
