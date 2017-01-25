package factorypattern.factoryPatternImplementation;

import factorypattern.ShapeFactory;
import factorypattern.factories.Shape;

/**
 * Created by anjalhussan on 1/14/17.
 */
public class SquareImplementation {

    public static void  main(String[]arts){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape sq = shapeFactory.getshape("Square");
        sq.draw();
    }

}
