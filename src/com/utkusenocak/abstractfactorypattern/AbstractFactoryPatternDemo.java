package com.utkusenocak.abstractfactorypattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        //Get an object of Rectangle and call draw method.
        Shape shape1 = shapeFactory.getShape("rectangle");
        shape1.draw();

        //Get an object of Square and call draw method.
        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        //Get Shape factory
        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        //Get an object of RoundedRectangle and call draw method.
        Shape shape3 = roundedShapeFactory.getShape("rectangle");
        shape3.draw();

        //Get an object of RoundedSquare and call draw method.
        Shape shape4 = roundedShapeFactory.getShape("square");
        shape4.draw();
    }
}
