/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import lombok.Getter;

@Getter
public class Mp3Player implements MediaPlayer {
    @Override
    public MediaAdapter.MediaType getType() {
        return MediaAdapter.MediaType.MP3;
    }

    @Override
    public String play(String fileName) {
        return "Playing "+getType()+" file. Name: "+ fileName;
    }
}
