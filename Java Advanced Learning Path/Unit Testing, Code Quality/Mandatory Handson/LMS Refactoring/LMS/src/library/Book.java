package library;

import java.util.StringJoiner;

public class Book {
    private String bookId;
    private String bookTitle;
    private String authorName;
    private String publisherName;

    public Book(String bookId, String bookTitle, String authorName, String publisherName) {
        this.bookId = bookId;
        this.bookTitle = bookTitle;
        this.authorName = authorName;
        this.publisherName = publisherName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        StringJoiner stringJoiner = new StringJoiner("\n");

        stringJoiner.add("Book ID:" + bookId);
        stringJoiner.add("Book Title:" + bookTitle);
        stringJoiner.add("Author Name:" + authorName);
        stringJoiner.add("Publisher Name:" + publisherName);

        return stringJoiner.toString();
    }
}
