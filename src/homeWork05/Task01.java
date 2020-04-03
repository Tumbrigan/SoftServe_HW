package homeWork05;

import helperClasses.DataReader;

import java.io.IOException;

/*
Ask user to enter the number of month.
Read the value and write the amount of days in this month
(create array with amount days of each month).
 */

public class Task01 {
    public static void main(String[] args) throws IOException {
        Months[] i = Months.values();
        DataReader reader = new DataReader();
        int monthNumber = reader.readInt();
        System.out.println("Enter the month number: ");
        if (monthNumber < 1 | monthNumber > 12 ) {
            System.out.println("Invalid number");
        } else {
            String str = i[monthNumber - 1].name();
            System.out.println("Month: " + str);
        }
    }
}