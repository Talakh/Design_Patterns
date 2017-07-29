package creational.prototype;

import creational.prototype.buttons.ActionButton;
import creational.prototype.buttons.Button;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Button actionButton = new ActionButton();
        actionButton.setId("1");
        actionButton.setText("first Button");
        actionButton.setPositionX(1);
        actionButton.setPositionY(2);

        System.out.println(actionButton.clone());
    }
}
