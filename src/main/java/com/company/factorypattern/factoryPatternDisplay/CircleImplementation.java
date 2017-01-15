package com.company.factorypattern.factoryPatternDisplay;

import com.company.factorypattern.factories.Shape;
import com.company.factorypattern.ShapeFactory;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class CircleImplementation {

    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();
        Shape mycircle = factory.getshape("circle");
        mycircle.draw();
    }
}
