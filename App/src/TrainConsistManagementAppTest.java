import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    TrainService service = new TrainService();

    @Test
    public void testBinarySearch_BogieFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(service.binarySearchBogie(bogies, "BG309"));
    }

    @Test
    public void testBinarySearch_BogieNotFound() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertFalse(service.binarySearchBogie(bogies, "BG999"));
    }

    @Test
    public void testBinarySearch_FirstElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(service.binarySearchBogie(bogies, "BG101"));
    }

    @Test
    public void testBinarySearch_LastElementMatch() {
        String[] bogies = {"BG101","BG205","BG309","BG412","BG550"};
        assertTrue(service.binarySearchBogie(bogies, "BG550"));
    }

    @Test
    public void testBinarySearch_SingleElementArray() {
        String[] bogies = {"BG101"};
        assertTrue(service.binarySearchBogie(bogies, "BG101"));
    }

    @Test
    public void testBinarySearch_EmptyArray() {
        String[] bogies = {};
        assertFalse(service.binarySearchBogie(bogies, "BG101"));
    }

    @Test
    public void testBinarySearch_UnsortedInputHandled() {
        String[] bogies = {"BG309","BG101","BG550","BG205","BG412"};
        assertTrue(service.binarySearchBogie(bogies, "BG205"));
    }
}