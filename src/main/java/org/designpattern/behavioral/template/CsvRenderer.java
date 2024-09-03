package org.designpattern.behavioral.template;

public class CsvRenderer extends DataRenderer{
    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "processing " + data;
    }
}
