package behavioral.iterator;

import behavioral.iterator.chains.Container;
import behavioral.iterator.chains.VikingMetalBand;
import behavioral.iterator.entity.Musician;
import behavioral.iterator.entity.Role;

import java.util.Iterator;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Container tyr = new VikingMetalBand();

        tyr.addMember(new Musician("Heri Joensen", Role.guitar));
        tyr.addMember(new Musician("Gunnar Thomsen", Role.bass));
        tyr.addMember(new Musician("Terji Skibenæs", Role.guitar));
        tyr.addMember(new Musician("Kári Streymoy", Role.drum));
        tyr.addMember(new Musician("Pól Arni Holm", Role.vocal));

        System.out.println("Týr:");
        Iterator iterator = tyr.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
