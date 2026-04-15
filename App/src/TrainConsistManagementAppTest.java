import static org.junit.Assert.*;
import org.junit.Test;

public class TrainConsistManagementAppTest {

    TrainService service = new TrainService();

    @Test
    public void testSort_BasicAlphabeticalSorting() {
        String[] input = {"Sleeper","AC Chair","First Class","General","Luxury"};
        String[] expected = {"AC Chair","First Class","General","Luxury","Sleeper"};

        service.sortBogieNames(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_UnsortedInput() {
        String[] input = {"Luxury","General","Sleeper","AC Chair"};
        String[] expected = {"AC Chair","General","Luxury","Sleeper"};

        service.sortBogieNames(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        String[] input = {"AC Chair","First Class","General"};
        String[] expected = {"AC Chair","First Class","General"};

        service.sortBogieNames(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_DuplicateBogieNames() {
        String[] input = {"Sleeper","AC Chair","Sleeper","General"};
        String[] expected = {"AC Chair","General","Sleeper","Sleeper"};

        service.sortBogieNames(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_SingleElementArray() {
        String[] input = {"Sleeper"};
        String[] expected = {"Sleeper"};

        service.sortBogieNames(input);

        assertArrayEquals(expected, input);
    }
}