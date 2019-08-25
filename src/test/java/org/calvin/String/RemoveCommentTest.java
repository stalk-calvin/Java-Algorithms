/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveCommentTest {
    private RemoveComment fixture;

    @Before
    public void setUp() {
        fixture = new RemoveComment();
    }

    @Test
    public void shouldReturnEmptyStringIfInputIsEmpty() {
        String result = fixture.remove("");
        assertEquals("", result);
    }

    @Test
    public void shouldReturnFileContentWithoutComments() {
        String[] input = {"Hello world ", "this is the content /* of a fake file */", "of a real file"};
        String result = fixture.remove(input);
        assertEquals("Hello world this is the content of a real file", result);
    }

    @Test
    public void shouldReturnFileContentWithTwoSlash() {
        String[] input = {"Hello world ", "this is //the content /* of a fake file */", "of a real file"};
        String result = fixture.remove(input);
        assertEquals("Hello world this is ", result);
    }

    @Test
    public void shouldHandleSlashesInComment() {
        String[] input = {"Hello world ", "this is the content /*/ of a/ fak/e fi/le */", "of a real file"};
        String result = fixture.remove(input);
        assertEquals("Hello world this is the content of a real file", result);
    }

    @Test
    public void shouldRemoveEmptyContentComments() {
        String[] input = {"Hello /**world ", "this is the content */", "of a real file"};
        String result = fixture.remove(input);
        assertEquals("Hello of a real file", result);
    }
}
