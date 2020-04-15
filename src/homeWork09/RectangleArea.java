package homeWork09;

import helperClasses.DataReader;

import java.io.IOException;

public class RectangleArea {
    public static void main(String[] args) {
        try (DataReader reader = new DataReader()) {
            System.err.print("Enter the first rectangle side: ");
            int a = reader.readInt();
            System.out.print("Enter the second rectangle side: ");
            int b = reader.readInt();
            System.err.println("Rectangle area: " + squareRectangle(a, b));

        } catch (IOException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0)
            throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
        return a * b;
    }
}