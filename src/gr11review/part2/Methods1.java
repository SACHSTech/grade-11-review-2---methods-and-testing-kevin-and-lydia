package gr11review.part2;
import java.io.*;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.InputAnalysisProcess;

import gr11review.part2.Utility;

public class Methods1 {

    public static void main(String[] args) {
        String str = "aaxbby";
        System.out.println(Utility.xyBalance(str)); // true
        System.out.println(Utility.xyBalance("aaxbb")); // false
        System.out.println(Utility.xyBalance("yaaxbb")); // false
        System.out.println(Utility.xyBalance("xxyxxy")); // true
        System.out.println(Utility.xyBalance("yxxyxx")); // false
    }

}