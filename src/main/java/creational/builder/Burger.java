package creational.builder;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class Burger{
    private int size;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean cheese;
    private boolean tomato;

    public Burger(BurgerBuilder burgerBuilder) {
        size = burgerBuilder.getSize();
        pepperoni = burgerBuilder.isPepperoni();
        lettuce = burgerBuilder.isLettuce();
        cheese = burgerBuilder.isCheese();
        tomato = burgerBuilder.isTomato();
    }
}
