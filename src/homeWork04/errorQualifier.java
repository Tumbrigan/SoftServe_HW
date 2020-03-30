package homeWork04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
read number of HTTP Error (400, 401,402, ...)
and write the name of this error (Declare enum HTTPError)
 */

public class errorQualifier {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());

        check(i);
    }

    private static void check(int i) {
        switch (i) {
            case 100:
                System.out.println(httpErrors.CONTINUE);
                break;
            case 101:
                System.out.println(httpErrors.SWITCHING_PROTOCOLS);
                break;
            case 200:
                System.out.println(httpErrors.OK);
                break;
            case 201:
                System.out.println(httpErrors.CREATED);
                break;
            case 202:
                System.out.println(httpErrors.ACCEPTED);
                break;
            case 204:
                System.out.println(httpErrors.NO_CONTENT);
            case 404:
                System.out.println(httpErrors.NOT_FOUND);
                break;
            default:
                System.out.println("I don't know your problem...");
        }
    }
}
