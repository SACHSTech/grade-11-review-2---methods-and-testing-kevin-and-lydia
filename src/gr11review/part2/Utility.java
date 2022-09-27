package gr11review.part2;

import java.io.*;

public class Utility {

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

    public static String alphaWord(String filenametxt) throws Exception {
        BufferedReader file = new BufferedReader(new FileReader("src/gr11review/part2/filenametxt.txt"));
        String strRead = "";
        String strTemp = "Z";

        while (strRead != null) {
            strRead = file.readLine();

            if ((int) strRead.charAt(0) < (int) strTemp.charAt(0)) {
                strTemp += strRead;
            }
        }

        return strTemp;
    }


    
}
