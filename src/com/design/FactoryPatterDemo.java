package com.design;

public class FactoryPatterDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Shape shape1=shapeFactory.getShape("circle");
        shape1.draw();
        Shape shape2=shapeFactory.getShape("RECTANGLE");
        Shape shape3=shapeFactory.getShape("SQUARE");
        System.out.println();


    }
}
