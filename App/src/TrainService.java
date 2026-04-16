public class TrainService {

    /**
     * Linear search with validation (Fail-Fast approach)
     */
    public boolean searchBogie(String[] bogieIds, String searchKey) {

        // ❗ State validation before search
        if (bogieIds == null || bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available in the train consist.");
        }

        // Normal linear search
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true;
            }
        }

        return false;
    }

    public boolean binarySearchBogie(String[] bogieIds, String searchKey) {
        boolean type = false;
        return type;
    }
}