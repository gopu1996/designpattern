package org.designpattern.structural.Bridge;

public class Test {

    public static void main(String[] args) {

      Video youtubeVideo = new YoutubeVideo(new HdQuality());
      youtubeVideo.play("radhekrishna.mp4");

        Video youtubeVideo1 = new YoutubeVideo(new HdrQuality());
        youtubeVideo1.play("radhekrishna1.mp4");

        Video netflixVideo1 = new NetflixVideo(new HdrQuality());
        netflixVideo1.play("radheshayam1.mp4");

        Video netflixVideo = new NetflixVideo(new HdQuality());
        netflixVideo.play("radheshyam.mp4");

    }
}
