package creational.abstractFactory.factories;

import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.button.MSButton;
import creational.abstractFactory.products.menu.MSMenu;
import creational.abstractFactory.products.menu.Menu;
import creational.abstractFactory.products.window.MSWindow;
import creational.abstractFactory.products.window.Window;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class MSWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        Window window = new MSWindow();
        System.out.println(window.printWindowType() + " created");
        return window;
    }

    @Override
    public Button createButton() {
        Button button = new MSButton();
        System.out.println(button.printButtonType() + " created");
        return button;
    }

    @Override
    public Menu createMenu() {
        Menu menu = new MSMenu();
        System.out.println(menu.printMenuType() + " created");
        return menu;
    }
}
