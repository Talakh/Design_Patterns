package behavioral.strategy;

import behavioral.strategy.strategy.Strategy;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.doOperation(a, b);
    }
}
