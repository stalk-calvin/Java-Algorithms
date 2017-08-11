package org.calvin.DI.Spring.autowired;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DatabaseService getDbService() {
        return new DatabaseService(getDb());
    }

    @Bean
    public Database getDb() {
        Database db = new Database();
        db.setDriver("Oracle");
        db.setUrl("jdbc:calvin");
        return db;
    }
}