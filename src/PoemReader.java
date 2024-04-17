import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PoemReader {
    public static void main(String[] args) {
        String fileName = "poem2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String poemName;
            String poetName;

            // Read the first line (poem name)
            while ((poemName = reader.readLine()) != null) {
                // Read the second line (poet name)
                if ((poetName = reader.readLine()) != null) {
                    // Create a Poem object for each poem name and poet pair
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
