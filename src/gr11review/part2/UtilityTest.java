package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

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


    // Array2 Test
    @Test
    public void notAloneTest1() {
        int[] inArray = {1, 2, 3};
        int[] outArray = {1, 3, 3};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray));
    }

    @Test
    public void notAloneTest2() {
        int[] inArray = {1, 2, 3, 2, 5, 2};
        int[] outArray = {1, 3, 3, 5, 5, 2};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray));
    }

    @Test
    public void notAloneTest3() {
        int[] inArray = {3, 4};
        int[] outArray = {3, 4};

        assertTrue(Arrays.equals(Utility.notAlone(inArray, 3), outArray));
    }

    @Test
    public void notAloneTest4() {
        int[] inArray = {69, 213, 51294091, 21498, 219382, 214802, 12048, 124890, 12408, 1248, 124};
        int[] outArray = {69, 213, 51294091, 51294091, 219382, 214802, 12048, 124890, 12408, 1248, 124};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,21498), outArray));
    }

    @Test
    public void notAloneTest5() {
        int[] inArray = {5, 1, 5};
        int[] outArray = {5, 1, 5};

        assertTrue(Arrays.equals(Utility.notAlone(inArray, 2), outArray));
    }
}
