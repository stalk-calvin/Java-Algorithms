/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.String;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class RemoveCommentTest {
    private RemoveComment fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        fixture = new RemoveComment();
    }

    @Test
    public void shouldNotAcceptNullComment() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You can't pass a null input as argument.");
        fixture.remove(null);
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
    public void shouldHandleSlashesInComment() {
        String[] input = {"Hello world ", "this is the content /*/ of a/ fak/e fi/le */", "of a real file"};
        String result = fixture.remove(input);
        assertEquals("Hello world this is the content of a real file", result);
    }

    @Test
    public void shouldRemoveEmptyContentComments() {
        String[] input = {"Hello /**world ", "this is the content /**/", "of a real file"};
        String result = fixture.remove(input);
        assertEquals("Hello of a real file", result);
    }
}
