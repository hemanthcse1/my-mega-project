package com.hemanth.junit5testing;

import com.hemanth.junit5testing.model.Book;
import com.hemanth.junit5testing.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertFalseDemo {

    /*
     * 1. assertFalse(boolean condition)
     * 2. assertFalse(boolean condition, String message)
     * 3. assertFalse(boolean condition, Supplier<String> messageSupplier)
     * 4. assertFalse(BooleanSupplier booleanSupplier)
     * 5. assertFalse(BooleanSupplier booleanSupplier, String message)
     * 6. assertFalse(BooleanSupplier booleanSupplier, Supplier<String> messageSupplier)
     * */


    @Test
    public void assertFalseWithNoMessage() {

        BookService bookService = new BookService();

        Book headFirstJava = new Book("1", "Head First Java", "wrox");

        // bookService.addBook(headFirstJava);

        List<Book> listOfBooks = new ArrayList<>();

        assertFalse(listOfBooks.isEmpty());
    }

    @Test
    public void assertFalseWIthMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        // bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        assertFalse(listOfBooks.isEmpty(), "List of Books is  empty!");
    }

    @Test
    public void assertFalseWIthMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        // bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // we are using lambda expression
        assertFalse(listOfBooks.isEmpty(), () -> "List of Books is  empty!");
    }

    @Test
    public void assertFalseWithBooleanSupplierAndNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java ", "Wrox");
        //  bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // using booleanSupplier functional interface
        assertFalse(() -> listOfBooks.isEmpty());
    }


    @Test
    public void assertFalseWIthBooleanSupplierWithMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        // bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // with boolean supplier functional interface with string message
        assertFalse(() -> listOfBooks.isEmpty(), "List of Books is  empty!");
    }


    @Test
    public void assertFalseWIthBooleanSupplierAndMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        // bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // we are using lambda expression, boolean supplier for first argument, second as supplier
        assertFalse(() -> listOfBooks.isEmpty(), () -> "List of Books is  empty!");
    }
}
