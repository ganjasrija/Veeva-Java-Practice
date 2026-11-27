
class Employee {

    // Private instance variables (Encapsulation)
    private final int employeeId;
    private String name;
    private double basicSalary;

    // Static variable shared by all employees
    private static int totalEmployees = 0;

    // Constructor 1: All employee details
    public Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        totalEmployees++;
    }

    // Constructor 2: Employee details with default salary
    public Employee(int employeeId, String name) {
        this(employeeId, name, 0.0);
    }

    // Calculate HRA, DA and final salary
    public double calculateSalary() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;

        return basicSalary + hra + da;
    }

    // Display employee salary details
    public void displayDetails() {

        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.10;
        double finalSalary = calculateSalary();

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Final Salary: " + finalSalary);
    }

    // Static method to get total employees
    public static int getTotalEmployees() {
        return totalEmployees;
    }
}

public class EmployeePayroll {

    public static void main(String[] args) {

        // Creating multiple employee objects
        Employee emp1 = new Employee(101, "Srija", 30000);
        Employee emp2 = new Employee(102, "Rahul", 40000);
        Employee emp3 = new Employee(103, "Priya");

        // Display employee details
        System.out.println("---- Employee 1 ----");
        emp1.displayDetails();

        System.out.println("\n---- Employee 2 ----");
        emp2.displayDetails();

        System.out.println("\n---- Employee 3 ----");
        emp3.displayDetails();

        // Display total employees
        System.out.println("\nTotal Employees: "
                + Employee.getTotalEmployees());
    }
}
