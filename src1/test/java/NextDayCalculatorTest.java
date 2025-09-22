import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
public class NextDayCalculatorTest {
    @Test
    public void case1_1_2018() {
        assertArrayEquals(new int[]{2,1,2018}, NextDayCalculator.findNextDay(1,1,2018));
    }

    @Test
    public void case31_1_2018() {
        assertArrayEquals(new int[]{1,2,2018}, NextDayCalculator.findNextDay(31,1,2018));
    }

    @Test
    public void case30_4_2018() {
        assertArrayEquals(new int[]{1,5,2018}, NextDayCalculator.findNextDay(30,4,2018));
    }

    @Test
    public void case28_2_2018() {
        assertArrayEquals(new int[]{1,3,2018}, NextDayCalculator.findNextDay(28,2,2018));
    }

    @Test
    public void case29_2_2020() {
        assertArrayEquals(new int[]{1,3,2020}, NextDayCalculator.findNextDay(29,2,2020));
    }

    @Test
    public void case31_12_2018() {
        assertArrayEquals(new int[]{1,1,2019}, NextDayCalculator.findNextDay(31,12,2018));
    }
}
