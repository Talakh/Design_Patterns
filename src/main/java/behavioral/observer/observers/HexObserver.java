package behavioral.observer.observers;

import behavioral.observer.Subject;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
