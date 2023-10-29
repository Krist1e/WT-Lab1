package test.java.by.bsuir.alekseeva.Task15;

import main.java.by.bsuir.alekseeva.Task15.Book;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    @Test
    public void Should_CompareBooksUsingSort() {
        Book book1 = new Book("Book A", "Author A", 30);
        book1.setIsbn(123);
        Book book2 = new Book("Book B", "Author B", 25);
        book2.setIsbn(456);
        Book book3 = new Book("Book C", "Author C", 40);
        book3.setIsbn(789);

        Book[] books = {book2, book3, book1};
        Arrays.sort(books);

        assertSame(book1, books[0]);
        assertSame(book2, books[1]);
        assertSame(book3, books[2]);
    }

}