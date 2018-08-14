package org.ykarim.libtopuscore.model.item;

import org.joda.time.DateTime;

public abstract class Item implements Borrowable {

    private String id, name, author, publisher, description;
    private DateTime publicationYear;
    private DateTime checkoutDate, dueDate;

    Item(String id, String name, String author, String publisher, String description,
         DateTime publicationYear, DateTime checkoutDate, DateTime dueDate) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.description = description;
        this.publicationYear = publicationYear;
        this.checkoutDate = checkoutDate;
        this.dueDate = dueDate;
    }

    Item(Item item) {
        this(item.getId(), item.getName(), item.getAuthor(), item.getPublisher(), item.getDescription(),
                null, null, null);
        this.publicationYear = new DateTime(publicationYear);
        this.checkoutDate = new DateTime(checkoutDate);
        this.dueDate = new DateTime(dueDate);
    }

    abstract String generateId(int countNumber);

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateTime getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(DateTime publicationYear) {
        this.publicationYear = publicationYear;
    }

    public DateTime getCheckoutDate() {
        return checkoutDate;
    }

    @Override
    public void setCheckoutDate(DateTime checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public DateTime getDueDate() {
        return dueDate;
    }

    @Override
    public void setDueDate(DateTime dueDate) {
        this.dueDate = dueDate;
    }
}
