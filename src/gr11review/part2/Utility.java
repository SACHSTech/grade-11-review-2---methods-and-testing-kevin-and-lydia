package gr11review.part2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
     * Sums the integers in the string
     * @param str user-inputted string
     * @return strSum (the sum of the integers in the string)
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
     * Author: Lydia He
     * Description: This program returns the longest word in the file,
     * given the name of a file filenametxt that contains a single word on each line.
     * @param filenametxt a file that contains a single word on each line.
     * @return returns the longest word in the file.
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
		}
		thefile.close();
        return strLongestWord;
    }
}
