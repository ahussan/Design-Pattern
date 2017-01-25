package factorypattern;

import factorypattern.factories.Circle;
import factorypattern.factories.Rectangle;
import factorypattern.factories.Shape;
import factorypattern.factories.Square;

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
