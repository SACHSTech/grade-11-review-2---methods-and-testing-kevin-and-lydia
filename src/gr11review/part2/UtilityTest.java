package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;
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


    //FileO2 Test
    @Test
    public void alphaWordTest1() throws IOException {
        assertEquals("amet", Utility.alphaWord("src/gr11review/part2/" + "filenametxt"));
    }

    // Array2 Test1: Testing simple array, alone value in centre
    @Test
    public void notAloneTest1() {
        int[] inArray = {1, 2, 3};
        int[] outArray = {1, 3, 3};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray));
    }

    // Array2 Test2: Testing for an array with multiple alone values
    @Test
    public void notAloneTest2() {
        int[] inArray = {1, 2, 3, 2, 5, 2};
        int[] outArray = {1, 3, 3, 5, 5, 2};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,2), outArray));
    }

    // Array2 Test3: Testing for an array that ends with an alone value
    @Test
    public void notAloneTest3() {
        int[] inArray = {3, 4};
        int[] outArray = {3, 4};

        assertTrue(Arrays.equals(Utility.notAlone(inArray, 3), outArray));
    }

    // Array2 Test4: Testing for a much larger array
    @Test
    public void notAloneTest4() {
        int[] inArray = {69, 213, 51294091, 21498, 219382, 214802, 12048, 124890, 12408, 1248, 124};
        int[] outArray = {69, 213, 51294091, 51294091, 219382, 214802, 12048, 124890, 12408, 1248, 124};

        assertTrue(Arrays.equals(Utility.notAlone(inArray,21498), outArray));
    }

    // Array2 Test5: Testing for an array with no alone values
    @Test
    public void notAloneTest5() {
        int[] inArray = {5, 1, 5};
        int[] outArray = {5, 1, 5};

        assertTrue(Arrays.equals(Utility.notAlone(inArray, 2), outArray));
    }


    // Array5 Test1: Testing for a simple balanced array
    @Test
    public void canBalanceTest1() {
        int[] nums = {1, 1, 1, 2, 1};

        assertEquals(Utility.canBalance(nums), true);
    }

    // Array5 Test2: Testing for a inbalanced array
    @Test
    public void canBalanceTest2() {
        int[] nums = {2, 1, 1, 2, 1};

        assertEquals(Utility.canBalance(nums), false);
    }

    // Array5 Test3: Testing with a array with length of 2
    @Test
    public void canBalanceTest3() {
        int[] nums = {10, 10};

        assertEquals(Utility.canBalance(nums), true);
    }

    // Array5 Test4: Testing with an empty array
    @Test
    public void canBalanceTest4() {
        int[] nums = {0};

        assertEquals(Utility.canBalance(nums), true);
    }

    // Array5 Test5: Testing with a larger set of numbers
    @Test
    public void canBalanceTest5() {
        int[] nums = {32532, 4129058, 421849, 21904, 6, 4821, 328, 4, 42, 5, 632529723};

        assertEquals(Utility.canBalance(nums), false);
    }
}
