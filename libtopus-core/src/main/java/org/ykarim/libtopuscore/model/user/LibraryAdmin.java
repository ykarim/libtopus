package org.ykarim.libtopuscore.model.user;

import java.util.UUID;

public class LibraryAdmin extends User {

    @Override
    public String generateId() {
        return "ADMIN - " + UUID.randomUUID();
    }
}
