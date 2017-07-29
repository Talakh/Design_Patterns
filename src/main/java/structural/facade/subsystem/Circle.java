package structural.facade.subsystem;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle.draw " + ++id);
    }
}
