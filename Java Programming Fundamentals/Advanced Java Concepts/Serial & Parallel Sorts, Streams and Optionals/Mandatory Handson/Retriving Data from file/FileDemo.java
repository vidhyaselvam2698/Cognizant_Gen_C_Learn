import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileReader("log.txt"));
        StringBuilder stringBuilder = new StringBuilder();

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            stringBuilder.append(line);
        }

        System.out.println(stringBuilder.toString());
    }
}
