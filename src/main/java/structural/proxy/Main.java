package structural.proxy;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Image image = new ImageProxy("Image.png");
        System.out.println("Drawing first time");
        image.draw();
        System.out.println("Drawing next time");
        image.draw();
    }
}
