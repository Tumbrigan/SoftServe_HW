package homeWork05;

import helperClasses.DataReader;

import java.io.IOException;

/*
Organize entering integers until the first negative number.
Count the product of all entered even numbers.
 */

public class WhileClass {
    private DataReader reader;

    public WhileClass(DataReader reader) {
        this.reader = reader;
    }

    private int callSomeMethod() throws IOException {
        int prod = reader.readInt();
        if (prod < 0) return 0;
        if (prod % 2 == 1) {
            do {
                prod = reader.readInt();
                if (prod < 0) return 0;
            } while (prod % 2 == 1);
        }
        int current;
        while ((current = reader.readInt()) > 0) {
            if (current % 2 == 0)
                prod *= current;
        }
        return prod;
    }


    public static void main(String[] args) throws Exception {
        try (DataReader reader = new DataReader()) {
            WhileClass test = new WhileClass(reader);
            int prod = test.callSomeMethod(); // the product of all entered even numbers
            System.out.println(prod);
        }
    }
}
