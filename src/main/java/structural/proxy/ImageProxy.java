package structural.proxy;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class ImageProxy implements Image {

    private RealImage realImage;
    private String imageName;

    public ImageProxy(RealImage realImage, String imageName) {
        this.realImage = realImage;
        this.imageName = imageName;
    }

    public ImageProxy(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void draw() {
        if (realImage == null){
            realImage = new RealImage(imageName);
        }
        realImage.draw();
    }
}
