package by.tsikunov.day6.model.service;

import by.tsikunov.day6.model.entity.Book;

import java.util.List;
import java.util.Optional;

public interface LibraryService {
    boolean addBook(Book book);

    boolean removeBook(Book book);

    Optional<Book> findById(long bookId);

    List<Book> findByTitle(String title);

    List<Book> findByAuthor(String author);

    List<Book> findByYearPublication(int yearPublication);

    List<Book> findByPages(int pages);

    List<Book> sortById();

    List<Book> sortByTitle();

    List<Book> sortByAuthor();

    List<Book> sortByPublicationYear();

    List<Book> sortByPages();
}
