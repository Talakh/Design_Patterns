package structural.facade;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        ShapeFacade shapeFacade = new ShapeFacade();
        shapeFacade.createCircle();
        shapeFacade.createLine();
        shapeFacade.createRectangular();
        shapeFacade.createTriangle();
    }
}
