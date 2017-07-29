package behavioral.observer;

import behavioral.observer.observers.BinaryObserver;
import behavioral.observer.observers.HexObserver;
import behavioral.observer.observers.OctalObserver;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
