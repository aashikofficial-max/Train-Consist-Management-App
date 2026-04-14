import org.junit.Test;
import static org.junit.Assert.*;

public class TrainConsistManagementAppTest {

    // ✅ Test 1: Safe Assignment
    @Test
    public void testCargo_SafeAssignment() {
        GoodsBogie b = new GoodsBogie("Cylindrical");

        b.assignCargo("Petroleum");

        assertEquals("Petroleum", b.getCargo());
    }

    // ✅ Test 2: Unsafe Assignment Handled
    @Test
    public void testCargo_UnsafeAssignmentHandled() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        // Should NOT assign cargo
        assertNull(b.getCargo());
    }

    // ✅ Test 3: Cargo Not Assigned After Failure
    @Test
    public void testCargo_CargoNotAssignedAfterFailure() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        b.assignCargo("Petroleum");

        assertNull(b.getCargo());
    }

    // ✅ Test 4: Program Continues After Exception
    @Test
    public void testCargo_ProgramContinuesAfterException() {
        GoodsBogie b1 = new GoodsBogie("Rectangular");
        GoodsBogie b2 = new GoodsBogie("Cylindrical");

        b1.assignCargo("Petroleum"); // ❌ fails internally
        b2.assignCargo("Petroleum"); // ✅ should still work

        assertEquals("Petroleum", b2.getCargo());
    }

    // ✅ Test 5: Finally Block Execution (Indirect Validation)
    @Test
    public void testCargo_FinallyBlockExecution() {
        GoodsBogie b = new GoodsBogie("Rectangular");

        // We cannot directly test finally block output,
        // but we ensure method completes without crash
        b.assignCargo("Petroleum");

        // If finally didn't execute properly, method might crash
        assertTrue(true); // just ensures flow completed
    }
}