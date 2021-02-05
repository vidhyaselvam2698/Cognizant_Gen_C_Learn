public class Payment {
    private String policyId;
    private double monthlyPremium;
    private int noOfMonths;
    private double paymentAmount;

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public double getMonthlyPremium() {
        return monthlyPremium;
    }

    public void setMonthlyPremium(double monthlyPremium) {
        this.monthlyPremium = monthlyPremium;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    /**
     * This method should calculate and set the payment amount based on the monthly Premium and
     * no of Months for each payment.
     *
     * No Of Months	Penalty Percentage on the paymentAmount
     * 1	                0% (No penalty)
     * >1 and <=5	        3%
     * >5 and <=12	        5%
     * >12	                7%
     *
     * For example: If a payment has a monthly premium of Rs. 5000 and the number of months as 4, then the payment amount will be (5000*4) which is 20000.00. Since the number of months is 4, the penalty percentage will be 3%.
     * Therefore, the penalty will be (20000.0*(3/100)) which is Rs. 600.00. Therefore, the payment amount for this payment will be((5000*4)-600.0) which is Rs.19400.00.
     * After calculating the payment amount for each payment, store the payment object into a list.
     */
    public void calculatePaymentAmount() {
        paymentAmount = monthlyPremium * (double) noOfMonths;
        double percentage = 0.0;

        if (noOfMonths > 1 && noOfMonths <= 5) {
            percentage = 3;
        } else if (noOfMonths > 5 && noOfMonths <= 12) {
            percentage = 5;
        } else if (noOfMonths > 12) {
            percentage = 7;
        }

        double penalty = paymentAmount * percentage / 100.0;
        paymentAmount -= penalty;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "policyId='" + policyId + '\'' +
                ", monthlyPremium=" + monthlyPremium +
                ", noOfMonths=" + noOfMonths +
                ", paymentAmount=" + paymentAmount +
                '}';
    }
}
