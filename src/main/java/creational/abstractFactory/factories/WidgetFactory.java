package creational.abstractFactory.factories;

import creational.abstractFactory.products.button.Button;
import creational.abstractFactory.products.menu.Menu;
import creational.abstractFactory.products.window.Window;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public interface WidgetFactory {
    Window createWindow();
    Button createButton();
    Menu createMenu();
}
