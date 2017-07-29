package structural.facade;

import structural.facade.subsystem.Circle;
import structural.facade.subsystem.Line;
import structural.facade.subsystem.Rectangular;
import structural.facade.subsystem.Triangle;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class ShapeFacade {
    public void createLine(){
        Line line = new Line();
        line.draw();
    }

    public void createCircle(){
        Circle circle = new Circle();
        circle.draw();
    }

    public void createTriangle(){
        Triangle triangle = new Triangle();
        triangle.draw();
    }

    public void createRectangular(){
        Rectangular rectangular = new Rectangular();
        rectangular.draw();
    }
}
