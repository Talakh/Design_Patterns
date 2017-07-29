package behavioral.templateMethod;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new WorldOfTanks();
        game.play();

        game = new WoW();
        game.play();
    }
}
