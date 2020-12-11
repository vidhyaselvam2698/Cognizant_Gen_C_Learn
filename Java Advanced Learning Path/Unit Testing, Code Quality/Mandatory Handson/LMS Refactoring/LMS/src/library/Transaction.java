package library;

import java.util.Date;
import java.util.StringJoiner;

public class Transaction {
    private static final int PENALTY_PER_DAY = 10;
    private static int noOfBooks = 0;
    private Member member;
    private Book book;
    private int transactionId;
    private String transactionType;
    private Date transactionDate;
    private Date bookToBeReturnDate;
    private double penalty;
    private Date bookReturnDate;

    public Transaction(
            Member member,
            Book book,
            int transactionId,
            String transactionType,
            Date transactionDate,
            Date bookToBeReturnDate,
            double penalty,
            Date bookReturnDate
    ) {
        this.member = member;
        this.book = book;
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionDate = transactionDate;
        this.bookToBeReturnDate = bookToBeReturnDate;
        this.penalty = penalty;
        this.bookReturnDate = bookReturnDate;
    }

    public static int getPenaltyPerDay() {
        return PENALTY_PER_DAY;
    }

    public static int getNoOfBooks() {
        return noOfBooks;
    }

    public static void setNoOfBooks(int noOfBooks) {
        Transaction.noOfBooks = noOfBooks;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Date getBookToBeReturnDate() {
        return bookToBeReturnDate;
    }

    public void setBookToBeReturnDate(Date bookToBeReturnDate) {
        this.bookToBeReturnDate = bookToBeReturnDate;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");

        stringJoiner.add("Transaction Id:" + transactionId);
        stringJoiner.add("Member Id:" + member.getMemberId());
        stringJoiner.add("Book Id:" + book.getBookId());
        stringJoiner.add("Transaction Date:" + transactionDate);
        stringJoiner.add("Transaction Type:" + transactionType);
        stringJoiner.add("No Of Books:" + noOfBooks);
        stringJoiner.add("Book Return Date:" + bookReturnDate);

        return stringJoiner.toString();
    }
}
