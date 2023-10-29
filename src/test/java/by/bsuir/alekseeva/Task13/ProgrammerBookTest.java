package test.java.by.bsuir.alekseeva.Task13;

import main.java.by.bsuir.alekseeva.Task13.ProgrammerBook;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProgrammerBookTest {
    @Test
    public void Should_OverrideEqualsMethod() {
        ProgrammerBook book1 = new ProgrammerBook("Coding in Java", "Author X", 35, "Java", 2);
        ProgrammerBook book2 = new ProgrammerBook("Coding in Java", "Author X", 35, "Java", 2);
        ProgrammerBook book3 = new ProgrammerBook("Coding in Python", "Author Y", 40, "Python", 3);

        assertEquals(book1, book2);
        assertNotEquals(book1, book3);
    }
    @Test
    public void Should_OverrideHashCodeMethod() {
        ProgrammerBook book1 = new ProgrammerBook("Coding in Java", "Author X", 35, "Java", 2);
        ProgrammerBook book2 = new ProgrammerBook("Coding in Java", "Author X", 35, "Java", 2);

        assertEquals(book1.hashCode(), book2.hashCode());
    }

    @Test
    public void Should_OverrideToStringMethod() {
        ProgrammerBook book = new ProgrammerBook("Coding in Java", "Author X", 35, "Java", 2);
        String expectedString = "ProgrammerBook @title='Coding in Java', author='Author X', price=35, language='Java', level=2";

        assertEquals(expectedString, book.toString());
    }

}