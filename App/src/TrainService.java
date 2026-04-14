import java.util.regex.*;

public class TrainService {

    private static final String TRAIN_ID_REGEX = "TRN-\\d{4}";
    private static final String CARGO_CODE_REGEX = "PET-[A-Z]{2}";

    private Pattern trainPattern;
    private Pattern cargoPattern;

    public TrainService() {
        trainPattern = Pattern.compile(TRAIN_ID_REGEX);
        cargoPattern = Pattern.compile(CARGO_CODE_REGEX);
    }

    public boolean isValidTrainId(String trainId) {
        if (trainId == null || trainId.isEmpty()) return false;

        Matcher matcher = trainPattern.matcher(trainId);
        return matcher.matches();
    }

    public boolean isValidCargoCode(String cargoCode) {
        if (cargoCode == null || cargoCode.isEmpty()) return false;

        Matcher matcher = cargoPattern.matcher(cargoCode);
        return matcher.matches();
    }
}