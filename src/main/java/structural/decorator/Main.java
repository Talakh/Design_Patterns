package structural.decorator;

import structural.decorator.pizza.*;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new SimplePizza()));
        System.out.println("Basic pizza ingredients: " + basicPizza.getDescription()+"\nCost:"+ basicPizza.getCost());

        Pizza meatPizza = new Beacon(new Chicken(basicPizza));
        System.out.println("Meat pizza ingredients: " + meatPizza.getDescription() + "\nCost:" + meatPizza.getCost());
    }
}
