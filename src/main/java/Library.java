import java.util.ArrayList;

public class Library {

    private ArrayList<Book> libraryStock;
    private int capacity;

    public Library() {
        this.libraryStock = new ArrayList<Book>();
        this.capacity = 4;
    }

    public int stockCount() {
        return this.libraryStock.size();
    }

    public void addABook(Book book) {

        if (this.stockCount() < this.capacity) {
            this.libraryStock.add(book);
        }
    }


    public void issueBook(Borrower borrower, Book book) {
        libraryStock.remove(book);
        borrower.addToCollection(book);

    }
}
