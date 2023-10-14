package main.java.by.bsuir.alekseeva.Task16;

import main.java.by.bsuir.alekseeva.Task15.Book;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
