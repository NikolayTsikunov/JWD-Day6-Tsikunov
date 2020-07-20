package by.tsikunov.day6.model.service.response;

import by.tsikunov.day6.model.entity.Book;

import java.util.List;

public class Response {
    private String message;
    private List<Book> resultBooks;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Book> getResultBooks() {
        return resultBooks;
    }

    public void setResultBooks(List<Book> resultBooks) {
        this.resultBooks = resultBooks;
    }
}
