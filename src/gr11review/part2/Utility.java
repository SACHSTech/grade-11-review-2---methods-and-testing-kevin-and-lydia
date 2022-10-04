package gr11review.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;

public class Utility {

    /**
     * Methods1: This method returns true if the given string is xy-balanced. 
     * @param str String that is tested for xy-balance. 
     * @return returns true if the given string is xy-balanced, returns false if not. 
     * @author Lydia He
     */
    public static boolean xyBalance(String str) {
        // Variables
        int intCharX = 0;
        int intCharY = 0;

        // String Methods
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                intCharX = i;
            } else if (str.charAt(i) == 'y') {
                intCharY = i;
            } else {
                intCharY = -1;
            }
        }
        
        if ((intCharX >= 1) && (intCharX >= 1)) { // If string has both x and y
            if (intCharY > intCharX) {
                return true; 
            }
        } else {
            return false;
        }
        return false;
    }


    /**
     * Sums the integers in the string
     * @param str user-inputted string
     * @return strSum (the sum of the integers in the string)
     * @author Kevin Huang
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
     * FileIO1: This method returns the longest word in the file,
     * given the name of a file filenametxt that contains a single word on each line.
     * @param filenametxt a file that contains a single word on each line.
     * @return returns the longest word in the file.
     * @author Lydia He
     */
    public static String longestWord(String filenametxt) throws IOException {
		BufferedReader thefile = new BufferedReader(new FileReader("src/gr11review/part2/" + filenametxt));

        // Variables
        String strLongestWord = "";
        String str = "";
        int intLongestWord = -1;    

        // Finds the longest word in the file
        while(str != null){
            str = thefile.readLine();
            if(str != null){
                if(str.length() > intLongestWord) {
                    intLongestWord = str.length();
                    strLongestWord = str;
                }
            }
        } thefile.close();
        return strLongestWord;
    }

    /**
     * Array1: This method returns the version of the given array where all the 10's have been removed. 
     * @param nums array values. 
     * @return returns the array without tens 
     * @author Lydia He
     */
    public static int[] withoutTen(int[] nums) {
        // Variables
        int intCount = 0;

        // Resulting Array
        int[] finalArray = new int[nums.length];

        // Calculation
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 10) {
            } else {
                finalArray[intCount] = nums[i];
                intCount++;
            }
        }

        for(int i = intCount; i < nums.length; i++) {
            finalArray[i] = 0;
        }
        return finalArray;
    }
        
    /**
     * Takes an array and return an altered array with the value altered to the greatest one beside it
     * @param nums the array of integers
     * @param value the "alone-value" that is to be altered within the array
     * @return numsReturn (the updated int array)
     * @author Kevin Huang
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
}
