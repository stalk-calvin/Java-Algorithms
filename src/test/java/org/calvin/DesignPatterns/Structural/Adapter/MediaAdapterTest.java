/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MediaAdapterTest {
    MediaAdapter fixture;

    @Test
    public void shouldPlayMp3() {
        fixture = new MediaAdapter(MediaAdapter.MediaType.MP3);
        String actual = fixture.play("mp3file");
        assertTrue(actual.contains("MP3"));
    }

    @Test
    public void shouldPlayMp4() {
        fixture = new MediaAdapter(MediaAdapter.MediaType.MP4);
        assertEquals(MediaAdapter.MediaType.NONE, fixture.getType());
        assertEquals(MediaAdapter.MediaType.MP4, fixture.mediaPlayer.getType());
        String actual = fixture.play("mp4file");
        assertTrue(actual.contains("MP4"));
    }

    @Test
    public void shouldPlayAvi() {
        fixture = new MediaAdapter(MediaAdapter.MediaType.AVI);
        String actual = fixture.play("avifile");
        assertTrue(actual.contains("AVI"));
    }

    @Test
    public void shouldNotPlayUnknown() {
        fixture = new MediaAdapter(MediaAdapter.MediaType.NONE);
        assertEquals("", fixture.play("unknown"));
    }
}
