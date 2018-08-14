package org.ykarim.libtopuscore.dao;

import org.ykarim.libtopuscore.model.user.LibraryClient;
import org.ykarim.libtopuscore.model.user.User;

import java.util.List;

public interface UserDAO {

    void createUser(User user);

    User getUser(String username);

    void deleteUser(User user);

    void updateUser(User user);

    List<User> getUsersByFirstName(String firstName);

    void checkoutItem(LibraryClient client);

    void returnItem(LibraryClient client);
}
