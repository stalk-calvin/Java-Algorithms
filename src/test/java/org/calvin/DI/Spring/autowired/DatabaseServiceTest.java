package org.calvin.DI.Spring.autowired;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DatabaseServiceTest {
    private AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
    private DatabaseService fixture;

    @Before
    public void setUp() {
        ctx.register(AppConfig.class);
        ctx.refresh();
        fixture = ctx.getBean(DatabaseService.class);
    }

    @Test
    public void shouldLoadDBInfo() {
        assertEquals("Oracle", fixture.getDb().getDriver());
        assertEquals("jdbc:calvin", fixture.getDb().getUrl());
    }

}