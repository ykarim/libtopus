package org.ykarim.libtopuscore.model.user;

import org.ykarim.libtopuscore.model.item.Item;

import java.util.ArrayList;
import java.util.UUID;

public class LibraryClient extends User {

    private ArrayList<Item> checkouts = new ArrayList<>(), reserves = new ArrayList<>();
    private String cardNumber;
    private double balance;

    @Override
    public String generateId() {
        return "USER - " + UUID.randomUUID();
    }

    public ArrayList<Item> getCheckouts() {
        return checkouts;
    }

    public void setCheckouts(ArrayList<Item> checkouts) {
        this.checkouts = checkouts;
    }

    public ArrayList<Item> getReserves() {
        return reserves;
    }

    public void setReserves(ArrayList<Item> reserves) {
        this.reserves = reserves;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
