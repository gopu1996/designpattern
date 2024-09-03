package org.designpattern.abstractfactory;

public class XmlDeptDao  implements Dao{

    @Override
    public void save() {
        System.out.println("Saving dept into xml");
    }
}
