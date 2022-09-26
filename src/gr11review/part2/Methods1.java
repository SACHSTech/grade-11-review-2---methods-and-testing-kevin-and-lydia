package gr11review.part2;
import java.io.*;

/**
 * Author: Lydia He
 * Description: This program reutrns true if the given string is xy-balanced
 */

public class Methods1 {
    public static void main(String[] args) {
        // Variables
        int intCharX;
        int intCharY;
    
        public static boolean xyBalance(String str) {
        
            // String Methods
            for (int i = 0; i < str.length(); i++) {
                // Checks for letter "x"
                if (str.charAt(i) == 'x') {
                    intCharX = i;
                }

                // Checks for letter "y"
                if (str.charAt(i) == 'y') {
                    intCharY = i;
                }
            }

            if (intCharY > intCharX) {
                return true;
            } else {
                return false;
            }
            
        }
    }
}
    

    
