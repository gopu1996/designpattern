package org.designpattern.structural.Bridge;

public class NetflixVideo extends Video{


    public NetflixVideo(VideoQuality quality) {
        super(quality);
    }

    @Override
    public void play(String videoFile) {
        quality.process(videoFile);
     }
}
