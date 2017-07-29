package structural.decorator.pizza;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class TomatoSauce implements Pizza {

    protected Pizza pizza;

    public TomatoSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Tomato Sauce";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 1.0;
    }
}
