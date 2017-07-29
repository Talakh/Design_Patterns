package structural.adapter;

import structural.adapter.Dog.Dog;
import structural.adapter.Dog.WildDog;
import structural.adapter.Lions.AfricanLion;
import structural.adapter.Lions.Lion;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Lion lion = new AfricanLion();

        Dog dog = new WildDog();
        WildDogAdapter wildDogAdapter = new WildDogAdapter(dog);

        Hunter hunter = new Hunter();
        hunter.hunt(lion);
        hunter.hunt(wildDogAdapter);
    }
}
