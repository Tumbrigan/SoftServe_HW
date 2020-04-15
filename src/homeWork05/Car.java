package homeWork05;

/*
Create class Car with fields type, year of production and engine capacity.
Create and initialize four instances of class Car.
Display cars
    * certain model year  (enter year in the console);
    * ordered by the field year.

 */

import helperClasses.DataReader;

import java.io.IOException;
import java.util.Arrays;

public class Car implements Comparable<Car> {
    private String type;
    private int yearOfProduction;
    private int engineCapacity;

    DataReader reader;

    public Car(DataReader reader) throws IOException {
        this.reader = reader;
        setType();
        setYearOfProduction();
        setEngineCapacity();
    }

    private void setType() throws IOException {
        System.out.print("Enter type name: ");
        this.type = reader.readString();
    }

    private void setYearOfProduction() throws IOException {
        System.out.print("Enter year of production: ");
        this.yearOfProduction = reader.readInt();
    }

    private void setEngineCapacity() throws IOException {
        System.out.print("Enter engine capacity: ");
        this.engineCapacity = reader.readInt();
    }

    public static Car[] createCars(int amount, DataReader reader) throws IOException {
        Car[] cars = new Car[amount];
        for (int i = 0; i < amount; i++) {
            System.out.println("Car #" + (i + 1));
            cars[i] = new Car(reader);
            System.out.println();
        }
        return cars;
    }

    @Override
    public String toString() {
        return String.format("[Type: %s; year of production: %d; engine capacity: %d]",
                type, yearOfProduction, engineCapacity);
    }

    @Override
    public int compareTo(Car o) {
        return this.yearOfProduction - o.yearOfProduction;
    }

    public static void main(String[] args) throws IOException {
        DataReader reader = new DataReader();
        Car[] cars = Car.createCars(4, reader);
        Arrays.sort(cars);
        for (Car car: cars) {
            System.out.println(car);
        }
    }
}