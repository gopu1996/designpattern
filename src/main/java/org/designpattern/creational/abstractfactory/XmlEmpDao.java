package org.designpattern.creational.abstractfactory;

public class XmlEmpDao implements Dao {

    @Override
    public void save() {
        System.out.println("Saving emp into xml");
    }
}
