import java.util.*;
import java.util.stream.*;

public class TrainService {

    // UC10: Total Seat Calculation
    public int getTotalSeats(List<Bogie> bogies) {
        return bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
    }

    // Filter by type
    public List<Bogie> getBogiesByType(List<Bogie> bogies, String type) {
        return bogies.stream()
                .filter(b -> b.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    // Total seats by specific type
    public int getTotalSeatsByType(List<Bogie> bogies, String type) {
        return bogies.stream()
                .filter(b -> b.getType().equalsIgnoreCase(type))
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
    }
}