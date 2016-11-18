/*
 * Copyright Calvin Lee - 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if("mp3".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp3Player();

        }else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if("vlc".equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp3(fileName);
        }
        else if("mp4".equalsIgnoreCase(audioType)){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}