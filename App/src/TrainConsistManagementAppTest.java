import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    TrainService service = new TrainService();

    // Test: Exception when array is empty
    @Test(expected = IllegalStateException.class)
    public void testSearch_ThrowsExceptionWhenEmpty() {
        String[] bogies = {};
        service.searchBogie(bogies, "BG101");
    }

    // Test: Search allowed when data exists
    @Test
    public void testSearch_AllowsSearchWhenDataExists() {
        String[] bogies = {"BG101","BG205"};
        service.searchBogie(bogies, "BG101"); // should not throw exception
    }

    // Test: Bogie found after validation
    @Test
    public void testSearch_BogieFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};
        assertTrue(service.searchBogie(bogies, "BG205"));
    }

    // Test: Bogie not found after validation
    @Test
    public void testSearch_BogieNotFoundAfterValidation() {
        String[] bogies = {"BG101","BG205","BG309"};
        assertFalse(service.searchBogie(bogies, "BG999"));
    }

    // Test: Single element case
    @Test
    public void testSearch_SingleElementValidCase() {
        String[] bogies = {"BG101"};
        assertTrue(service.searchBogie(bogies, "BG101"));
    }
}