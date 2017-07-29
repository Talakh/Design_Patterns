package structural.decorator.pizza;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class SimplePizza implements Pizza {
    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}
