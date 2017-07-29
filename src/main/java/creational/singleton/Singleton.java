package creational.singleton;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class Singleton {
    private String name;
    private static Singleton instance;

    public String getName() {
        return name;
    }

    private Singleton() {
        name = "Single Instance";
    }

    public static synchronized Singleton getInstance() {
        if (instance == null)
            instance = new Singleton();

        return instance;
    }
}
