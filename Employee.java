import java.util.*;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " - Age: " + age + ", Salary: $" + salary;
    }
}

public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", 25, 50000));
        employees.add(new Employee("Bob", 30, 60000));
        employees.add(new Employee("Charlie", 22, 55000));

        System.out.println("Original List:");
        employees.forEach(System.out::println);

        // Sorting by Name
        employees.sort(Comparator.comparing(Employee::getName));
        System.out.println("\nSorted by Name:");
        employees.forEach(System.out::println);

        // Sorting by Age
        employees.sort(Comparator.comparingInt(Employee::getAge));
        System.out.println("\nSorted by Age:");
        employees.forEach(System.out::println);

        // Sorting by Salary
        employees.sort(Comparator.comparingDouble(Employee::getSalary));
        System.out.println("\nSorted by Salary:");
        employees.forEach(System.out::println);
    }
}
