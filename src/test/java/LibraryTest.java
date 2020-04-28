import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book alteredCarbon;
    Book tooBigToFail;
    Borrower borrower;

    @Before
    public void before(){
        library = new Library();
        alteredCarbon = new Book("Altered Carbon", "Richard Morgan", "sci-fi");
        tooBigToFail = new Book("Too Big To Fail", "Andrew Ross Sorkin", "Finance");
        borrower = new Borrower();
    }

    @Test
    public void stockStartsEmpty() {
        assertEquals(0, library.stockCount());
    }
    @Test
    public void canAddABook(){
        library.addABook(alteredCarbon);
        assertEquals(1, library.stockCount());
    }
   @Test
    public void canIssueABook(){
        library.addABook(alteredCarbon);
        library.issueBook(borrower, alteredCarbon);
        assertEquals(0, library.stockCount());
        assertEquals(1, borrower.collectionCount());
   }

}
