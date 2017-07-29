package creational.abstractFactory.factories;

import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.button.MacOSButton;
import creational.abstractFactory.products.menu.MacOSMenu;
import creational.abstractFactory.products.menu.Menu;
import creational.abstractFactory.products.window.MacOSWindow;
import creational.abstractFactory.products.window.Window;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class MacOSWidgetFactory implements WidgetFactory {
    @Override
    public Window createWindow() {
        Window window = new MacOSWindow();
        System.out.println(window.printWindowType() + " created");
        return window;
    }

    @Override
    public Button createButton() {
        Button button = new MacOSButton();
        System.out.println(button.printButtonType() + " created");
        return button;
    }

    @Override
    public Menu createMenu() {
        Menu menu = new MacOSMenu();
        System.out.println(menu.printMenuType() + " created");
        return menu;
    }
}
