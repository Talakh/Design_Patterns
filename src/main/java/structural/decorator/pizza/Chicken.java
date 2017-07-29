package structural.decorator.pizza;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Chicken implements Pizza {
    protected Pizza pizza;

    public Chicken(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Chicken";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 4.0;
    }
}
