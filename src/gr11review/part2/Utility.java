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
     * @author L. He
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
     * FileIO1: This method returns the longest word in the file,
     * given the name of a file filenametxt that contains a single word on each line.
     * @param filenametxt a file that contains a single word on each line.
     * @return returns the longest word in the file.
     * @author L. He
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
     * @author L. He
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
     * Array6: This program creates an array, given n>=0, with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} 
     * The length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.
     * @param n The end value in the array
     * @return The resulting array following the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n} 
     * @author L. He
     */
    public static int[] seriesUp(int n) {
        // Variable
        int intCount = 0;

        // Resulting Array
        int[] finalArray = new int[n * (n + 1) / 2];

        // Two loops
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                finalArray[intCount] = j;
            }
        }
        return finalArray;
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
     * Array7: This method takes a 2D array and reverses all of the content in the 2D array
     * @param arr Array input that gets reversed
     * @return Returns the outputted reversed 2D array
     * @author L. He
     */
    public static int[][] reverse(int[][] arr) {
        // Resulting Array
        int[][] finalArray = new int[arr.length][arr[0].length];
        
        // Calculation
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++) {
                // Final array is the reverse of int[][] arr
                finalArray[arr.length - i - 1][arr[0].length - j - 1] = arr[i][j];
            }
        }

        return finalArray;
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

                invert[i][j] = arr[j][i]; // changes row index to col index and vice versa
            }
        }
        
<<<<<<< HEAD
        return invert;
    }

     
=======
        return Arrays.deepToString(invert); // Had to change the signature in order to stop aliasing the array objects
    } 
>>>>>>> 11be11fed1584994c2d9a778d6beeecc127fbffd
}
