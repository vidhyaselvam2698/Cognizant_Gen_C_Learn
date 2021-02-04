import java.util.Scanner;

public class AccountDetails {
    public Account getAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account id:");
        int accountId = scanner.nextInt();
        System.out.println("Enter account type:");
        String accountType = scanner.next();

        boolean validBalance = false;
        int balance = 0;

        while(!validBalance) {
            System.out.println("Enter balance:");
            balance = scanner.nextInt();

            if (balance <= 0) {
                System.out.println("Balance should be positive");
            } else {
                validBalance = true;
            }
        }

        Account account = new Account();
        account.setAccountId(accountId);
        account.setAccountType(accountType);
        account.setBalance(balance);

        scanner.close();

        return account;
    }

    public int getWithdrawAmount() {
        Scanner scanner = new Scanner(System.in);

        boolean validAmount = false;
        int amount = 0;

        while(!validAmount) {
            System.out.println("Enter amount to be withdrawn:");
            amount = scanner.nextInt();

            if (amount <= 0) {
                System.out.println("Balance should be positive");
            } else {
                validAmount = true;
            }
        }
        
        scanner.close();

        return amount;
    }


    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails();
        Account account = accountDetails.getAccountDetails();
        int amount = accountDetails.getWithdrawAmount();
        boolean withdrawStatus = account.withdraw(amount);
    }
}
