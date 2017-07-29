package behavioral.iterator.chains;

import behavioral.iterator.entity.Musician;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class VikingMetalBand implements Container {
    private Map<String, Musician> band;

    public VikingMetalBand() {
        band = new HashMap<>();
    }

    @Override
    public Iterator createIterator() {
        return new VikingMetalIterator();
    }

    @Override
    public void addMember(Object newMember) {
        band.put(((Musician) newMember).getName(),(Musician) newMember);
    }

    private class VikingMetalIterator implements Iterator {
        private int position;

        @Override
        public boolean hasNext() {
            return band.size() > position;
        }

        @Override
        public Object next() {
            return band.values().toArray()[position++];
        }

        @Override
        public void remove() {
            band.remove(band.keySet().toArray()[position]);
        }
    }
}
