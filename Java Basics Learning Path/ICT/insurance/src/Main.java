import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class Main {
    private static void printDatabase() {
        Connection connection = new DBHandler().establishConnection();

        try {
            ResultSet resultSet = connection.createStatement().executeQuery("select * from Policy_Details;");

            while (resultSet.next()) {
                String policyId = resultSet.getString(1);
                double totalCoverage = resultSet.getDouble(2);
                double balancePremium = resultSet.getDouble(3);
                int premiumDurationYears = resultSet.getInt(4);

                System.out.println(String.format("%-20s%-20s%-20s%-20s", "policy_id", "total_coverage", "balance_premium", "premium_duration_year_int"));
                System.out.println(String.format("%-20s%-20.2f%-20.2f%-20d", policyId, totalCoverage, balancePremium, premiumDurationYears));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CollectionAgency collectionAgency = new CollectionAgency();

        System.out.println("Payments Retrieved from the text file...");
        List<Payment> paymentList = collectionAgency.generatePaymentAmount("PolicyPaymentDetails.txt");
        paymentList.forEach(System.out::println);

        System.out.println("Database before updating...");
        printDatabase();

        System.out.println("Database after updating...");
        collectionAgency.updatePolicyDetails(paymentList);
        printDatabase();
    }
}
