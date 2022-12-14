package gr11review.part2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Arrays;

public class UtilityTest{
    // Methods1 Test1: Testing for true xybalance
    @Test
    public void xyBalanceTest1() {
        assertEquals(true, Utility.xyBalance("aaxbby"));
    }

    // Methods1 Test2: Testing for only x
    @Test
    public void xyBalanceTest2() {
        assertEquals(false, Utility.xyBalance("aaxbb"));
    }

    // Methods1 Test3: Testing for y before x
    @Test
    public void xyBalanceTest3() {
        assertEquals(false, Utility.xyBalance("yaaxbb"));
    }

    // Methods1 Test4: Testing for empty string
    @Test
    public void xyBalanceTest4() {
        assertEquals(false, Utility.xyBalance(" "));
    }

    // Methods1 Test5: Testing for number string (no x's and no y's)
    @Test
    public void xyBalanceTest5() {
        assertEquals(false, Utility.xyBalance("12345"));
    }
    
    // Methods1 Test6: Testing for only y
    @Test
    public void xyBalanceTest6() {
        assertEquals(false, Utility.xyBalance("abbby"));
    }
  

    
    // Methods2 Test1: Testing README Example 1
    @Test
    public void sumNumbersTest1() {
        assertEquals(123, Utility.sumNumbers("abc123xyz"));
    }

    // Methods2 Test2: Testing README Example 2
    @Test
    public void sumNumbersTest2() {
        assertEquals(44, Utility.sumNumbers("aa11b33"));
    }

    // Methods2 Test3: Testing README Example 3
    @Test
    public void sumNumbersTest3() {
        assertEquals(18, Utility.sumNumbers("7 11"));
    }

    // Methods2 Test4: Testing empty string
    @Test
    public void sumNumbersTest4() {
        assertEquals(0, Utility.sumNumbers(""));
    }

    // Methods2 Test5: Testing long string
    @Test
    public void sumNumbersTest5() {
        assertEquals(214119, Utility.sumNumbers("fasdl213784ds234oqw93k8"));
    }



    // FileIO1 Test1: Testing words.txt
    @Test
    public void fileIO1Test1() throws IOException {
        assertEquals("consectetur", Utility.longestWord("words.txt")); // FILE NOT FOUND 
    }



    // Array1 Test1: Tests to see if the output removed the two 10s
    @Test
    public void withoutTenTest1() { 
        int[] numsInput = {1, 10, 10, 2};
        int[] numsExpected = {1, 2, 0, 0};
        assertEquals(numsExpected, Utility.withoutTen(numsInput));
    }

    // Array1 Test2: Tests for removing 10s in the first int
    @Test
    public void withoutTenTest2() { 
        int[] numsInput = {10, 2, 10};
        int[] numsExpected = {2, 0, 0};
        assertEquals(numsExpected, Utility.withoutTen(numsInput));
    }

    // Array1 Test3: Tests for replacing 10 with 0
    @Test
    public void withoutTenTest3() { 
        int[] numsInput = {1, 99, 10};
        int[] numsExpected = {1, 99, 0};
        assertEquals(numsExpected, Utility.withoutTen(numsInput));
    }

    // Array1 Test4: Tests for something that doesn't need to be changed
    @Test
    public void withoutTenTest4() { 
        int[] numsInput = {1, 2, 3};
        int[] numsExpected = {1, 2, 3};
        assertEquals(numsExpected, Utility.withoutTen(numsInput));
    }

    // Array1 Test5: Tests for large jump
    @Test
    public void withoutTenTest5() { 
        int[] numsInput = {0, 0, 0, 0, 0, 10};
        int[] numsExpected = {10, 0, 0, 0, 0, 0};
        assertEquals(numsExpected, Utility.withoutTen(numsInput));
    }



    //FileO2 Test1: Testing words.txt
    @Test
    public void alphaWordTest1() throws IOException {
        assertEquals("amet", Utility.alphaWord("words.txt")); // CANT FIND FILE?
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



    // Array6 Test1: Tests README Example 1
    @Test
    public void seriesUpTest1() {
        int[] seriesUpExpected = {1, 1, 2, 1, 2, 3};
        assertArrayEquals(seriesUpExpected, Utility.seriesUp(3));
    }

    // Array6 Test2: Tests README Example 2
    @Test
    public void seriesUpTest2() {
        int[] seriesUpExpected = {1, 1, 2, 1, 2, 3, 1, 2, 3, 4};
        assertArrayEquals(seriesUpExpected, Utility.seriesUp(4));
    }

    // Array6 Test3: Tests README Example 3
    @Test
    public void seriesUpTest3() {
        int[] seriesUpExpected = {1, 1, 2};
        assertArrayEquals(seriesUpExpected, Utility.seriesUp(2));
    }



    // Array7 Test1: Tests README Example
    @Test
    public void reverseTest1() {
        int[][] reverseInput = new int[][]{{1,2,3}, {4,5,6}, {7,8,9}};
        int[][] reverseExpected = new int[][]{{9,8,7}, {6,5,4}, {3,2,1}};
        assertEquals(reverseExpected, Utility.reverse(reverseInput));
    }

    // Array7 Test2: Checks for a larger 2D array, special palindrome number case
    @Test
    public void reverseTest2() {
        int[][] reverseInput = new int[][]{{9, 8, 7}, {6, 5 ,4}, {3, 2, 1}, {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] reverseExpected = new int[][]{{9, 8, 7}, {6, 5 ,4}, {3, 2, 1}, {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        assertTrue(Arrays.deepEquals(reverseExpected, Utility.reverse(reverseInput)));
    }



    // Array9 Test1: Tests README Example (had to alter it to return strings due to it referencing arrays but not the values)
    @Test
    public void invertTest1() {
        int[][] invertTest = new int[][]{{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        String invertAnswer = "[[1, 2, 3], [1, 2, 3], [1, 2, 3]]";

        assertEquals(invertAnswer, Utility.invert(invertTest));
    }

    // Array9 Test2: Tests a empty 2D array
    @Test
    public void invertTest2() {
        int[][] invertTest = new int[][]{{0}};
        String invertAnswer = "[[0]]";

        assertEquals(invertAnswer, Utility.invert(invertTest));
    }

}
