package behavioral.observer;

import behavioral.observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer : observers){
            observer.update();
        }
    }
}
