/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import lombok.Getter;

@Getter
public class VlcPlayer implements MediaPlayer {
    private static final String type = "vlc";

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String play(String fileName) {
        return "Playing "+type+" file. Name: "+ fileName;
    }
}
