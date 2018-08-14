package org.ykarim.libtopuscore.dao;

import org.ykarim.libtopuscore.model.item.Item;

import java.util.List;

public interface ItemDAO {

    void createItem(Item item);

    Item getItem(String id);

    void deleteItem(Item item);

    void updateItem(Item item);

    List<Item> getItemsByName(String name);

    List<Item> getItemsByAuthor(String author);

    List<Item> getItemsByPublisher(String publisher);

    void checkoutItem(Item item);

    void returnItem(Item item);
}
