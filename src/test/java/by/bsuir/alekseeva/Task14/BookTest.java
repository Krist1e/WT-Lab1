package test.java.by.bsuir.alekseeva.Task14;

import main.java.by.bsuir.alekseeva.Task14.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void Should_CloneBook() throws CloneNotSupportedException {
        Book originalBook = new Book("Chasing that feeling", "Author X", 50);
        Book clonedBook = (Book) originalBook.clone();

        assertNotSame(originalBook, clonedBook);
        assertEquals(originalBook, clonedBook);
        assertEquals(originalBook.getTitle(), clonedBook.getTitle());
        assertEquals(originalBook.getAuthor(), clonedBook.getAuthor());
        assertEquals(originalBook.getPrice(), clonedBook.getPrice());
    }

    @Test
    public void Should_OverrideEqualsMethod() {
        main.java.by.bsuir.alekseeva.Task12.Book book1 = new main.java.by.bsuir.alekseeva.Task12.Book("My Diary", "Author X", 25);
        main.java.by.bsuir.alekseeva.Task12.Book book2 = new main.java.by.bsuir.alekseeva.Task12.Book("My Diary", "Author X", 25);
        main.java.by.bsuir.alekseeva.Task12.Book book3 = new main.java.by.bsuir.alekseeva.Task12.Book("Cruel Prince", "Author X", 30);

        assertEquals(book1, book2);
        assertNotEquals(book1, book3);
    }

    @Test
    public void Should_OverrideHashCodeMethod() {
        main.java.by.bsuir.alekseeva.Task12.Book book1 = new main.java.by.bsuir.alekseeva.Task12.Book("Cruel Prince", "Author X", 15);
        main.java.by.bsuir.alekseeva.Task12.Book book2 = new main.java.by.bsuir.alekseeva.Task12.Book("Cruel Prince", "Author X", 15);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void Should_OverrideToStringMethod() {
        main.java.by.bsuir.alekseeva.Task12.Book book = new main.java.by.bsuir.alekseeva.Task12.Book("My Diary", "Author X", 40);
        String expectedString = "Book @title='My Diary', author='Author X', price=40";

        assertEquals(expectedString, book.toString());
    }
}