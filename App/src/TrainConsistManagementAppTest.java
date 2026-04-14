import org.junit.Test;
import static org.testng.AssertJUnit.assertEquals;

import java.util.*;

public class TrainConsistManagementAppTest {

    @Test
    public void testReduce_TotalSeatCalculation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 50)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(122, total);
    }

    @Test
    public void testReduce_MultipleBogiesAggregation() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("AC Chair", 50),
                new Bogie("First Class", 24)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(146, total);
    }

    @Test
    public void testReduce_SingleBogieCapacity() {
        List<Bogie> bogies = Arrays.asList(
                new Bogie("Sleeper", 72)
        );

        int total = bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(72, total);
    }

    @Test
    public void testReduce_EmptyBogieList() {
        List<Bogie> bogies = new ArrayList<>();

        bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);
        int total = 0;

        assertEquals(0, total);
    }

    @Test
    public void testReduce_OriginalListUnchanged() {
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));

        int sizeBefore = bogies.size();

        bogies.stream()
                .map(Bogie::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(sizeBefore, bogies.size());
    }
}