package org.ykarim.libtopuscore.model.item;

import org.joda.time.DateTime;

import java.util.UUID;

public class Book extends Item {

    private int pageCount;

    public Book(String id, String name, String author, String publisher, String description,
                DateTime publicationYear, DateTime checkoutDate, DateTime dueDate, int pageCount) {
        super(id, name, author, publisher, description, publicationYear, checkoutDate, dueDate);

        this.pageCount = pageCount;
    }

    public Book(Book book) {
        super(book);
        this.pageCount = book.pageCount;
    }

    @Override
    String generateId(int countNumber) {
        return "BOOK - " + UUID.randomUUID() + countNumber;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
