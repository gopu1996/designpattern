package org.designpattern.abstractfactory;

public class DaoFactoryProducer {

    public static DaoAbstractFactory produce(String factoryType){

        DaoAbstractFactory daf = null;

        if(factoryType.equalsIgnoreCase("xml")){
            daf = new XmlDaoFactory();
        } else if (factoryType.equalsIgnoreCase("db")) {
            daf= new DbDaoFactory();
        }
        return daf;
    }
}
