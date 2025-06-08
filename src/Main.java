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


    public String getFullName() {
        return firstName + " " + lastName;
    }
}


class Book {
    private String title;      // Название книги
    private Author author;    // Автор книги
    private int publicationYear;  // Год публикации


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


    public String getBookInfo() {
        return "'" + title + "' by " + author.getFullName() + ", published in " + publicationYear;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создаем авторов
        Author tolkien = new Author("J.R.R.", "Tolkien");
        Author rowling = new Author("J.K.", "Rowling");

        Book lotr = new Book("The Lord of the Rings", tolkien, 1954);
        Book hp = new Book("Harry Potter and the Philosopher's Stone", rowling, 1997);

        System.out.println(lotr.getBookInfo());
        System.out.println(hp.getBookInfo());

        hp.setPublicationYear(1998);
        System.out.println("\nAfter changing publication year:");
        System.out.println(hp.getBookInfo());
    }
}