package structural.bridge;

import structural.bridge.abstraction.Circle;
import structural.bridge.abstraction.Shape;
import structural.bridge.implementor.GreenCircle;
import structural.bridge.implementor.RedCircle;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircle(),20,40,25);
        Shape greenCircle = new Circle(new GreenCircle(),50,20,30);
    }
}
