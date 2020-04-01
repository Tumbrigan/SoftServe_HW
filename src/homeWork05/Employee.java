package homeWork05;

/*
Create a class Employee with fields name, department number, salary.
Create five objects of class Employee.
Display all employees of a certain department (enter department number in the console);
arrange workers by the field salary in descending order.
*/
import helperClasses.DataReader;
import java.io.IOException;

public class Employee {
    public static void main(String[] args) throws IOException {
        int emplAmount = 5;
        Employee[] employees = createArray(emplAmount);
        int deptNumber = DataReader.readInt();
        printAllByDeptNumber(employees, deptNumber);
        sortArrayBySalary(employees);
        printAll(employees);
    }

    private String name;
    private int departmentNumber;
    private long salary;

    private long getSalary() {
        this.salary = (int) (Math.random() * 20000) + 20000;
        this.salary = this.salary / 1000 * 1000;
        return salary;
    }

    public Employee(String name, int departmentNumber) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = getSalary();
    }

    @Override
    public String toString() {
        return this.name + ", department number: " +
                departmentNumber + ", salary: " +
                salary;
    }

    private static Employee[] createArray(int emplAmount) {
        String[] names = {"John", "Mike", "Michael", "Paul", "Vasya"};
        Employee[] employees = new Employee[emplAmount];
        for (int i = 0; i < emplAmount; i++) {
            employees[i] = new Employee(names[i], i + 1);
        }
        return employees;
    }

    private static void printAllByDeptNumber(Employee[] employees, int deptNumber) {
        System.out.println("\tAll employees by department number " + deptNumber + ":");
        for (Employee empl : employees) {
            if (deptNumber == empl.departmentNumber)
                System.out.println(empl);
        }
        System.out.println();
    }

    private static void sortArrayBySalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            for (int j = 0; j < employees.length - 1; j++) {
                if (employees[j].salary < employees[j + 1].salary) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }

    private static void printAll(Employee[] employees) {
        System.out.println("\tAll employees:");
        for (Employee empl : employees) {
            System.out.println(empl);
        }
        System.out.println();
    }
}