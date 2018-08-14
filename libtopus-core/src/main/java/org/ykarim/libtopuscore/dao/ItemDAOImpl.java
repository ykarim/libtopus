package org.ykarim.libtopuscore.dao;

import org.joda.time.DateTime;
import org.ykarim.libtopuscore.model.item.Book;
import org.ykarim.libtopuscore.model.item.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ItemDAOImpl implements ItemDAO {

    private static List<Item> itemsList = new ArrayList<>();

    public static List<Item> getItemsList() {
        return itemsList;
    }

    @Override
    public void createItem(Item item) {
        itemsList.add(item);
    }

    @Override
    public Item getItem(String id) {
        return itemsList.stream().filter(item -> item.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void deleteItem(Item item) {
        itemsList.remove(item);
    }

    @Override
    public void updateItem(Item item) {
        Item searchedItem = getItem(item.getId());

        if (searchedItem != null) {
            searchedItem.setName(item.getName());
            searchedItem.setAuthor(item.getAuthor());
            searchedItem.setPublisher(item.getPublisher());
            searchedItem.setDescription(item.getDescription());
            searchedItem.setPublicationYear(new DateTime(item.getPublicationYear()));
            searchedItem.setCheckoutDate(new DateTime(item.getCheckoutDate()));
            searchedItem.setDueDate(new DateTime(item.getDueDate()));

            if (item instanceof Book) {
                Book currentBook = (Book) item;
                Book searchedBook = (Book) searchedItem;
                searchedBook.setPageCount(currentBook.getPageCount());
            }
        }
    }

    @Override
    public List<Item> getItemsByName(String name) {
        return itemsList.stream().filter(item -> item.getName().equals(name)).collect(Collectors.toList());
    }

    @Override
    public List<Item> getItemsByAuthor(String author) {
        return itemsList.stream().filter(item -> item.getAuthor().equals(author)).collect(Collectors.toList());
    }

    @Override
    public List<Item> getItemsByPublisher(String publisher) {
        return itemsList.stream().filter(item -> item.getPublisher().equals(publisher)).collect(Collectors.toList());
    }

    @Override
    public void checkoutItem(Item item) {

    }

    @Override
    public void returnItem(Item item) {

    }
}
