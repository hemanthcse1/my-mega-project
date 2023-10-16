package com.hemanth.junit5testing;

import com.hemanth.junit5testing.model.Book;
import com.hemanth.junit5testing.service.BookService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AssertTrueDemo {

    @Test
    public void assertTrueWithNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java ", "Wrox");
        bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty());
    }

    @Test
    public void assertTrueWIthMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        assertTrue(listOfBooks.isEmpty(), "List of Books is not empty!");
    }

    @Test
    public void assertTrueWIthMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // we are using lambda expression
        assertTrue(listOfBooks.isEmpty(), () -> "List of Books is not empty!");
    }

    @Test
    public void assertTrueWithBooleanSupplierAndNoMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head First Java ", "Wrox");
        bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // using booleanSupplier functional interface
        assertTrue(() -> listOfBooks.isEmpty());
    }


    @Test
    public void assertTrueWIthBooleanSupplierWithMessage() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // with boolean supplier functional interface with string message
        assertTrue(() -> listOfBooks.isEmpty(), "List of Books is not empty!");
    }


    @Test
    public void assertTrueWIthBooleanSupplierAndMessageSupplier() {
        BookService bookService = new BookService();

        Book headFirstJavaBook = new Book("1", "Head first Java", "wrox");

        bookService.addBook(headFirstJavaBook);

        List<Book> listOfBooks = bookService.books();

        // we are using lambda expression, boolean supplier for first argument, second as supplier
        assertTrue(() -> listOfBooks.isEmpty(), () -> "List of Books is not empty!");
    }


}
