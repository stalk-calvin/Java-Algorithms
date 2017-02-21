/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MediaAdapterTest {
    MediaAdapter fixture;

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
        assertEquals("Media Player", fixture.getType());
        assertEquals("mp4", fixture.mediaPlayer.getType());
        String actual = fixture.play("mp4file");
        assertTrue(actual.contains(type));
    }

    @Test
    public void shouldPlayVlc() {
        String type = "vlc";
        fixture = new MediaAdapter(type);
        String actual = fixture.play("vlcFile");
        assertTrue(actual.contains(type));
    }

    @Test
    public void shouldNotPlayUnknown() {
        String type = "unknown";
        fixture = new MediaAdapter(type);
        assertEquals("", fixture.play(type));
    }
}