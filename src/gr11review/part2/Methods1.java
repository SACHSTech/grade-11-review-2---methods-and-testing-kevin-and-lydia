package gr11review.part2;
import java.io.*;

/**
 * Author: Lydia He
 * Description: This program reutrns true if the given string is xy-balanced. 
 */

public class Methods1 {
    // Variables
    static int intCharX = 0;
    static int intCharY = 0;
    static boolean blnHasX = false;
    static boolean blnHasY = false;

    public static boolean xyBalance(String str) {
    
        // String Methods
        for (int i = 0; i < str.length(); i++) {
            // Checks for letter "x"
            if (str.charAt(i) == 'x') {
                intCharX = i;
                blnHasX = true;
            }

            // Checks for letter "y"
            if (str.charAt(i) == 'y') {
                intCharY = i;
                blnHasY = true;
            }
        }

        if ((blnHasX == true) && (blnHasY == true)) {
            if (intCharY > intCharX) {
                return true;
            }
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby"));
        System.out.println(xyBalance("aaxbb"));
        System.out.println(xyBalance("yaaxbb"));
    }
}
    

    
