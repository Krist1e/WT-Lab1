package test.java.by.bsuir.alekseeva.Task12;

import main.java.by.bsuir.alekseeva.Task12.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void Should_OverrideEqualsMethod() {
        Book book1 = new Book("My Diary", "Author X", 25);
        Book book2 = new Book("My Diary", "Author X", 25);
        Book book3 = new Book("Cruel Prince", "Author X", 30);

        assertEquals(book1, book2);
        assertNotEquals(book1, book3);
    }

    @Test
    public void Should_OverrideHashCodeMethod() {
        Book book1 = new Book("Cruel Prince", "Author X", 15);
        Book book2 = new Book("Cruel Prince", "Author X", 15);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void Should_OverrideToStringMethod() {
        Book book = new Book("My Diary", "Author X", 40);
        String expectedString = "Book @title='My Diary', author='Author X', price=40";

        assertEquals(expectedString, book.toString());
    }
}