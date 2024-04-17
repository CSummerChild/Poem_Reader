/**Class: PoemReader
 * @author Tyler Robinson
 * @version 1.7
 * Course: ITEC 2140 Spring 2023
 * Written: April 17, 2024
 */



import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemReader {
    public static void main(String[] args) {
        String fileName = "poem2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String poemName;
            String poetName;


            while ((poemName = reader.readLine()) != null) {

                if ((poetName = reader.readLine()) != null) {
/**Class: ReadCSCVFile
 * @author Tyler Robinson
 * @version 1.5
 * Course: ITEC 2140 Spring 2023
 * Written: April 17, 2024
 */

                    Poem poem = new Poem();
                    poem.setName(poemName);
                    poem.setPoet(poetName);

                    // Print poem information
                    System.out.println("Poem");
                    System.out.println("Name: " + poem.getName());
                    System.out.println("Poet: " + poem.getPoet());
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
