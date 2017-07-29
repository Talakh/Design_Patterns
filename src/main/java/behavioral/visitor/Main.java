package behavioral.visitor;

import behavioral.visitor.visitable.Alkane;
import behavioral.visitor.visitor.FormulaReader;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Alkane propane = new Alkane(3);
        propane.accept(new FormulaReader());
    }
}
