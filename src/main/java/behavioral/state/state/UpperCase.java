package behavioral.state.state;

/**
 * Created by Oleksii Talakh on 29.07.2017.
 */
public class UpperCase implements WritingState {
    @Override
    public void write(String words) {
        System.out.println(words.toUpperCase());
    }
}
