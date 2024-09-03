package org.designpattern.structural.Flyweight;

public class PaintApp {

    public void render(int numberShape){

        Shape shapes =  null;

        for (int i = 0; i <= numberShape ;i++){
            if(i % 2 ==0) {
                // Here we can see that lot of object is getting created to avoid this we need to create factory class where we can
                // create an object
                // separating  the  not having a same field into abstract in draw flied with there input
                // Pass them as parameter
                // create a factory class

                /*

                shapes[i] =  new Circle();
                ((Circle)shapes[i]).setRadius("3.25");
                ((Circle)shapes[i]).setFillColor("Yellow");
                ((Circle)shapes[i]).setLineColor("Red");
                shapes[i].draw();
            } else {
                shapes[i] =  new Rectangle();
                ((Rectangle)shapes[i]).setLength("3.25");
                ((Rectangle)shapes[i]).setBreadth("4");
                ((Rectangle)shapes[i]).setColor("Red");
                shapes[i].draw();
            }

                 */
                shapes =  ShapeFactory.getShape("circle");
                shapes.draw(5 , "Green" , "Yellow");

            } else {
                shapes =  ShapeFactory.getShape("rectangle");
                shapes.draw(1,2,"Red");
            }
        }

    }
}
