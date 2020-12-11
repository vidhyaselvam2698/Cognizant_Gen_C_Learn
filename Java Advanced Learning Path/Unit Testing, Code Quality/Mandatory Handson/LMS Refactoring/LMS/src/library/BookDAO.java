package library;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
    private final List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook(Book book) {
        bookList.remove(book);
    }

    public void viewBooks() {
        bookList.forEach(System.out::println);
    }
}
