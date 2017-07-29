package structural.composite;

import structural.composite.compositeDrinks.Colas;
import structural.composite.compositeDrinks.RootBeers;
import structural.composite.drinks.SoftDrink;
import structural.composite.drinks.lime.LemonLime;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class SodaDispenser {
    private Colas colas;
    private LemonLime lemonLime;
    private RootBeers rootBeers;

    public SodaDispenser() {
        colas = new Colas();
        lemonLime = new LemonLime(190);
        rootBeers = new RootBeers();
    }

    void DisplayCalories() {
        Map<String, Integer> sodas = new HashMap<>();

        for (SoftDrink cola : colas.getAvailableFlavors()) {
            sodas.put(cola.getClass().getSimpleName(), cola.getCalories());
        }

        sodas.put(lemonLime.getClass().getSimpleName(), lemonLime.getCalories());

        for (SoftDrink rootBeer : colas.getAvailableFlavors()) {
            sodas.put(rootBeer.getClass().getSimpleName(), rootBeer.getCalories());
        }

        System.out.println("Calories: ");
        for (String key : sodas.keySet()) {
            System.out.println(key + ":" + sodas.get(key) + "calories.");
        }
    }

    public Colas getColas() {
        return colas;
    }

    public LemonLime getLemonLime() {
        return lemonLime;
    }

    public RootBeers getRootBeers() {
        return rootBeers;
    }
}
