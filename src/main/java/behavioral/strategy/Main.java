package behavioral.strategy;

import behavioral.strategy.strategy.*;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new StrategyAdd());
        int resultStrategyAdd = context.executeStrategy(23, 4);

        context = new Context(new StrategyMinus());
        resultStrategyAdd = context.executeStrategy(23, 4);


        context = new Context(new StrategyDiv());
        resultStrategyAdd = context.executeStrategy(23, 4);


        context = new Context(new StrategyMod());
        resultStrategyAdd = context.executeStrategy(23, 4);


        context = new Context(new StrategyMultiply());
        resultStrategyAdd = context.executeStrategy(23, 4);
    }
}
