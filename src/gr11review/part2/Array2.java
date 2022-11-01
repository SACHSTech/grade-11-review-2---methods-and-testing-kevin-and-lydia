package gr11review.part2;
import java.io.*;
import java.util.Arrays;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.InputAnalysisProcess;

import gr11review.part2.Utility;

public class Array2 {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 3};
        int value = 2;
        
        System.out.println(Utility.notAlone(nums, value));
    }
}
