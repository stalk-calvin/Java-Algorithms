/*
 * Copyright Calvin Lee Since 2017.
 * All Rights Reserved.
 */

package org.calvin.LoadingProperties.Spring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Properties;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConfigTest {
    private static final String CONFIG_FILE = "config/spring.properties";
    private Config fixture;

    @BeforeEach public void setUp() throws Exception {
        fixture = Config.builder().configFilename(CONFIG_FILE).build();
    }

    @Test public void shouldReadPropertiesFile() throws Exception {
        Properties p = fixture.readPropertiesFile();
        assertEquals("calvin", p.getProperty("database.username"));
        assertEquals("jdbc:mysql://localhost:3306/calvin", p.getProperty("database.url"));
        assertEquals("com.mysql.jdbc.Driver", p.getProperty("database.driver"));
    }
}
