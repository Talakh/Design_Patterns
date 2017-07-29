package behavioral.visitor.visitable;

import behavioral.visitor.visitor.FormulaReader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Alkane implements Visitable {
    private List<Visitable> elements;

    public Alkane(int oxygenK) {
        elements = new ArrayList<>();
        elements.add(new Carbon());
        for (; oxygenK > 0; oxygenK--) {
            elements.add(new Carbon());
            elements.add(new Oxygen());
            elements.add(new Carbon());
        }
        elements.add(new Carbon());
    }

    @Override
    public void accept(FormulaReader visitor) {
        for (Visitable element : elements) {
            element.accept(visitor);
        }
    }
}
