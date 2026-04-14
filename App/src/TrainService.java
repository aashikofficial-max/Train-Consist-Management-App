import java.util.*;

public class TrainService {

    public boolean isSafetyCompliant(List<GoodsBogie> bogies) {

        return bogies.stream()
                .allMatch(b ->
                        // Rule:
                        // If Cylindrical → must be Petroleum
                        !b.getType().equalsIgnoreCase("Cylindrical") ||
                                b.getCargo().equalsIgnoreCase("Petroleum")
                );
    }
}