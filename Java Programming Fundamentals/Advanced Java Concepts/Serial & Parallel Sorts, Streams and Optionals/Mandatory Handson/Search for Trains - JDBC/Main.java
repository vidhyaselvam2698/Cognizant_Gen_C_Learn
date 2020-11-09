import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TrainManagementSystem trainManagementSystem = new TrainManagementSystem();

        System.out.println("Enter the source");
        String source = scanner.next();
        System.out.println("Enter the destination");
        String destination = scanner.next();
        System.out.println("Enter the coach type");
        String coachType = scanner.next().toLowerCase();

        Pattern pattern = Pattern.compile("^(ac1|ac2|ac3|sleeper|seater)$");
        Matcher matcher = pattern.matcher(coachType);

        if (matcher.matches()) {
            List<Train> trains = trainManagementSystem.viewTrain(coachType, source, destination);

            if (trains.isEmpty()) {
                System.out.println("No trains found");
            } else {
                trains.forEach(train -> System.out.println(train.getTrainNumber() + " " + train.getTrainName()));
            }
        } else {
            System.out.println("Invalid Coach Type");
        }
    }
}
