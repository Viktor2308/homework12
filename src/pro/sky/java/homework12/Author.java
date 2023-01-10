package pro.sky.java.homework12;

import java.util.Objects;

public class Author {
    private String authorName;
    private String authorLastName;


    public Author(String authorName, String authorLastName) {
        this.authorLastName = authorLastName;
        this.authorName = authorName;
    }

    public String toString() {
        return "Author name: " + authorName + " " + authorLastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorName.equals(author.authorName) && authorLastName.equals(author.authorLastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorName, authorLastName);
    }

    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }

}
