/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String.pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JSON {
    private static final String INPUT_TEST_JSON = "src/test/resources/pojo/test.json";

    private Menu fixture;
    private static final Gson gson;

    static {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @BeforeEach
    public void setUp() throws Exception {
        fixture = gson.fromJson(FileUtils.readFileToString(new File(INPUT_TEST_JSON)), Menu.class);
    }

    @Test
    public void shouldReadJson() throws Exception {
        assertEquals("SVG Viewer", fixture.getHeader());
        assertEquals("Open", fixture.getMenuItems().get(0).getId());
        assertEquals(null, fixture.getMenuItems().get(0).getLabel());
    }

    @Test
    public void shouldWriteJson() throws Exception {
        Menu tempMenu = new Menu();
        tempMenu.setHeader("SVG Viewer");
        List<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(MenuItem.builder().id("Open").build());
        menuItems.add(MenuItem.builder().id("OpenNew").label("Open New").build());
        tempMenu.setMenuItems(menuItems);
        String json = "{\"header\":\"SVG Viewer\",\"items\":[{\"id\":\"Open\"},{\"id\":\"OpenNew\",\"label\":\"Open "
                + "New\"}]}";
        assertEquals(new GsonBuilder().create().toJson(tempMenu), json);
    }
}
