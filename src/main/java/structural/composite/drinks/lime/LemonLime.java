package structural.composite.drinks.lime;

import structural.composite.drinks.SoftDrink;

/**
 * Created by Oleksii Talakh on 27.07.2017.
 */
public class LemonLime implements SoftDrink {
    private int calories;

    public LemonLime(int calories) {
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
