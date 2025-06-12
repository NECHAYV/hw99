public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Лев", "Толстой");
        Author dostoevsky = new Author("Фёдор", "Достоевский");

        Book warAndPeace = new Book("Война и мир", tolstoy, 1869);
        Book crimeAndPunishment = new Book("Преступление и наказание", dostoevsky, 1866);

        System.out.println(warAndPeace.toString());
        System.out.println(crimeAndPunishment.toString());

        warAndPeace.setPublicationYear(1873);
        System.out.println("Updated year: " + warAndPeace.getPublicationYear());

        System.out.println("Are authors equal? " + tolstoy.equals(new Author("Лев", "Толстой")));
        System.out.println("Are books equal? " + warAndPeace.equals(new Book("Война и мир", tolstoy, 1869)));
    }
}