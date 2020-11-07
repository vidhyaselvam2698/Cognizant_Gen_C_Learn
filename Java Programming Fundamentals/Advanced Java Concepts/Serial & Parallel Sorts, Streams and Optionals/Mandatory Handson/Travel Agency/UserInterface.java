import java.util.Scanner;

public class UserInterface {
    public static CommissionInfo generateCommissionObtained() {
        return ticket -> ticket.getClassType().matches("^(SL|2S)$")
                ? 60
                : ticket.getClassType().matches("^(1A|2A|3A)$") ?
                100
                : 0;
    }

    public static void func(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCommission = 0.0;

        System.out.println("Enter the no of passengers");
        int n = scanner.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.println(String.format("Details of the Passenger %d:", (i + 1)));
            System.out.println("Enter the pnr no:");
            long pnrNo = scanner.nextLong();
            System.out.println("Enter passenger name:");
            String name = scanner.next();
            System.out.println("Enter seat no:");
            int seatNo = scanner.nextInt();
            System.out.println("Enter class type:");
            String classType = scanner.next();
            System.out.println("Enter ticket fare:");
            double ticketFare = scanner.nextDouble();

            Ticket ticket = new Ticket(pnrNo, name, seatNo, classType, ticketFare);
            CommissionInfo commissionInfo = generateCommissionObtained();
            totalCommission += commissionInfo.calculateCommissionAmount(ticket);
        }

        if (totalCommission > 0) {
            System.out.println("Commission Obtained");
            System.out.println(String.format("Commission obtained per each person: Rs.%.2f", totalCommission));
        }
    }
}
