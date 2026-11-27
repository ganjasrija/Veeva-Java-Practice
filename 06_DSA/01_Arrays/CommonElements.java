
import java.util.HashSet;
import java.util.Set;

public class CommonElements {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        Set<Integer> set = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Store first array elements
        for (int num : arr1) {
            set.add(num);
        }

        // Find common elements
        for (int num : arr2) {

            if (set.contains(num)) {
                result.add(num);
            }
        }

        System.out.println("Common Elements: " + result);
    }
}
