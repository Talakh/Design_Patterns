package structural.decorator.pizza;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Beacon implements Pizza{
    protected Pizza pizza;

    public Beacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Beacon";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 3.0;
    }
}
