/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String.pojo;

import static org.junit.Assert.assertEquals;

import java.io.File;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.apache.commons.io.FileUtils;
import org.calvin.String.pojo.json.Menu;
import org.junit.Before;
import org.junit.Test;

public class JSON {
    private static final String INPUT_TEST_JSON = "src/test/resources/pojo/test.json";

    private Menu fixture;
    private static final Gson gson;

    static {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    @Before
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
        String json = gson.toJson(fixture);
        assertEquals(FileUtils.readFileToString(new File(INPUT_TEST_JSON)), json);
    }
}
