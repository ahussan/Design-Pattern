package com.company.factorypattern.factoryPatternDisplay;

import com.company.factorypattern.ShapeFactory;
import com.company.factorypattern.factories.Shape;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class RectangleImplementation {

    public static void main(String[]args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape myrec = shapeFactory.getshape("rectangle");
        myrec.draw();
    }


}
