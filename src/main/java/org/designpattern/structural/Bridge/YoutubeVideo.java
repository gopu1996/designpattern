package org.designpattern.structural.Bridge;

public class YoutubeVideo extends Video {


    public YoutubeVideo(VideoQuality quality) {
        super(quality);
    }

    @Override
    public void play(String videoFile) {
        quality.process(videoFile);
    }
}
