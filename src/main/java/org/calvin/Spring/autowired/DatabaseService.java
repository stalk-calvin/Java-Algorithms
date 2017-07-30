package org.calvin.Spring.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class DatabaseService {
    @Autowired
    private Database db;

    public DatabaseService(Database db) {
        this.db = db;
    }

    public Database getDb() {
        return db;
    }
}
