package creational.builder;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class BurgerBuilder {
    private int size;
    private boolean pepperoni = false;
    private boolean lettuce = false;
    private boolean cheese = false;
    private boolean tomato = false;

    public BurgerBuilder(int size) {
        this.size = size;
    }

    public BurgerBuilder addPepperoni() {
        this.pepperoni = true;
        return this;
    }

    public BurgerBuilder addLettuce() {
        this.lettuce = true;
        return this;
    }

    public BurgerBuilder addCheese() {
        this.cheese = true;
        return this;
    }

    public BurgerBuilder addTomato() {
        this.tomato = true;
        return this;
    }

    public Burger build(){
        return new Burger(this);
    }

    public int getSize() {
        return size;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isTomato() {
        return tomato;
    }
}
