package behavioral.strategy.strategy;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class StrategyMod implements Strategy {
    @Override
    public int doOperation(int a, int b) {
        System.out.println("Operation: a mod b");
        return a % b;
    }
}
