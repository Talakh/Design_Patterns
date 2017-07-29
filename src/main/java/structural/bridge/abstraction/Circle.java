package structural.bridge.abstraction;

import structural.bridge.implementor.DrawAPI;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Circle implements Shape {

    DrawAPI drawAPI;

    private int x, y, radius;

    public Circle(DrawAPI drawAPI, int x, int y, int radius) {
        this.drawAPI = drawAPI;
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {

    }
}
