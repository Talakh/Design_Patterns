package behavioral.visitor.visitable;

import behavioral.visitor.visitor.FormulaReader;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public interface Visitable {
    void accept(FormulaReader visitor);
}
