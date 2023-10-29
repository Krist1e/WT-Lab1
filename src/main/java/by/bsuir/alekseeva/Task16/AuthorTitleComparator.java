package main.java.by.bsuir.alekseeva.Task16;

import main.java.by.bsuir.alekseeva.Task15.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    private final AuthorComparator authorComparator = new AuthorComparator();
    private final TitleComparator titleComparator = new TitleComparator();
    @Override
    public int compare(Book o1, Book o2) {
        int result = authorComparator.compare(o1, o2);
        if (result == 0) {
            result = titleComparator.compare(o1, o2);
        }
        return result;
    }
}
