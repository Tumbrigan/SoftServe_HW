package Homework06;

public class Task02 {
    public static void main(String[] args) {
        Person[] persons = {new Teacher(), new Cleaner(), new Student(), new Teacher()};
        System.out.println();
        for (Person person : persons) {
            person.print();
            if (person instanceof Staff)
                ((Staff) person).salary();
            System.out.println();
        }
    }
}