package library;

import java.util.ArrayList;
import java.util.List;

public class TransactionDAO {
    private final List<Transaction> transactionList = new ArrayList<>();

    public void addTransaction(Transaction transaction) {
        transactionList.add(transaction);
    }

    public void removeTransaction(Transaction transaction) {
        transactionList.remove(transaction);
    }

    public void viewTransaction() {
        if (transactionList.isEmpty()) {
            System.out.println("Transaction List is empty");
        } else {
            transactionList.forEach(System.out::println);
        }
    }
}
