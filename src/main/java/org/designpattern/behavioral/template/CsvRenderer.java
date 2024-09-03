package org.designpattern.behavioral.template;

public class XmlRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        return "processing " + data;
    }
}
