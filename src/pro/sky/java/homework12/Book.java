package pro.sky.java.homework12;

import java.util.Objects;

public class Book {
    private Author authorName;
    private String bookName;
    private int publishingYear;

    public Book(Author authorName, String bookName, int publishingYear) {
        this.authorName = authorName;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String toString(){
        return authorName + ", book name: " + bookName + ", publishing year: " + publishingYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && authorName.equals(book.authorName) && bookName.equals(book.bookName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, bookName, publishingYear);
    }
}