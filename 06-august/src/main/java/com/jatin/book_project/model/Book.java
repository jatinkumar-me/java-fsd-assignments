package com.jatin.book_project.model;

import java.util.List;

/**
 * Book
 */
public class Book {

    private int bookId;
    private String title;
    private String genre;
    private String language;
    private List<Author> authors;

    public Book() {
    }

    /**
     * @param authors
     * @param language
     * @param genre
     * @param title
     * @param bookId
     */
    public Book(List<Author> authors, String language, String genre, String title, int bookId) {
        this.authors = authors;
        this.language = language;
        this.genre = genre;
        this.title = title;
        this.bookId = bookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book [bookId=" + bookId + ", title=" + title + ", genre=" + genre + ", language=" + language
                + ", authors=" + authors + "]";
    }
}
