import java.util.Arrays;

public class TrainService {

    public void sortBogieNames(String[] bogieNames) {
        if (bogieNames == null || bogieNames.length <= 1) {
            return;
        }

        Arrays.sort(bogieNames);
    }
}