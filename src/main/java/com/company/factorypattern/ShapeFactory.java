package com.company.factorypattern;

import com.company.factorypattern.factories.Circle;
import com.company.factorypattern.factories.Rectangle;
import com.company.factorypattern.factories.Shape;
import com.company.factorypattern.factories.Square;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class ShapeFactory {

    public Shape getshape(String shapename){
        if (shapename==null){
            return null;
        }
        if (shapename.equalsIgnoreCase("Circle")){
            return new Circle();

        } else if (shapename.equalsIgnoreCase("Rectangle")){
            return new Rectangle();

        }else if(shapename.equalsIgnoreCase("Square")){
            return new Square();
        }
        return null;
    }
}
