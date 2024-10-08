import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

    public LowerCaseInputStream(InputStream in){
        super(in); // Correct constructor chaining
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1) ? c : Character.toLowerCase((char) c); // Proper method call to super
    }

    @Override
    public int read(byte[] b, int offset, int len) throws IOException {
        int result = super.read(b, offset, len); // Use super.read()
        if (result != -1) {
            for (int i = offset; i < offset + result; i++) {
                b[i] = (byte) Character.toLowerCase((char) b[i]);
            }
        }
        return result;
    }
}
