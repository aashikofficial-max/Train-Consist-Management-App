import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Test;
import static org.junit.Assert.*;
public class TrainConsistManagementAppTest {

    @Test
    public void testException_ValidCapacityCreation() throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie("Sleeper", 72);
        assertEquals(72, b.getCapacity());
    }

    @Test
    public void testException_NegativeCapacityThrowsException() {
        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", -10)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    public void testException_ZeroCapacityThrowsException() {
        assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", 0)
        );
    }

    @Test
    public void testException_ExceptionMessageValidation() {
        Exception exception = assertThrows(
                InvalidCapacityException.class,
                () -> new PassengerBogie("Sleeper", 0)
        );

        assertEquals("Capacity must be greater than zero", exception.getMessage());
    }

    @Test
    public void testException_ObjectIntegrityAfterCreation() throws InvalidCapacityException {
        PassengerBogie b = new PassengerBogie("First Class", 30);

        assertEquals("First Class", b.getType());
        assertEquals(30, b.getCapacity());
    }

    @Test
    public void testException_MultipleValidBogiesCreation() throws InvalidCapacityException {
        PassengerBogie b1 = new PassengerBogie("Sleeper", 72);
        PassengerBogie b2 = new PassengerBogie("AC Chair", 50);

        assertNotNull(b1);
        assertNotNull(b2);
    }
}