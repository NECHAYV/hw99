import java.util.Objects;

class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(firstName, author.firstName) &&
                Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}

class Book {
    private String title;
    private Author author;
    private int publicationYear;

    public Book(String title, Author author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "'" + title + "' by " + author.toString() + ", published in " + publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear &&
                Objects.equals(title, book.title) &&
                Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("J.R.R.", "Tolkien");
        Author rowling = new Author("J.K.", "Rowling");

        Book lotr = new Book("The Lord of the Rings", tolkien, 1954);
        Book hp = new Book("Harry Potter and the Philosopher's Stone", rowling, 1997);
        Book hpCopy = new Book("Harry Potter and the Philosopher's Stone", rowling, 1997);

        System.out.println("Authors:");
        System.out.println(tolkien);
        System.out.println(rowling);

        System.out.println("\nBooks:");
        System.out.println(lotr);
        System.out.println(hp);

        System.out.println("\nTesting equality:");
        System.out.println("hp.equals(hpCopy): " + hp.equals(hpCopy));
        System.out.println("hp.equals(lotr): " + hp.equals(lotr));

        System.out.println("\nHash codes:");
        System.out.println("hp.hashCode(): " + hp.hashCode());
        System.out.println("hpCopy.hashCode(): " + hpCopy.hashCode());
        System.out.println("lotr.hashCode(): " + lotr.hashCode());
    }
}