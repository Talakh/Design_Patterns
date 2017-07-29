package behavioral.state;

import behavioral.state.state.WritingState;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class TextEditor {
    WritingState state;

    public TextEditor(WritingState state) {
        this.state = state;
    }

    public void setState(WritingState state) {
        this.state = state;
    }

    public void type(String words){
        state.write(words);
    }
}
