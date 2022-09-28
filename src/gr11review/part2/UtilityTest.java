package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

//import gr11review.part2.Utility;

public class UtilityTest{
    // Methods1 Test
    @Test
    public void xyBalanceTest1() {
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }

    @Test
    public void xyBalanceTest2() {
        assertEquals(false, Utility.xyBalance("aaxbb"));
    }

    @Test
    public void xyBalanceTest3() {
        assertEquals(false, Utility.xyBalance("yaaxbb"));
    }

    @Test
    public void xyBalanceTest4() {
        assertEquals(true, Utility.xyBalance("xxyxxy"));
    }

    @Test
    public void xyBalanceTest5() {
        assertEquals(false, Utility.xyBalance("yxxyxx"));
    }
  
    // Methods2 Test
    @Test
    public void sumNumbersTest1() {
        assertEquals(123, Utility.sumNumbers("abc123xyz"));
    }

    @Test
    public void sumNumbersTest2() {
        assertEquals(44, Utility.sumNumbers("aa11b33"));
    }

    @Test
    public void sumNumbersTest3() {
        assertEquals(18, Utility.sumNumbers("7 11"));
    }

    @Test
    public void sumNumbersTest4() {
        assertEquals(0, Utility.sumNumbers(""));
    }

    @Test
    public void sumNumbersTest5() {
        assertEquals(214119, Utility.sumNumbers("fasdl213784ds234oqw93k8"));
    }
}
