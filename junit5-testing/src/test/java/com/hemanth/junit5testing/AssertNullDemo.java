package com.hemanth.junit5testing;

import com.hemanth.junit5testing.model.Book;
import com.hemanth.junit5testing.service.BookService;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNull;

public class AssertNullDemo {


    /*
     * 1. assertNull(Object actual)
     * 2. assertNull(Object actual, String message)
     * 3. assertNull(Object actual, Supplier<String> messageSupplier)
     * */

    @Test
    public void assertNullWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJava = new Book("1", "Head First Java", "wrox");
        Book springBootBook = new Book("2", "spring boot", "wrox");

        bookService.addBook(headFirstJava);
        bookService.addBook(springBootBook);

        Book bookById = bookService.getBookById("3");

        assertNull(bookById);

    }

    @Test
    public void assertNullWithMessage() {
        BookService bookService = new BookService();

        Book headFirstJava = new Book("1", "Head First Java", "wrox");
        Book springBootBook = new Book("2", "spring boot", "wrox");

        bookService.addBook(headFirstJava);
        bookService.addBook(springBootBook);

        Book bookById = bookService.getBookById("3");

        assertNull(bookById, "Book  found with id");

    }

    @Test
    public void assertNullWithSupplierMessage() {
        BookService bookService = new BookService();

        Book headFirstJava = new Book("1", "Head First Java", "wrox");
        Book springBootBook = new Book("2", "spring boot", "wrox");

        bookService.addBook(headFirstJava);
        bookService.addBook(springBootBook);

        Book bookById = bookService.getBookById("3");

        assertNull(bookById, () -> "Book found with id");

    }
}
