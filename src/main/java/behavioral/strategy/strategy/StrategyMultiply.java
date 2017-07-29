package behavioral.strategy.strategy;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class StrategyMultiply implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: a * b");
        return a * b;
    }
}
