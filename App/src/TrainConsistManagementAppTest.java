import static org.junit.Assert.*;
import org.junit.Test;

public class TrainConsistManagementAppTest {

    @Test
    public void testSort_BasicSorting() {
        int[] input = {72, 56, 24, 70, 60};
        int[] expected = {24, 56, 60, 70, 72};

        TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_AlreadySortedArray() {
        int[] input = {24, 56, 60, 70, 72};
        int[] expected = {24, 56, 60, 70, 72};

        TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_DuplicateValues() {
        int[] input = {72, 56, 56, 24};
        int[] expected = {24, 56, 56, 72};

        TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_SingleElementArray() {
        int[] input = {50};
        int[] expected = {50};

        TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, input);
    }

    @Test
    public void testSort_AllEqualValues() {
        int[] input = {40, 40, 40};
        int[] expected = {40, 40, 40};

        TrainConsistManagementApp.bubbleSort(input);

        assertArrayEquals(expected, input);
    }
}