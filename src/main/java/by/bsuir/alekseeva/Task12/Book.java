package main.java.by.bsuir.alekseeva.Task12;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void setEdition(int edition) {
        Book.edition = edition;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getEdition() {
        return edition;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof Book book))
            return false;

        return Objects.equals(book.author, author) &&
                Objects.equals(book.title, title) &&
                price == book.price;
    }

    @Override
    public int hashCode() {
        int result = 1;
        int prime = 31;
        result = result * prime + Objects.hashCode(title);
        result = result * prime + Objects.hashCode(author);
        result = result * prime + price;
        result = result * prime + edition;
        return result;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " @title='" + title + "', " +
                "author='" + author + "', " +
                "price=" + price;
    }
}
