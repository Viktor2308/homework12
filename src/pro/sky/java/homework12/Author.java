package pro.sky.java.homework12;

public class Author {
    private String authorName;
    private String authorLastName;


    public Author(String authorName, String authorLastName) {
        this.authorLastName = authorLastName;
        this.authorName = authorName;
    }

    public String getAuthorFullName() {
        return authorName + " " + authorLastName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getAuthorLastName() {
        return authorLastName;
    }

}
