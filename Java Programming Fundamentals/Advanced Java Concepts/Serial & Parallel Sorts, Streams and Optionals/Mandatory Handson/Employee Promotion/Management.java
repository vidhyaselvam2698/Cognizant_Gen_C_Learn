import java.util.List;

public class Management extends Thread {
    private double salaryLimit;
    private List<Employee> employeeList;
    private int count;

    public Management(double salaryLimit, List<Employee> employeeList) {
        this.salaryLimit = salaryLimit;
        this.employeeList = employeeList;
    }

    public double getSalaryLimit() {
        return salaryLimit;
    }

    public void setSalaryLimit(double salaryLimit) {
        this.salaryLimit = salaryLimit;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public void run() {
        count = (int) employeeList.stream().filter(employee -> employee.getEmpSalary() >= salaryLimit).count();
    }
}
