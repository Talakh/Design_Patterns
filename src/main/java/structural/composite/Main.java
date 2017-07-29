package structural.composite;

import structural.composite.drinks.cola.CherryCola;
import structural.composite.drinks.cola.OriginalCola;
import structural.composite.drinks.rootBear.OriginalRootBeer;
import structural.composite.drinks.rootBear.VanillaRootBeer;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        SodaDispenser fountain = new SodaDispenser();
        fountain.getColas().getAvailableFlavors().add(new OriginalCola(220));
        fountain.getColas().getAvailableFlavors().add(new CherryCola(230));
        fountain.getLemonLime().setCalories(180);
        fountain.getRootBeers().getAvailableFlavors().add(new OriginalRootBeer(225));
        fountain.getRootBeers().getAvailableFlavors().add(new VanillaRootBeer(225));
        fountain.DisplayCalories();
    }
}
