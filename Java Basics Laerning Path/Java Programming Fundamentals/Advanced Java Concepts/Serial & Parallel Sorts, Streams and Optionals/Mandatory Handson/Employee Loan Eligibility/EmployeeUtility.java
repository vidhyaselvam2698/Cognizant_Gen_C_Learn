import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeUtility {
    public Employee[] getEmployeeDetails(String[] details) {
        Object[] objects = Arrays.stream(details).map(detail -> {
            String[] values = detail.split(";");
            String empId = values[0];
            String empName = values[1];
            double salary = Double.parseDouble(values[2]);

            Employee employee = new Employee();
            employee.setEmpId(empId);
            employee.setEmpName(empName);
            employee.setSalary(salary);

            return employee;
        }).toArray();
        return Arrays.copyOf(objects, objects.length, Employee[].class);
    }

    public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {
        return Arrays.stream(empDetails);
    }

    public String[] shortlistedEmployee(Stream<Employee> empStream, double minSalary) {
        Object[] objects = empStream.filter(employee -> employee.getSalary() >= minSalary).sorted((e1, e2) -> e1.getEmpId().compareTo(e2.getEmpId())).map(employee -> String.format("%s %s %.1f", employee.getEmpId(), employee.getEmpName(), employee.getSalary())).toArray();
        return Arrays.copyOf(objects, objects.length, String[].class);
    }
}