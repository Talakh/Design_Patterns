package creational.builder;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Burger burger = (new BurgerBuilder(5))
                        .addCheese()
                        .addLettuce()
                        .addTomato()
                        .build();
    }
}
