import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonElementsFindershort22c {

    public static void main(String[] args) {
        // Create two lists with some common elements
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3 , 7, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(3, 4, 5, 6, 7));

        // Find and print the common elements
        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.println("Common Elements: " + commonElements);
    }

    private static <T> List<T> findCommonElements(List<T> list1, List<T> list2) {
        // Use a HashSet to efficiently find common elements
        Set<T> set1 = new HashSet<>(list1);
        Set<T> set2 = new HashSet<>(list2);

        // Find the intersection of the two sets
        set1.retainAll(set2);

        // Convert the set of common elements back to a list
        return new ArrayList<>(set1);
    }
}
