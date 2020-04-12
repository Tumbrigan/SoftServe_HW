package helperClasses;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This class helps read input information
 * @author Ihor Kucher
 * @version 1.02
 */

public class DataReader implements Closeable {
    private BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));

    public int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    public String readString() throws IOException {
        return reader.readLine();
    }

    public void close() throws IOException {
        reader.close();
    }
}
