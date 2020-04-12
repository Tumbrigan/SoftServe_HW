package homeWork01;

import helperClasses.DataReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calls {
    /**
    Phone calls from three different countries are с1, с2 and с3 standard units per minute.
    Talks continued t1, t2 and t3 minutes.
    How much computer will count for each call separately and all talk together?
    Input all source data from console, make calculations and output to the screen.
     */
    public static void main(String[] args) {
        try (DataReader reader = new DataReader()) {
            System.out.print("1st country: ");
            String country1 = reader.readString();
            System.out.print("Price per minute: ");
            double price1 = Double.parseDouble(reader.readString());
            System.out.print("Сall duration: ");
            int duration1 = Integer.parseInt(reader.readString());

            System.out.print("\n2nd country: ");
            String country2 = reader.readString();
            System.out.print("Price per minute: ");
            double price2 = Double.parseDouble(reader.readString());
            System.out.print("Сall duration: ");
            int duration2 = Integer.parseInt(reader.readString());

            System.out.print("\n3rd country: ");
            String country3 = reader.readString();
            System.out.print("Price per minute: ");
            double price3 = Double.parseDouble(reader.readString());
            System.out.print("Сall duration: ");
            int duration3 = Integer.parseInt(reader.readString());

            double callPrice1 = Math.round(price1 * duration1 * 100) / 100.0;
            double callPrice2 = Math.round(price2 * duration2 * 100) / 100.0;
            double callPrice3 = Math.round(price3 * duration3 * 100) / 100.0;

            System.out.println("\nCall price for " + country1 + " : " + callPrice1);
            System.out.println("Call price for " + country2 + " : " + callPrice2);
            System.out.println("Call price for " + country3 + " : " + callPrice3);
            System.out.println("Price for all calls: " + (callPrice1 + callPrice2 + callPrice3));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
