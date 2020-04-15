package homeWork09;

import java.util.Arrays;
import java.util.Objects;

/**
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized.
 * Color and type are Enum. Override the method toString( ).
 * Create classes ColorException and TypeException and describe there all possible colors and types of plants.
 * In the method main create an array of five plants.
 * Check to work your exceptions.
 */

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String type, String color) throws ColorException, TypeException {
        this.size = size;
        this.type = checkType(type);
        this.color = checkColor(color);
    }

    @Override
    public String toString() {
        return "{" + size + ", "
                + type + ", "
                + color + "}";
    }

    private static Type checkType(String type) throws TypeException {
        switch (type.toLowerCase()) {
            case "roses":
                return Type.ROSES;
            case "calla_lilies":
                return Type.CALLA_LILIES;
            case "maquis":
                return Type.MAQUIS;
            case "daffodils":
                return Type.DAFFODILS;
            case "carnations":
                return Type.CARNATIONS;
            default:
                throw new TypeException("Incorrect type: " + type);
        }
    }

    private static Color checkColor(String color) throws ColorException {
        switch (color.toLowerCase()) {
            case "pink":
                return Color.PINK;
            case "yellow":
                return Color.YELLOW;
            case "red":
                return Color.RED;
            case "white":
                return Color.WHITE;
            default:
                throw new ColorException("Incorrect color: " + color);
        }
    }

    public static Plant createPlant(int size, String type, String color) {
        try {
            return new Plant(size, type, color);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public static void printBouquet(Plant[] plants) {
        Arrays.stream(plants).filter(Objects::nonNull).forEach(System.out::println);
    }
}