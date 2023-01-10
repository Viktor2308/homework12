package pro.sky.java.homework12;

public class Main {

    public static void main(String[] args) {
        Author palahniuk = new Author("Chuck", "Palahniuk");
        Author gogol = new Author("Nikolay", "Gogol");
        Author gogolCopy = new Author("Nikolay", "Gogol");
        Book fightClub = new Book(palahniuk, "Fight Club", 1996);
        Book survivor = new Book(palahniuk, "Survivor", 1999);
        Book deadSouls = new Book(gogol, "Dead Souls", 1842);
        Book deadSoulsCopy = new Book(gogol, "Dead Souls", 1842);

        System.out.println(palahniuk);
        System.out.println(fightClub);

        System.out.println("gogol.equals(palahniuk) = " + gogol.equals(palahniuk));
        System.out.println("gogolCopy.equals(gogol) = " + gogolCopy.equals(gogol));
        System.out.println("gogol.hashCode() = " + gogol.hashCode());
        System.out.println("gogolCopy.hashCode() = " + gogolCopy.hashCode());

        System.out.println("deadSouls.equals(fightClub) = " + deadSouls.equals(fightClub));
        System.out.println("deadSoulsCopy.equals(deadSouls) = " + deadSoulsCopy.equals(deadSouls));
        System.out.println("deadSouls.hashCode() = " + deadSouls.hashCode());
        System.out.println("deadSoulsCopy.hashCode() = " + deadSoulsCopy.hashCode());

    }
}
