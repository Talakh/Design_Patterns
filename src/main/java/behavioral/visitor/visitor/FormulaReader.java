package behavioral.visitor.visitor;

import behavioral.visitor.visitable.Alkane;
import behavioral.visitor.visitable.Carbon;
import behavioral.visitor.visitable.Oxygen;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class FormulaReader implements Visitor {

    public void visit(Alkane alkane) {
    }

    public void visit(Carbon carbon) {
        System.out.print("H");
    }

    public void visit(Oxygen oxygen) {
        System.out.print("-O-");
    }
}
