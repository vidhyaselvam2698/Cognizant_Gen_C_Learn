import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Authority {
    private static boolean isValid(String string) {
        Pattern pattern = Pattern.compile("^[a-zA-Z ]+$");
        Matcher matcher = pattern.matcher(string);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Inmate's name:");
        String name = scanner.nextLine();
        System.out.println("Inmate's father's name:");
        String fatherName = scanner.nextLine();

        if (isValid(name) && isValid(fatherName)) {
            String result = name.toUpperCase().concat(" ").concat(fatherName.toUpperCase());
            System.out.println(result);
        } else {
            System.out.println("Invalid name");
        }

        scanner.close();
    }
}
