package structural.composite.compositeDrinks;

import structural.composite.drinks.SoftDrink;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class RootBeers {
    private List<SoftDrink> availableFlavors = new LinkedList<>();

    public List<SoftDrink> getAvailableFlavors() {
        return availableFlavors;
    }

    public void setAvailableFlavors(List<SoftDrink> availableFlavors) {
        this.availableFlavors = availableFlavors;
    }
}
