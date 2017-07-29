package behavioral.templateMethod;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public abstract class Game {
    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    public void play() {
        initialize();
        startPlay();
        endPlay();
    }
}
