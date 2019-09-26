/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

public interface MediaPlayer {
    MediaAdapter.MediaType getType();
    String play(String fileName);
}
