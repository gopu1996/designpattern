package org.designpattern.creational.abstractfactory;

public class DbEmpDao implements Dao{


    @Override
    public void save() {
        System.out.println("Saving Emp into DB");
    }
}
