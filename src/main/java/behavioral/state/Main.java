package behavioral.state;

import behavioral.state.state.Default;
import behavioral.state.state.LowerCase;
import behavioral.state.state.UpperCase;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(new Default());

        editor.type("First line");

        editor.setState(new UpperCase());

        editor.type("Second line");
        editor.type("Third line");

        editor.setState(new LowerCase());

        editor.type("Fourth line");
        editor.type("Fifth line");
    }
}
