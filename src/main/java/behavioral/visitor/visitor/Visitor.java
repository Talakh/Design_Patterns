package behavioral.visitor.visitor;

import behavioral.visitor.visitable.Alkane;
import behavioral.visitor.visitable.Carbon;
import behavioral.visitor.visitable.Oxygen;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public interface Visitor {
    void visit(Alkane alkane);
    void visit(Oxygen oxygen);
    void visit(Carbon carbon);
}
