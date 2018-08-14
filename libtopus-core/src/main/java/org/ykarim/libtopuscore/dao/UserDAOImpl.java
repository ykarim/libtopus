package org.ykarim.libtopuscore.dao;

import org.ykarim.libtopuscore.model.user.LibraryClient;
import org.ykarim.libtopuscore.model.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserDAOImpl implements UserDAO {

    private static List<User> usersList = new ArrayList<>();

    public static List<User> getUsersList() {
        return usersList;
    }

    @Override
    public void createUser(User user) {
        if (getUser(user.getUsername()) == null) {
            usersList.add(user);
        }
    }

    @Override
    public User getUser(String username) {
        return usersList.stream().filter(user -> user.getUsername().equals(username)).findFirst().orElse(null);
    }

    @Override
    public void deleteUser(User user) {
        if (getUser(user.getUsername()) != null) {
            usersList.remove(getUser(user.getUsername()));
        }
    }

    @Override
    public void updateUser(User user) {
        User currentUser = getUser(user.getUsername());

        if (currentUser != null) {
            currentUser.setFirstName(user.getFirstName());
            currentUser.setLastName(user.getLastName());
            currentUser.setUsername(user.getUsername());
            currentUser.setPassword(user.getPassword());

            if (user instanceof LibraryClient) {
                LibraryClient currentClient = (LibraryClient) user;
                LibraryClient searchedClient = (LibraryClient) currentUser;

                searchedClient.setBalance(currentClient.getBalance());
                searchedClient.setCardNumber(currentClient.getCardNumber());
                searchedClient.setCheckouts(currentClient.getCheckouts());
                searchedClient.setReserves(currentClient.getReserves());
            }
        }
    }

    @Override
    public List<User> getUsersByFirstName(String firstName) {
        return usersList.stream().filter(user -> user.getFirstName().equals(firstName)).collect(Collectors.toList());
    }

    @Override
    public void checkoutItem(LibraryClient client) {

    }

    @Override
    public void returnItem(LibraryClient client) {

    }
}
