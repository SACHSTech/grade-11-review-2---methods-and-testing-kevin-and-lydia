package gr11review.part2;
import java.io.*;

public class FileIO1 {

    /**
     * Author: Lydia He
     * Description: This program returns the longest word in the file,
     * given the name of a file filenametxt that contains a single word on each line.
     * @param filenametxt a file that contains a single word on each line.
     * @return returns the longest word in the file.
     * @throws IOException
     */


    public static String longestWord(String filenametxt) throws IOException {
		BufferedReader thefile = new BufferedReader(new FileReader("src/gr11review/part2/" + filenametxt));

        // Variables
        String str;
        str = "";
        String strLongestWord = null;
        
        while(str != null){
			str = thefile.readLine();
			if(str != null){
				System.out.println(str.length());
			}
		}
		thefile.close();

        return strLongestWord;
    }


	public static void main(String[] args) throws IOException{
        System.out.println(longestWord("words.txt"));
    }
}
