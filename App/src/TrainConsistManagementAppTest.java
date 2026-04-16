import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    TrainService service = new TrainService();

    // Test: Bogie exists
    @Test
    public void testSearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(service.searchBogie(bogies, "BG309"));
    }

    // Test: Bogie does not exist
    @Test
    public void testSearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(service.searchBogie(bogies, "BG999"));
    }

    // Test: First element match
    @Test
    public void testSearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(service.searchBogie(bogies, "BG101"));
    }

    // Test: Last element match
    @Test
    public void testSearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(service.searchBogie(bogies, "BG550"));
    }

    // Test: Single element array
    @Test
    public void testSearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(service.searchBogie(bogies, "BG101"));
    }
}