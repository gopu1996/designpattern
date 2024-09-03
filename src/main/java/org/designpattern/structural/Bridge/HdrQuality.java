package org.designpattern.structural.Bridge;

public class HdrQuality implements VideoQuality{
    @Override
    public void process(String videoFile) {
        System.out.println(" Video is playing "+ videoFile + " HDR Quality");

    }
}
