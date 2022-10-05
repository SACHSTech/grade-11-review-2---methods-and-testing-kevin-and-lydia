package gr11review.part2;

import java.io.*;
import java.util.Arrays;

public class Utility {

    /**
     * Author: Lydia He
     * Description: This program returns true if the given string is xy-balanced
     * @param str String that is tested for xy-balance. 
     * @return returns true if the given string is xy-balanced, returns false if not. 
     */
    public static boolean xyBalance(String str) {
        // Variables
        int intCharX = 0;
        int intCharY = 0;

        // String Methods
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                intCharX = i;
            } else {
                intCharX = -1;
            }
            if (str.charAt(i) == 'y') {
                intCharY = i;
            } else {
                intCharY = -1;
            }
        }

        if (intCharY > intCharX) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Methods2: Sums the integers in the string
     * @param str String used to compute number of integers.
     * @return strSum the sum of the integers in the string.
     * @author K. Huang
     */ 
    public static int sumNumbers(String str) {
        int strSum = 0;
        String strTemp = "0";

        for (int i = 0; i < str.length(); i++) {
            // if character at i is digit, add index to strTemp
            if (Character.isDigit(str.charAt(i))) {
                strTemp += str.charAt(i);
            }
            // Once index is not a digit, convert strTemp to int and add to strSum
            else {
                strSum += Integer.parseInt(strTemp);
                strTemp = "0";
            }
        }

        // return sum including the strTemp at last index in case strTemp still has a value
        return strSum + Integer.parseInt(strTemp);
    }


    /**
     * FileIO2: This method returns the 1st word alphabetically in the given file
     * @param filenametxt a file that contains a single word on each line.
     * @return returns the alphabetically first word in the file.
     * @throws IOException
     * @author K. Huang
     */
    public static String alphaWord(String filenametxt) throws IOException {
        BufferedReader file = new BufferedReader(new FileReader("src/gr11review/part2/" + filenametxt));
        String str = "";
        String strAlpha = "";

        // Finds the alphabetically first word
        while (str != null) {
            str = file.readLine();

            if (str != null) {
                if (str.compareTo(strAlpha) < 0) {
                    strAlpha = str;
                }
            }
        }

        file.close();
        return strAlpha;
    }

    
    /**
     * Array2: Takes an integer array and return an altered array with the value altered to the greatest one beside it.
     * @param nums the array of integers used.
     * @param value the "alone-value" that is to be altered within the array.
     * @return numsReturn the updated array with the "alone" values changed.
     * @author K. Huang
     */
    public static int[] notAlone(int[] nums, int value) {
        if (nums.length >= 1) { // In case the array size is 0
            int[] numsReturn = new int[nums.length];
            numsReturn[0] = nums[0];

            for (int i = 1; i < nums.length; i++) {
                // If index is the value and is not at the end of the array
                if (nums[i] == value && i != nums.length-1) {
                    if (nums[i-1] > nums[i+1]) {
                        numsReturn[i] = nums[i-1];
                    }
                    else {
                        numsReturn[i] = nums[i+1];
                    }
                }
                else {
                    numsReturn[i] = nums[i];
                }
                System.out.println(numsReturn);
            }
    
            return numsReturn;
        }
        else {
            return nums;
        }
        
    }


    /**
     * Array5: Takes an integer array and returns true/false based on if it can be split evenly.
     * @param nums the integer array that is tested if it can be split.
     * @return returns true if the given array can be split evenly.
     * @author K. Huang
     */
    public static boolean canBalance(int[] nums) {
        double dblSum = 0;
        int split = 0;
        boolean isTrue = false;

        // Iterate through to sum total of the array 
        for (int i = 0; i < nums.length; i++) {
            dblSum += nums[i];
        }

        // Iterate to add up the first half of the array and compare if the array is balanced
        for (int j = 0; j < nums.length; j++) {
            if (split == dblSum - split) { 
                isTrue = true;
                break;
            } 

            split += nums[j];
        }

        if (nums.length < 2) {
            return true;
        }
        else {
            return isTrue;
        }
    }


    /**
     * Array9: Inverts the given 2D Array.
     * @param arr the 2D array given.
     * @return the inverted array.
     * @author K. Huang
     */
    public static int[][] invert(int[][] arr) {
        int[][] invert = new int[arr.length][arr.length];

        // inverts the 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                invert[i][j] = arr[j][i];
            }
        }
        
        return invert;
    }

     
}
