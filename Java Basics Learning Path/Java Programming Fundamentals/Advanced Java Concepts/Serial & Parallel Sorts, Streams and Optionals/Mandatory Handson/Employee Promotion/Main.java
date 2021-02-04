import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of employees");
        int n = scanner.nextInt();
        System.out.println("Enter the employee details");
        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            String[] values = scanner.next().split(":");
            Employee employee = new Employee(values[0], values[1], Double.parseDouble(values[2]));
            employeeList.add(employee);
        }

        System.out.println("Enter the number of times salary limit to be searched");
        n = scanner.nextInt();
        Management[] managements = new Management[n];

        for (int i = 0; i < n; ++i) {
            System.out.println("Enter the salary limit to be searched");
            double salaryLimit = scanner.nextDouble();

            managements[i] = new Management(salaryLimit, employeeList);
            managements[i].start();
            managements[i].join();
        }

        for (Management management : managements) {
            double salaryLimit = management.getSalaryLimit();
            int count = management.getCount();
            System.out.println(String.format("%.1f : %d", salaryLimit, count));
        }
    }
}
