package org.designpattern.creational.abstractfactory;

public class DbDeptDao implements Dao{


    @Override
    public void save() {
        System.out.println("Saving dept into DB");
    }
}
