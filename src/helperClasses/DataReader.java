package helperClasses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DataReader {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public int readInt() throws IOException {
        System.out.print("Enter you Integer: ");
        return Integer.parseInt(reader.readLine());
    }

    public int readInt(String offer) throws IOException {
        System.out.print(offer);
        return Integer.parseInt(reader.readLine());
    }

    public String readString() throws IOException {
        System.out.print("Enter you String: ");
        return reader.readLine();
    }

    public void close() throws IOException {
        reader.close();
    }
}
