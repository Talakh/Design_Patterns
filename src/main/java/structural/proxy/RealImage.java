package structural.proxy;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class RealImage implements Image{

    private String name;

    public RealImage(String name) {
        this.name = name;
        loadImage(name);
    }

    @Override
    public void draw() {
        System.out.println(name + " drawn");
    }

    public void loadImage(String fileName){
        System.out.println("Loading... " + fileName);
    }
}
