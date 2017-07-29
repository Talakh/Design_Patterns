package behavioral.iterator.chains;

import java.util.Iterator;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public interface Container {
    Iterator createIterator();

    void addMember(Object o);
}
