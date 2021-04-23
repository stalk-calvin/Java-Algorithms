package org.calvin.String;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreateNewIDTest {

    @Test
    public void shouldCreateNewIDOnEmpty() {
        assertEquals("aaa", CreateNewID.createNewID("=.="));
    }

    @Test
    public void shouldCreateNewIDOnComplicated() {
        assertEquals("bat.y.abcdefghi", CreateNewID.createNewID("..!@BaT#*..y.abcdefghijklm"));
    }

    @Test
    public void shouldCreateNewIDOnLessThanThree() {
        assertEquals("z--", CreateNewID.createNewID("z-+.^."));
    }

    @Test
    public void shouldCreateNewIDOnAllowed() {
        assertEquals("123_.def", CreateNewID.createNewID("123_.def"));
    }

    @Test
    public void shouldCreateNewIDOnOverAndPeriod() {
        assertEquals("abcdefghijklmn", CreateNewID.createNewID("abcdefghijklmn.p"));
    }
}