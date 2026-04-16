import java.util.Arrays;

public class TrainService {

    /**
     * Performs Binary Search on bogie IDs
     * Ensures sorting before searching
     */
    public boolean binarySearchBogie(String[] bogieIds, String searchKey) {

        // Handle empty array
        if (bogieIds == null || bogieIds.length == 0) {
            return false;
        }

        // Step 1: Sort the array (important precondition)
        Arrays.sort(bogieIds);

        // Step 2: Initialize pointers
        int low = 0;
        int high = bogieIds.length - 1;

        // Step 3: Binary Search logic
        while (low <= high) {

            int mid = (low + high) / 2;

            int comparison = searchKey.compareTo(bogieIds[mid]);

            if (comparison == 0) {
                return true; // Found
            }
            else if (comparison < 0) {
                high = mid - 1; // Search left half
            }
            else {
                low = mid + 1; // Search right half
            }
        }

        // Not found
        return false;
    }
}