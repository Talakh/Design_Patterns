package structural.facade.subsystem;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line.draw " + ++id);
    }
}
