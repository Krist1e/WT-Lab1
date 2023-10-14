package main.java.by.bsuir.alekseeva.Task13;

import main.java.by.bsuir.alekseeva.Task12.Book;

import java.util.Objects;

public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook() {
        super();
    }

    public ProgrammerBook(String title, String author, int price, String language, int level)
    {
        super(title, author, price);
        this.language = language;
        this.level = level;
    }


    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;

        if (!(obj instanceof ProgrammerBook book))
            return false;

        return super.equals(book) &&
                Objects.equals(book.language, language) &&
                level == book.level;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        int prime = 31;
        result = result * prime + Objects.hashCode(language);
        result = result * prime + level;
        return result;
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "language='" + language + "', " +
                "level=" + level;
    }
}
