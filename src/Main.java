public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Фёдор", "Достоевский");
        Book book1 = new Book("Война и мир", author1, 1869);
        Book book2 = new Book("Преступление и наказание", author2, 1866);
        System.out.println("Книга 1: " + book1.getTitle() + ", Автор: " + book1.getAuthor().getFirstName() + " " + book1.getAuthor().getLastName() + ", Год: " + book1.getPublicationYear());
        System.out.println("Книга 2: " + book2.getTitle() + ", Автор: " + book2.getAuthor().getFirstName() + " " + book2.getAuthor().getLastName() + ", Год: " + book2.getPublicationYear());
        book1.setPublicationYear(1873);
        System.out.println("Обновлённый год книги 1: " + book1.getPublicationYear());
    }
}