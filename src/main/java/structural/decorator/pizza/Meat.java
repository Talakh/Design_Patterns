package structural.decorator.pizza;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Meat implements Pizza {

    protected Pizza pizza;

    public Meat(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Meat";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 3.0;
    }
}
