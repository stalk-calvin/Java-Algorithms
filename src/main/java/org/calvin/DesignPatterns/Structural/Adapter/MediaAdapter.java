/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import lombok.extern.slf4j.Slf4j;

import org.apache.commons.lang3.Validate;

@Slf4j
public class MediaAdapter implements MediaPlayer {

    MediaPlayer mediaPlayer;

    public MediaAdapter(String audioType){
        if("mp3".equalsIgnoreCase(audioType)){
            mediaPlayer = new Mp3Player();
        } else if ("mp4".equalsIgnoreCase(audioType)){
            mediaPlayer = new Mp4Player();
        } else if ("vlc".equalsIgnoreCase(audioType)){
            mediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public String getType() { return "Media Player"; }

    @Override
    public String play(String fileName) {
        String playString = "";
        if (mediaPlayer != null) {
            String audioType = mediaPlayer.getType();
            Validate.notEmpty(audioType);

            if ("mp3".equalsIgnoreCase(audioType)) {
                playString = mediaPlayer.play(fileName);
            } else if ("mp4".equalsIgnoreCase(audioType)) {
                playString = mediaPlayer.play(fileName);
            } else if ("vlc".equalsIgnoreCase(audioType)) {
                playString = mediaPlayer.play(fileName);
            }
        } else {
            log.info("Unknown media player: " + mediaPlayer);
            return "";
        }
        
        return playString;
    }
}
