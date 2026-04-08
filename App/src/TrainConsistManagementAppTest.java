import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

class TrainConsistManagementAppTest {

    TrainConsistService service = new TrainConsistService();

    @Test
    void testFilter_CapacityGreaterThanThreshold() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("First Class", 75));
        List<Bogie> result = service.filterBogiesByCapacity(bogies, 70);

        assertEquals(2, result.size());
        assertTrue(result.stream().allMatch(b -> b.getCapacity() > 70));
    }

    @Test
    void testFilter_NoBogiesMatching() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("AC Chair", 50));
        bogies.add(new Bogie("First Class", 60));

        List<Bogie> result = service.filterBogiesByCapacity(bogies, 70);

        assertTrue(result.isEmpty());
    }

    @Test
    void testFilter_OriginalListUnchanged() {

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 80));
        bogies.add(new Bogie("AC Chair", 60));

        int originalSize = bogies.size();

        service.filterBogiesByCapacity(bogies, 70);

        assertEquals(originalSize, bogies.size());
    }
}