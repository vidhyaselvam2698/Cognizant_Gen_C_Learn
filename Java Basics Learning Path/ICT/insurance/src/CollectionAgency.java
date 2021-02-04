import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CollectionAgency {
    /**
     * This method should take the file path as argument
     * and it should parse the data stored in the file and
     * it should validate the policy Id by invoking the validate(String policyId) method,
     * if valid, construct a Payment object for each record in the file,
     * and then calculate the payment amount by invoking the calculatePaymentAmount method of Payment class.
     * After calculating the payment amount,
     * each Payment should be added to the list and this method should return the list of Payment.
     * @param filePath Path include the name where the file is located
     * @return List of Payment after reading data from the file
     * @see Payment
     */
    public List<Payment> generatePaymentAmount(String filePath) {
        List<Payment> paymentList = new ArrayList<>();

        try {
            // Creating scanner object for reading data from the file
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)));

            while (scanner.hasNext()) {
                String[] values = scanner.nextLine().split(",");
                String policyId = values[0];
                double monthlyPremium = Double.parseDouble(values[1]);
                int noOfMonth = Integer.parseInt(values[2]);

                try {
                    // Validating policyId
                    if (validate(policyId)) {
                        Payment payment = new Payment();
                        payment.setPolicyId(policyId);
                        payment.setMonthlyPremium(monthlyPremium);
                        payment.setNoOfMonths(noOfMonth);
                        payment.calculatePaymentAmount();

                        // Adding new Payment to the paymentList
                        paymentList.add(payment);
                    }
                } catch (InvalidPolicyIdException e) {
                    // Printing error message if the policy id is invalid
                    System.out.println(e.getMessage());
                }
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return paymentList;
    }

    /**
     * This method should validate the policyId,
     * if valid return true else this method should throw an user-defined exception
     * and adding it to the list.
     * The policyId should be in the following format:
     * 1.The policyId should contain exactly 10 characters
     * 2.The fifth character must be an alphabet “H” in upper-case only.
     * If the policyId is valid then parse the data and calculate the payment amount
     * else throw a user defined Exception “InvalidPolicyIdException” with a message "Invalid Policy Id".
     * @param policyId Policy Id of a customer
     * @return true if the policyId qualify the specification given
     * @throws InvalidPolicyIdException when policyId does not match the specification
     */
    public boolean validate(String policyId) throws InvalidPolicyIdException {
        Pattern pattern = Pattern.compile("^\\w{4}H\\w{5}$");
        Matcher matcher = pattern.matcher(policyId);

        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidPolicyIdException("Invalid Policy Id");
        }
    }

    /**
     * This method should update the balance_premium by reducing the existing value with the calculated payment amount in the Policy_Detailstable.
     * Assume that the balance_premium will be greater than or equal to calculated payment amount.
     * @param paymentList List of Payment
     * @see Payment
     */
    public void updatePolicyDetails(List<Payment> paymentList) {
        Connection connection = new DBHandler().establishConnection();

        for (Payment payment : paymentList) {
            try {
                // Getting current balance premium
                PreparedStatement preparedStatement1 = connection.prepareStatement("select balance_premium from Policy_Details where policy_id = ?;");
                preparedStatement1.setString(1, payment.getPolicyId());
                ResultSet resultSet = preparedStatement1.executeQuery();

                resultSet.next();
                double currentBalance = resultSet.getDouble(1);
                double updatedBalance = currentBalance - payment.getPaymentAmount();

                // Updating the balance premium with the new value
                PreparedStatement preparedStatement2 = connection.prepareStatement("update Policy_Details set balance_premium = ? where policy_id = ?;");
                preparedStatement2.setDouble(1, updatedBalance);
                preparedStatement2.setString(2, payment.getPolicyId());

                preparedStatement2.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}