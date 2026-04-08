import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TrainConsistService {

    public List<Bogie> filterBogiesByCapacity(List<Bogie> bogies, int threshold) {

        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public Map<String, List<Bogie>> groupBogiesByType(List<Bogie> bogies) {
        return bogies.stream()
                .collect(Collectors.groupingBy(Bogie::getType));
    }
}