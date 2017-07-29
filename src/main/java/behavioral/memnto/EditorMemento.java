package behavioral.memnto;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class EditorMemento {
    private String content;

    public EditorMemento(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
