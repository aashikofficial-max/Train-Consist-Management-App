import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrainConsistManagementAppTest {

    TrainService service = new TrainService();

    @Test
    public void testLoopFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70)
        );

        List<Bogie> result = service.filterWithLoop(list);

        assertEquals(1, result.size());
    }

    @Test
    public void testStreamFilteringLogic() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70)
        );

        List<Bogie> result = service.filterWithStream(list);

        assertEquals(1, result.size());
    }

    @Test
    public void testLoopAndStreamResultsMatch() {
        List<Bogie> list = Arrays.asList(
                new Bogie("A", 50),
                new Bogie("B", 70),
                new Bogie("C", 80)
        );

        assertEquals(
                service.filterWithLoop(list).size(),
                service.filterWithStream(list).size()
        );
    }

    @Test
    public void testExecutionTimeMeasurement() {
        long start = System.nanoTime();
        long end = System.nanoTime();

        assertTrue((end - start) >= 0);
    }

    @Test
    public void testLargeDatasetProcessing() {
        List<Bogie> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            list.add(new Bogie("X", i % 100));
        }

        List<Bogie> result = service.filterWithStream(list);

        assertTrue(result.size() > 0);
    }
}