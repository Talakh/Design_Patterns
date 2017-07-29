package behavioral.strategy.strategy;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class StrategyDiv implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: a div b");
        return a / b;
    }
}
