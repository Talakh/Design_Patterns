package structural.decorator.pizza;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Mozzarella implements Pizza {

    protected Pizza pizza;

    public Mozzarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mozzarella";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 2.0;
    }
}
