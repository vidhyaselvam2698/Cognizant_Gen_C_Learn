import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static Map<String, Double> employeeMap;

    public Map<String, Double> getEmployeeMap() {
        return employeeMap;
    }

    public void setEmployeeMap(Map<String, Double> employeeMap) {
        Main.employeeMap = employeeMap;
    }

    public void addEmployeeDetails(String employeeName, double salary) {
        employeeMap.put(employeeName, salary);
    }

    public static EmployeeAudit findEmployee() {
        return salary -> new ArrayList<>(employeeMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() <= salary)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        main.setEmployeeMap(new LinkedHashMap<>());

        while (true) {
            System.out.println("1. Add Employee details");
            System.out.println(" 2. Find Employee details");
            System.out.println(" 3. Exit");
            System.out.println("Enter the choice");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Enter the Employee name");
                String name = scanner.next();
                System.out.println("Enter the Employee Salary");
                double salary = scanner.nextDouble();
                main.addEmployeeDetails(name, salary);
            } else if (choice == 2) {
                System.out.println("Enter the salary to be searched");
                double salary = scanner.nextDouble();
                EmployeeAudit employeeAudit = findEmployee();
                List<String> employees = employeeAudit.fetchEmployeeDetails(salary);

                if (employees.isEmpty()) {
                    System.out.println("No Employee Found");
                } else {
                    employees.forEach(System.out::println);
                }
            } else {
                System.out.println("Let’s complete the session");
                System.exit(0);
            }
        }
    }
}