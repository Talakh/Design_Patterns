package creational.abstractFactory;

import creational.abstractFactory.factories.MSWidgetFactory;
import creational.abstractFactory.factories.MacOSWidgetFactory;
import creational.abstractFactory.factories.WidgetFactory;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        GUIBuilder guiBuilder = new GUIBuilder();
        System.out.println("WidgetFactory becomes MSWidgetFactory");
        WidgetFactory widgetFactory = new MSWidgetFactory();
        guiBuilder.buildElements(widgetFactory);
        System.out.println("WidgetFactory becomes MacOSWidgetFactory");
        widgetFactory = new MacOSWidgetFactory();
        guiBuilder.buildElements(widgetFactory);
    }
}
