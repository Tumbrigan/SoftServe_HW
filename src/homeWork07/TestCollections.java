package homeWork07;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Declare collection myCollection of 10 integers and fill it (from the console or random).
 * <ol>
 *      <li>
 *          Find and save in list newCollection all positions of element more than 5 in the collection.<br>
 *          Print newCollection
 *      </li>
 *      <li>
 *          Remove from collection myCollection elements, which are greater then 20. Print result
 *      </li>
 *      <li>
 *          Insert elements 1, -3, -4 in positions 2, 8, 5.
 *          Print result in the format: “position – xxx, value of element – xxx”
 *      </li>
 *      <li>
 *          Sort and print collection
 *       </li>
 * </ol>
 */

public class TestCollections {
    public static void main(String[] args) {
//        Declare collection myCollection of 10 integers
//        and fill it (from the console or random).
        List<Integer> myCollection = new ArrayList<>();
        fillCollection(myCollection, 10, 100);
        System.out.println(myCollection.toString());

//        Find and save in list newCollection all positions of element more than 5 in the collection.
//        Print newCollection
        List<Integer> newCollection = createNewCollection(myCollection, 5);
//                myCollection.stream().filter(x -> x > 5).collect(Collectors.toList());
        System.out.println(newCollection.toString());

//        Remove from collection myCollection elements, which are greater then 20. Print result
        removeGraterThan(myCollection, 20);
        System.out.println(myCollection);

//        Insert elements 1, -3, -4 in positions 2, 8, 5.
//        Print result in the format: “position – xxx, value of element – xxx”
        insertAndPrint(myCollection, 2, 1);
        insertAndPrint(myCollection, 8, -3);
        insertAndPrint(myCollection, 5, -4);

//        Sort and print collection
        sortAndPrint(myCollection);
    }

    public static void fillCollection(List<Integer> list, int sizeOfList, int maxValue) {
        for (int i = 0; i < sizeOfList; i++) {
            list.add(new Random().nextInt(maxValue));
        }
    }

    public static List<Integer> createNewCollection(List<Integer> list, int minValue) {
        List<Integer> newCollection = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > minValue)
                newCollection.add(i);
        }
        return newCollection;
    }

    public static void removeGraterThan(List<Integer> list, int maxValue) {
        list.removeIf(x -> x > maxValue);
    }


    public static void insertAndPrint(List<Integer> list, int index, int value) {
        if(list.size() > index) {
            list.add(index, value);
            System.out.format("Position - %1$d, value of element - %2$d%n", index, value);
        } else {
            System.out.println("The index must be less than or equal to the size of the list!");
        }
    }

    public static void sortAndPrint(List<Integer> list) {
        Collections.sort(list);
        System.out.println(list);
    }
}
