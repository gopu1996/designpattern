package org.designpattern.behavioral.template;

public class Test {
    public static void main(String[] args) {

        DataRenderer rendererXml = new XmlRenderer();
        rendererXml.render();
        DataRenderer rendererCsv = new CsvRenderer();
        rendererCsv.render();

    }
}
