package pro.sky.java.homework12;

public class Main {

    public static void main(String[] args) {
        Author palahniuk = new Author("Chuck", "Palahniuk");
        Author gogol = new Author("Nikolay", "Gogol");
        Book fightClub = new Book(palahniuk, "Fight Club", 1996);
        Book survivor = new Book(palahniuk, "Survivor", 1999);
        Book deadSouls = new Book(gogol, "Dead Souls", 1042);

        fullInfoAboutBook(fightClub);
        fullInfoAboutBook(survivor);
        fullInfoAboutBook(deadSouls);

        deadSouls.setPublishingYear(1842); //correct publishing year
        System.out.println();
        fullInfoAboutBook(deadSouls);


    }

    public static void fullInfoAboutBook(Book bookName) {
        System.out.println("Book name: " + bookName.getBookName()
                + " , author name : " + bookName.getAuthorName().getAuthorFullName()
                + " , publishing year: " + bookName.getPublishingYear());
    }
}
