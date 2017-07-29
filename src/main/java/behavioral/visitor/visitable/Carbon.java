package behavioral.visitor.visitable;

import behavioral.visitor.visitor.FormulaReader;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Carbon implements Visitable {
    @Override
    public void accept(FormulaReader visitor) {
        visitor.visit(this);
    }
}
