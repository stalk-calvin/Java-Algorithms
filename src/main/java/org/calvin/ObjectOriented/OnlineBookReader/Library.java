package org.calvin.ObjectOriented.OnlineBookReader;

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<Integer, Book> books;

    public Library(){
        books = new HashMap<>();
    }

    public Boolean addBook(int id, String details, String title) {
        if (books.containsKey(id)) {
            return false;
        }
        Book book = new Book(id, details,title);
        books.put(id, book);
        return true;
    }

    public Boolean addBook(Book book) {
        if (books.containsKey(book.getId())) {
            return false;
        }

        books.put(book.getId(), book);
        return true;
    }


    public boolean remove(Book b) {
        return remove(b.getId());
    }

    public boolean remove(int id) {
        if (!books.containsKey(id)) {
            return false;
        }
        books.remove(id);
        return true;
    }

    public Book find(int id) {
        return books.get(id);
    }
}
