import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public ArrayList<Book> getBookList() {
        return bookList;
    }

    public void setBookList(ArrayList<Book> bookList) {
        this.bookList = bookList;
    }

    public void addBook(Book book) {
        bookList.add(book);
    }

    public boolean isEmpty() {
        return bookList.isEmpty();
    }

    public ArrayList<Book> viewAllBooks() {
        return bookList;
    }

    public ArrayList<Book> viewBooksByAuthor(String author) {
        return bookList.stream()
                        .filter(book -> book.getAuthor().contains(author))
                        .collect(Collectors.toList());
    }

    public int countnoofbook(String bname) {
        return (int) bookList.stream().filter(book -> book.getBookName().contains(bname)).count();
    }
}
