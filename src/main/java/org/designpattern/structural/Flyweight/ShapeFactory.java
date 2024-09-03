package org.designpattern.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    
    private static Map<String,Shape> shapeMap =  new HashMap<>();
    
    public static Shape getShape(String type){
        Shape shape = null;
        if(shapeMap.get(type) != null){
            shape = shapeMap.get(type);
        } else {
            if (type.equalsIgnoreCase("Circle")){
                shape = new Circle();
            } else if (type.equalsIgnoreCase("Rectangle")) {
                 shape =  new Rectangle();
            }
            shapeMap.put(type,shape);
        }
        return shape;
    }
}
