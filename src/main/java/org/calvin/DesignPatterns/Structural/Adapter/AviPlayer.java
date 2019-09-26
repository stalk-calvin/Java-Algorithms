/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import lombok.Getter;

@Getter
public class AviPlayer implements MediaPlayer {
    @Override
    public MediaAdapter.MediaType getType() {
        return MediaAdapter.MediaType.AVI;
    }

    @Override
    public String play(String fileName) {
        return "Playing "+getType()+" file. Name: "+ fileName;
    }
}
