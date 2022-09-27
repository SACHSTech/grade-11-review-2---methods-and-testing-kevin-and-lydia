package gr11review.part2;

/**
 * Author: Lydia He
 * Description: This program reutrns true if the given string is xy-balanced. 
 */

public class Methods1 {
    // Variables
    static int intCharX = -1;
    static int intCharY = -1;

    public static boolean xyBalance(String str) {
        // String Methods
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'x') {
                intCharX = i;
                System.out.println(i);
            }

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


    public static void main(String[] args) {
        System.out.println(xyBalance("aaxbby")); // true
        System.out.println(xyBalance("aaxbb")); // false
        System.out.println(xyBalance("yaaxbb")); // false
        System.out.println(xyBalance("xxyxxy")); // true
        System.out.println(xyBalance("yxxyxx")); // false
    }
}
    

    
