package test.java.by.bsuir.alekseeva.Task16;

import main.java.by.bsuir.alekseeva.Task15.Book;
import main.java.by.bsuir.alekseeva.Task16.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BookComparatorTests {

    private static final Book book1 = new Book("Book A", "Author B", 30);
    private static final Book book2 = new Book("Book B", "Author C", 25);
    private static final Book book3 = new Book("Book A", "Author A", 40);
    private static final Book book4 = new Book("Book C", "Author A", 35);

    private static Stream<Arguments> provideComparators() {
        return Stream.of(
                arguments(new AuthorComparator(), book3, book4, book1, book2),
                arguments(new TitleComparator(), book1, book3, book2, book4),
                arguments(new PriceComparator(), book2, book1, book4, book3),
                arguments(new TitleAuthorComparator(), book3, book1, book2, book4),
                arguments(new AuthorTitleComparator(), book3, book4, book1, book2),
                arguments(new AuthorTitlePriceComparator(), book3, book4, book1, book2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideComparators")
    public void Should_CompareBooksUsingComparator(
            Comparator<Book> comparator, Book first, Book second, Book third, Book fourth) {
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        books.sort(comparator);

        assertEquals(first, books.get(0));
        assertEquals(second, books.get(1));
        assertEquals(third, books.get(2));
        assertEquals(fourth, books.get(3));
    }
}