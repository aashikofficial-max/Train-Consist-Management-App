import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TrainConsistManagementAppTest {

    TrainService service = new TrainService();

    @Test
    public void testRegex_ValidTrainID() {
        assertTrue(service.isValidTrainId("TRN-1234"));
    }

    @Test
    public void testRegex_InvalidTrainIDFormat() {
        assertFalse(service.isValidTrainId("TRAIN12"));
        assertFalse(service.isValidTrainId("TRN12A"));
        assertFalse(service.isValidTrainId("1234-TRN"));
    }

    @Test
    public void testRegex_ValidCargoCode() {
        assertTrue(service.isValidCargoCode("PET-AB"));
    }

    @Test
    public void testRegex_InvalidCargoCodeFormat() {
        assertFalse(service.isValidCargoCode("PET-ab"));
        assertFalse(service.isValidCargoCode("PET123"));
        assertFalse(service.isValidCargoCode("AB-PET"));
    }

    @Test
    public void testRegex_TrainIDDigitLengthValidation() {
        assertFalse(service.isValidTrainId("TRN-123"));
        assertFalse(service.isValidTrainId("TRN-12345"));
    }

    @Test
    public void testRegex_CargoCodeUppercaseValidation() {
        assertFalse(service.isValidCargoCode("PET-aB"));
    }

    @Test
    public void testRegex_EmptyInputHandling() {
        assertFalse(service.isValidTrainId(""));
        assertFalse(service.isValidCargoCode(""));
    }

    @Test
    public void testRegex_ExactPatternMatch() {
        assertFalse(service.isValidTrainId("TRN-1234X"));
        assertFalse(service.isValidCargoCode("PET-ABCD"));
    }
}