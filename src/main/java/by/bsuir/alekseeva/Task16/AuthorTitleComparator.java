package main.java.by.bsuir.alekseeva.Task16;

import main.java.by.bsuir.alekseeva.Task15.Book;

import java.util.Comparator;

public class AuthorTitleComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = new AuthorComparator().compare(o1, o2);
        if (result == 0) {
            result = new TitleComparator().compare(o1, o2);
        }
        return result;
    }
}
