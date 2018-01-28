package creational.singleton;

/**
 * Created by Oleksii Talakh on 26.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton1);
    }
}
