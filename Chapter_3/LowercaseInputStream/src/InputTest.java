import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputTest {
    public static void main(String[] args) {
        int c;
        // Use try-with-resources for automatic closing of the stream
        try (InputStream in = new LowerCaseInputStream(
                new BufferedInputStream(
                        new FileInputStream("C:\\Users\\evan\\OneDrive\\Documents\\test.txt.txt")
                ))) {

            while ((c = in.read()) >= 0) {
                System.out.print((char) c); // Print without line break
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
