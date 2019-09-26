/*
 * Copyright Calvin Lee Since 2016.
 * All Rights Reserved.
 */

package org.calvin.DesignPatterns.Structural.Adapter;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.EnumUtils;
import org.apache.commons.lang3.Validate;

import static org.calvin.DesignPatterns.Structural.Adapter.MediaAdapter.MediaType.NONE;

@Slf4j
public class MediaAdapter implements MediaPlayer {

    public enum MediaType { MP3, MP4, AVI, NONE }
    MediaPlayer mediaPlayer;

    public MediaAdapter(MediaType audioType){
        if(MediaType.MP3.equals(audioType)){
            mediaPlayer = new Mp3Player();
        } else if (MediaType.MP4.equals(audioType)){
            mediaPlayer = new Mp4Player();
        } else if (MediaType.AVI.equals(audioType)){
            mediaPlayer = new AviPlayer();
        }
    }

    @Override
    public MediaType getType() { return NONE; }

    @Override
    public String play(String fileName) {
        String playString = "";
        if (mediaPlayer != null) {
            MediaType audioType = mediaPlayer.getType();
            Validate.notNull(audioType); //make sure type is valid as well.
            EnumUtils.isValidEnum(MediaType.class, audioType.toString());
            playString = mediaPlayer.play(fileName);
        } else {
            log.info("Unknown media player: " + mediaPlayer);
            return "";
        }
        
        return playString;
    }
}
