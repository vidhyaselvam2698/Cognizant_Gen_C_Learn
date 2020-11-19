import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeUtility employeeUtility = new EmployeeUtility();

        System.out.println("Enter the number of Employees");
        int n = Integer.parseInt(scanner.nextLine());

        if (n > 0) {
            System.out.println("Enter the details of Employees");
            String[] details = new String[n];

            for (int i = 0; i < n; i++) {
                details[i] = scanner.nextLine();
            }

            System.out.println("Enter the minimum eligible salary");
            double minSalary = Double.parseDouble(scanner.nextLine());

            String[] results = employeeUtility.shortlistedEmployee(employeeUtility.getStreamOfEmployee(employeeUtility.getEmployeeDetails(details)), minSalary);

            if (results.length > 0) {
                System.out.println("Shortlisted Employees are");
                Arrays.asList(results).forEach(System.out::println);
            } else {
                System.out.println("No Employee is having the required salary");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}