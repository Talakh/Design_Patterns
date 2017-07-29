package behavioral.templateMethod;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class WorldOfTanks extends Game {
    @Override
    void initialize() {
        System.out.println("This is World of Tanks!");
    }

    @Override
    void startPlay() {
        System.out.println("World of Tanks starts! Chose you tank!");
    }

    @Override
    void endPlay() {
        System.out.println("World of Tanks game over");
    }
}
