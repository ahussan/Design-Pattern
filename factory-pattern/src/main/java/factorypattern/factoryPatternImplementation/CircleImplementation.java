package factorypattern.factoryPatternImplementation;

import factorypattern.factories.Shape;
import factorypattern.ShapeFactory;

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
