import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Book alteredCarbon;


    @Before
    public void before(){
      borrower = new Borrower();
        alteredCarbon = new Book("Altered Carbon", "Richard Morgan", "sci-fi");
    }

    @Test
    public void collectionStartsEmpty(){
        assertEquals(0, borrower.collectionCount());
    }

    @Test
    public void canAddABookToCollection(){
        borrower.addToCollection(alteredCarbon);
        assertEquals(1, borrower.collectionCount());
    }

}
