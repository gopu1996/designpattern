package org.designpattern.structural.Bridge;

public class HdQuality implements VideoQuality{
    @Override
    public void process(String videoFile) {
        System.out.println(" Video is playing "+ videoFile + " HD Quality");

    }
}
