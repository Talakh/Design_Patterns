package behavioral.observer.observers;


import behavioral.observer.Subject;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
