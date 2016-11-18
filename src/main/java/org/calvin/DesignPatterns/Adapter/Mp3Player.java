/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Adapter;

public class Mp3Player implements AdvancedMediaPlayer{
    @Override
    public void playMp3(String fileName) {
        System.out.println("Playing mp3 file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}