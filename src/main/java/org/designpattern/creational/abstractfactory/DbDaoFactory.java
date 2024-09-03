package org.designpattern.abstractfactory;

public class DbDaoFactory extends DaoAbstractFactory{
    @Override
    public Dao createDao(String daoType) {
        Dao dao = null;

        if (daoType.equalsIgnoreCase("emp")){
            dao = new DbEmpDao();
        } else if (daoType.equalsIgnoreCase("dept")){
            dao = new DbDeptDao();
        }
        return dao;
    }
}
