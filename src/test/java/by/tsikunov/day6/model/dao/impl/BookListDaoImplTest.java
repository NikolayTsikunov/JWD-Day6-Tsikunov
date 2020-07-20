package by.tsikunov.day6.model.dao.impl;

import by.tsikunov.day6.model.entity.Book;
import by.tsikunov.day6.model.entity.Library;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.testng.Assert.*;

public class BookListDaoImplTest {

    @Test
    public void testAddPositive() {
        Library library = Library.getInstance();
        Book book = new Book("Three comrades", new ArrayList<>(Arrays.asList("E. M. Remarque")),
                1936, 496);
        boolean actual = library.addBook(book);
        assertTrue(actual);
    }

    @Test
    public void testAddNegative() {
        Library library = Library.getInstance();
        Book book = new Book("Three comrades", new ArrayList<>(Arrays.asList("E. M. Remarque")),
                1936, 496);
        boolean actual = library.addBook(book);
        actual = library.addBook(book);
        assertFalse(actual);
    }

    @Test
    public void testRemovePositive() {
    }

    @Test
    public void testFindByIdNegative() {
    }

    @Test
    public void testFindAll() {
    }

    @Test
    public void testFindByTitle() {
    }

    @Test
    public void testFindByAuthor() {
    }

    @Test
    public void testFindByPublicationYear() {
    }

    @Test
    public void testFindByPages() {
    }

    @Test
    public void testSortById() {
    }

    @Test
    public void testSortByTitle() {
    }

    @Test
    public void testSortByAuthor() {
    }

    @Test
    public void testSortByPublicationYear() {
    }

    @Test
    public void testSortByPages() {
    }
}