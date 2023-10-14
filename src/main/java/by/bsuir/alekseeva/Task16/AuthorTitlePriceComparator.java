package main.java.by.bsuir.alekseeva.Task16;

import main.java.by.bsuir.alekseeva.Task15.Book;

import java.util.Comparator;

public class AuthorTitlePriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        int result = new AuthorTitleComparator().compare(o1, o2);
        if (result == 0) {
            result = new PriceComparator().compare(o1, o2);
        }
        return result;
    }
}
