package gr11review.part2;
import java.io.*;
import java.util.Arrays;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.InputAnalysisProcess;

import gr11review.part2.Utility;

public class Array2 {
    public static void main(String[] args) throws Exception {
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the size of the array: ");
        int arraySize = Integer.parseInt(key.readLine());
        System.out.print("Enter value (for the alone value): ");
        int value = Integer.parseInt(key.readLine());
        int[] nums = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            nums[i] = Integer.parseInt(key.readLine());
        }
       
        String output = Arrays.toString(Utility.notAlone(nums, value));
        System.out.println(output);
    }
}
