package main.java.by.bsuir.alekseeva.Task16;

import main.java.by.bsuir.alekseeva.Task15.Book;

import java.util.Comparator;

public class TitleAuthorComparator implements Comparator<Book> {
    private final TitleComparator titleComparator = new TitleComparator();
    private final AuthorComparator authorComparator = new AuthorComparator();
    @Override
    public int compare(Book o1, Book o2) {
        int result = titleComparator.compare(o1, o2);
        if (result == 0) {
            result = authorComparator.compare(o1, o2);
        }
        return result;
    }
}
