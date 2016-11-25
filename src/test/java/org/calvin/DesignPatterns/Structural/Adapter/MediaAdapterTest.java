/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MediaAdapterTest {
    MediaAdapter fixture;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void shouldPlayMp3() {
        String type = "mp3";
        fixture = new MediaAdapter(type);
        String actual = fixture.play("mp3file");
        assertTrue(actual.contains(type));
    }

    @Test
    public void shouldPlayMp4() {
        String type = "mp4";
        fixture = new MediaAdapter(type);
        String actual = fixture.play("mp4file");
        assertTrue(actual.contains(type));
    }

    @Test
    public void shouldNotPlayUnknown() {
        String type = "unknown";
        fixture = new MediaAdapter(type);
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("The validated object is null");
        fixture.play(type);
    }

    @Test
    public void shouldNotPlayOtherKnown() {
        String type = "vlc";
        fixture = new MediaAdapter(type);
        assertEquals("", fixture.play(type));
    }
}