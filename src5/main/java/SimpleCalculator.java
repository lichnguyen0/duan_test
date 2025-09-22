import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleCalculatorTest {
    @Test
    public void testAddPositiveNumbers() {
        int result = SimpleCalculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testAddNegativeAndPositive() {
        int result = SimpleCalculator.add(-2, 5);
        assertEquals(3, result);
    }

    @Test
    public void testSubPositiveNumbers() {
        int result = SimpleCalculator.sub(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testSubNegativeResult() {
        int result = SimpleCalculator.sub(2, 5);
        assertEquals(-3, result);
    }
}
