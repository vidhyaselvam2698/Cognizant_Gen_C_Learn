import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static Stream<String> getRollNumbers(String rollNumbers) {
        return Arrays.stream(rollNumbers.split(","));
    }

    public static int getCount(Stream<String> rollNumberStream, String deptAcronym) {
        return (int) rollNumberStream.filter(rollNumber -> rollNumber.substring(0, 2).equalsIgnoreCase(deptAcronym)).count();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter all roll numbers separated by comma");
        String rollNumbers = scanner.nextLine();
        Stream<String> rollNumberStream = getRollNumbers(rollNumbers);

        System.out.println("Enter the department name acronym");
        String deptAcronym = scanner.nextLine();
        int count = getCount(rollNumberStream, deptAcronym);

        if (count > 0) {
            System.out.println("Number of students in " + deptAcronym + " is " + count);
        } else {
            System.out.println("No students from " + deptAcronym);
        }
    }
}
