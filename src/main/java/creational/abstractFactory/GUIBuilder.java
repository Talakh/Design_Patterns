package creational.abstractFactory;

import creational.abstractFactory.factories.WidgetFactory;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class GUIBuilder {
    public void buildElements(WidgetFactory widgetFactory) {
        widgetFactory.createWindow();
        widgetFactory.createButton();
        widgetFactory.createMenu();
    }
}
