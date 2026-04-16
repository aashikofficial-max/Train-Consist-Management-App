public class TrainService {

    // Linear Search Service Method
    public boolean searchBogie(String[] bogieIds, String searchKey) {
        for (String id : bogieIds) {
            if (id.equals(searchKey)) {
                return true; // Early termination
            }
        }
        return false;
    }
}