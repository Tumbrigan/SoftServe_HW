package homeWork03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class DataReader {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String readString() throws IOException {
        return reader.readLine();
    }

    int readInt() throws IOException {
        return Integer.parseInt(reader.readLine());
    }

    void close() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
