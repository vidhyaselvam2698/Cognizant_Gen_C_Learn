import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PlayerSelectionSystem playerSelectionSystem = new PlayerSelectionSystem();

        System.out.println("Enter the minimum height");
        double minHeight = scanner.nextDouble();
        System.out.println("Enter the maximum weight");
        double maxWeight = scanner.nextDouble();

        List<String> players = playerSelectionSystem.playersBasedOnHeightWeight(minHeight, maxWeight);

        if (players.isEmpty()) {
            System.out.println(String.format("No players are with minimum height of %.1f and maximum weight of %.1f", minHeight, maxWeight));
        } else {
            players.forEach(System.out::println);
        }
    }
}
