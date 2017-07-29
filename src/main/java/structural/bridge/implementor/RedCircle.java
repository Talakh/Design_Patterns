package structural.bridge.implementor;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int x, int y, int radius) {
        System.out.println("Drawing green circle with radius= " + radius + "," +
                "\nx= " + x + "," +
                "\ny= " + y);
    }
}
