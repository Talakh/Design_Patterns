package creational.prototype.buttons;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Button implements Cloneable {
    private String id;
    private double positionX;
    private double positionY;
    private String text;

    public void setId(String id) {
        this.id = id;
    }

    public void setPositionX(double positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(double positionY) {
        this.positionY = positionY;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public Object clone() {
        Button newButton = null;
        try {
            newButton = this.getClass().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        newButton.id = new String(this.id);
        newButton.text = new String(this.text);
        newButton.positionX = this.positionX;
        newButton.positionY = this.positionY;
        return newButton;
    }


    @Override
    public String toString() {
        return "Button{" +
                "id='" + id + '\'' +
                ", positionX=" + positionX +
                ", positionY=" + positionY +
                ", text='" + text + '\'' +
                '}';
    }
}
