package creational.factoryMethod;

import creational.factoryMethod.managers.DevelopmentManager;
import creational.factoryMethod.managers.HiringManager;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        HiringManager devManager = new DevelopmentManager();
        System.out.println(devManager.takeInterview());
    }
}
