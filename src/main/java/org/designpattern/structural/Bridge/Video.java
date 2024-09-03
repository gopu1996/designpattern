package org.designpattern.structural.Bridge;

public abstract class Video {

    protected VideoQuality quality;

    public Video(VideoQuality quality){
        this.quality=quality;
    }

    public abstract void play(String videoFile);
}
