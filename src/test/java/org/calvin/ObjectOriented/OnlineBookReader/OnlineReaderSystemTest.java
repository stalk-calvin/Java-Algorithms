package org.calvin.ObjectOriented.OnlineBookReader;

import org.junit.Before;
import org.junit.Test;

public class OnlineReaderSystemTest {
    private OnlineReaderSystem fixture;

    private UserManager um = new UserManager();
    private Library library = new Library();
    private Display display = new Display();

    @Before
    public void setUp() {
        fixture = new OnlineReaderSystem(um, library, display);
    }

    @Test
    public void shouldAddBookUserDisplay() {
        Book dsBook = new Book(1,"It contains Data Structures","Ds");
        Book algoBook = new Book(2,"It contains Algorithms","Algo");

        fixture.getLibrary().addBook(dsBook);
        fixture.getLibrary().addBook(algoBook);

        User user1 = new User(1," ","Ram");
        User user2 = new User(2," ","Gopal");

        fixture.getUserManager().addUser(user1);
        fixture.getUserManager().addUser(user2);

        fixture.setActiveBook(algoBook);
        fixture.setActiveUser(user1);

        fixture.getDisplay().turnPageForward();
        fixture.getDisplay().turnPageForward();
        fixture.getDisplay().turnPageBackward();
    }
}