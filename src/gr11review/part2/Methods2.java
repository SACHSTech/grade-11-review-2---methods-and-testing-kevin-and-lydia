package gr11review.part2;
import java.io.*;

import org.junit.jupiter.params.shadow.com.univocity.parsers.common.input.InputAnalysisProcess;

import gr11review.part2.Utility;

public class Methods2 {
    public static void main(String[] args) throws Exception {
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        String str = key.readLine();
        
        System.out.println(Utility.sumNumbers(str));
    }
}
