package homeWork07;

import helperClasses.DataReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * In the main() method declare map employeeMap of pairs <Integer, String>.
 * Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
 * Ask user to enter ID, then find and write corresponding name from your map.
 * If you can't find this ID - say about it to user (use function containsKey()).
 * Ask user to enter name, verify than you have name in your map and write corresponding ID.
 * If you can't find this name - say about it to user (use function containsValue()).
 */

public class EmployeeMap {
    public static void main(String[] args) {
        Map<Integer, String> employeeMap = new HashMap<>();
        try (DataReader reader = new DataReader()) {
            fillMap(employeeMap, 3, reader);
            System.out.println();
            System.out.println(employeeMap.toString());
            System.out.println();
            findUserByID(employeeMap, reader);
            System.out.println();
            findUserByName(employeeMap, reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fillMap(Map<Integer, String> map, int pairsAmount, DataReader reader) throws IOException {
        for (int i = 1; i <= pairsAmount; i++) {
            System.out.printf("id #%d: ", i);
            int id = reader.readInt();
            System.out.printf("name with id #%d: ", i);
            String name = reader.readString();
            map.put(id, name);
        }
    }

    public static void findUserByID(Map<Integer, String> map, DataReader reader) throws IOException {
        System.out.print("Enter user's ID: ");
        int id = reader.readInt();
        if (map.containsKey(id)) {
            System.out.println("Your employee's name: " + map.get(id));
        } else {
            System.out.println("Dude, IDK about your employee...");
        }
//        System.out.println("Your employee's name: "
//                + map.getOrDefault(id, "Dude, IDK about your employee..."));
    }

    public static void findUserByName(Map<Integer, String> map, DataReader reader) throws IOException {
        System.out.print("Enter user's name: ");
        String name = reader.readString();
        if (map.containsValue(name)) {
            // A map cannot contain duplicate keys; each key can map to at most one value.
            // But a map can contain two and more identical values, so I check whole the map.
            for (Map.Entry<Integer, String> entry : map.entrySet()) {
                if (entry.getValue().equals(name)) {
                    System.out.println("Your employee's ID: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Dude, IDK about your employee...");
        }
    }
}