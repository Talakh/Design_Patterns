package structural.composite.drinks.cola;

import structural.composite.drinks.SoftDrink;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class CherryCola implements SoftDrink {

    private int calories;

    public CherryCola(int calories) {
        this.calories = calories;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void setCalories(int calories) {
        this.calories = calories;
    }
}
