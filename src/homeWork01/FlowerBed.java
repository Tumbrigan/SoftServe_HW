package homeWork01;

import helperClasses.DataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowerBed {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter the radius: ");
        DataReader reader = new DataReader();
        double radius = Double.parseDouble(reader.readString());
        double perimeter = Math.round(Math.PI * radius * 2 * 100) / 100.0;
        double area = Math.round(Math.PI * Math.pow(radius, 2) * 100) / 100.0;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}