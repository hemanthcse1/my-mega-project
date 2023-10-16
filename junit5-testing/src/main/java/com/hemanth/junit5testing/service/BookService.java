package com.hemanth.junit5testing.service;

import com.hemanth.junit5testing.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class BookService {

    private List<Book> listOfBooks = new ArrayList<>();

    public void addBook(Book book) {
        listOfBooks.add(book);
    }

    public List<Book> books() {
        return Collections.unmodifiableList(listOfBooks);
    }

  /*  public Book getBookById(String id){
        return listOfBooks.stream()
                .filter(book -> book.getBookId().equals(id))
                .findAny().get();
    }*/

    public Book getBookById(String id) {
        for (Book book : listOfBooks) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        return null;
    }
}
