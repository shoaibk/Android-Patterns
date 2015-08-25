package ca.shoaib.bookarrayadapter;

import java.util.ArrayList;

public class Book {
    private String mTitle;
    private String mAuthor;
    private double mPrice;

    public Book(String mTitle, String mAuthor, double mPrice) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPrice = mPrice;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public void setAuthor(String mAuthor) {
        this.mAuthor = mAuthor;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double mPrice) {
        this.mPrice = mPrice;
    }

    public static ArrayList<Book> getBooks() {
        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("Harry Potter and Sorcerer's Stone", "J. K. Rowlings", 12.99));
        books.add(new Book("Huckleberry Finn", "Mark Twain", 10.99));
        books.add(new Book("Eat Pray Love", "Mario Puzo", 21.50));
        books.add(new Book("Harry Potter and Chamber of Secrets", "J. K. Rowlings", 12.99));
        books.add(new Book("Tom Sawyer", "Mark Twain", 10.99));
        books.add(new Book("The Life of Pi", "Arundhuti Roy", 29.50));
        books.add(new Book("Harry Potter and Goblet of Fire", "J. K. Rowlings", 12.99));
        books.add(new Book("Sherlock Holmed", "Sir Arthur Conan Doyle", 10.99));
        books.add(new Book("The Call of The Wild", "Jack London", 11.90));
        return books;
    }
}
