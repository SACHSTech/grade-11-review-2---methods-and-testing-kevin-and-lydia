package gr11review.part2;
import java.io.*;

public class FileIO2 {
    public static void main(String[] args) throws Exception {
        PrintWriter create = new PrintWriter(new FileWriter("src/gr11review/filenametxt.txt"));
        BufferedReader file = new BufferedReader(new FileReader("filenametxt.txt"));
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        for (int lines = 1; lines <= 100; lines++) {
            String str = key.readLine();

            if (str == "0") {
                break;
            }

            create.println(str);
        }        

        System.out.println(Utility.alphaWord(filenametxt));
    }
}
