package by.tsikunov.day6.model.service.impl;

import by.tsikunov.day6.model.entity.Book;
import by.tsikunov.day6.model.service.LibraryService;

import java.util.List;
import java.util.Optional;

public class LibraryServiceImpl implements LibraryService {
    @Override
    public boolean addBook(Book book) {
        return false;
    }

    @Override
    public boolean removeBook(Book book) {
        return false;
    }

    @Override
    public Optional<Book> findById(long bookId) {
        return Optional.empty();
    }

    @Override
    public List<Book> findByTitle(String title) {
        return null;
    }

    @Override
    public List<Book> findByAuthor(String author) {
        return null;
    }

    @Override
    public List<Book> findByYearPublication(int yearPublication) {
        return null;
    }

    @Override
    public List<Book> findByPages(int pages) {
        return null;
    }

    @Override
    public List<Book> sortById() {
        return null;
    }

    @Override
    public List<Book> sortByTitle() {
        return null;
    }

    @Override
    public List<Book> sortByAuthor() {
        return null;
    }

    @Override
    public List<Book> sortByPublicationYear() {
        return null;
    }

    @Override
    public List<Book> sortByPages() {
        return null;
    }
}
