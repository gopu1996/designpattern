package org.designpattern.creational.abstractfactory;

public class XmlDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String daoType) {
        Dao dao = null;

        if (daoType.equalsIgnoreCase("emp")){
            dao = new XmlEmpDao();
        } else if (daoType.equalsIgnoreCase("dept")){
            dao = new XmlDeptDao();
        }
        return dao;
    }
}
