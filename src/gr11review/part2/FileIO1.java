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

    /**
    public static String longestWord(String filenametxt) throws IOException {
        BufferedReader thefile = new BufferedReader(new FileReader(filenametxt));

        // Variables
        String str;
        str = "";
        
        while(str != null){
			str = thefile.readLine();
			if(str != null){
				System.out.println(str.length());
			}
		}
		thefile.close();

        return filenametxt;
    }
    */

	public static void main(String[] args) throws IOException{
        String bro = "words.txt";
		BufferedReader thefile = new BufferedReader(new FileReader("src/gr11review/part2/" + bro));
        // Variables
        String str;
        str = "";
        
        while(str != null){
			str = thefile.readLine();
			if(str != null){
				System.out.println(str.length());
			}
		}

		thefile.close();
    }
}
