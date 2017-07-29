package structural.flyweight;

import java.util.HashMap;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();
    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);
        if (circle==null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating " + color + " circle");
        }
        return circle;
    }
}
