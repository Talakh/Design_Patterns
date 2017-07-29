package behavioral.templateMethod;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class WoW extends Game {

    @Override
    void initialize() {
        System.out.println("This is WoW!");
    }

    @Override
    void startPlay() {
        System.out.println("WoW starts!");
    }

    @Override
    void endPlay() {
        System.out.println("WoW game over...");
    }
}
