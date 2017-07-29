package behavioral.observer.observers;

import behavioral.observer.Subject;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
