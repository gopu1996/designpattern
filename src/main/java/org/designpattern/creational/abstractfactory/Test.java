package org.designpattern.abstractfactory;

public class Test {
    public static void main(String[] args) {

      DaoAbstractFactory daoAbstractFactory =  DaoFactoryProducer.produce("xml");

     Dao dao = daoAbstractFactory.createDao("dept");

     dao.save();
    }
}
