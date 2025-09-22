import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTranslateTest {
    // Chia hết cho 3
    @Test
    public void testDivisibleBy3() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(3));
    }

    // Chia hết cho 5
    @Test
    public void testDivisibleBy5() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(5));
    }

    // Chia hết cho cả 3 và 5
    @Test
    public void testDivisibleBy3And5() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(15));
    }

    // Không chia hết cho 3 hoặc 5
    @Test
    public void testNotDivisibleBy3Or5() {
        assertEquals("hai", FizzBuzzTranslate.translate(2));
        assertEquals("hai mươi sáu", FizzBuzzTranslate.translate(26));
    }

    // Chứa số 3
    @Test
    public void testContains3() {
        assertEquals("Fizz", FizzBuzzTranslate.translate(13));
        assertEquals("Fizz", FizzBuzzTranslate.translate(23));
    }

    // Chứa số 5
    @Test
    public void testContains5() {
        assertEquals("Buzz", FizzBuzzTranslate.translate(52));
        assertEquals("Buzz", FizzBuzzTranslate.translate(50));
    }

    // FizzBuzz do chia hết hoặc chứa cả 3 và 5
    @Test
    public void testFizzBuzzByContainAndDivide() {
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(30));
        assertEquals("FizzBuzz", FizzBuzzTranslate.translate(35));
    }
}
