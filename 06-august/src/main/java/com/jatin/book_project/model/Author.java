package com.jatin.book_project.model;

/**
 * Author
 */
public class Author {

    private int authorId;
    private String authorName;
    private Address authorAddress;

    public Author() {
    }

    /**
     * @param authorAddress
     * @param authorName
     * @param authorId
     */
    public Author(Address authorAddress, String authorName, int authorId) {
        this.authorAddress = authorAddress;
        this.authorName = authorName;
        this.authorId = authorId;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Address getAuthorAddress() {
        return authorAddress;
    }

    public void setAuthorAddress(Address authorAddress) {
        this.authorAddress = authorAddress;
    }

    @Override
    public String toString() {
        return "Author [authorId=" + authorId + ", authorName=" + authorName + ", authorAddress=" + authorAddress + "]";
    }
}
