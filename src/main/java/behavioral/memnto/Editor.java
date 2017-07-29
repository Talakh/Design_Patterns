package behavioral.memnto;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Editor {
    private String content = "";

    public void type(String words) {
        content = content + " " + words;
    }

    public String getContent(){
        return content;
    }

    public EditorMemento save(){
        return new EditorMemento(content);
    }

    public void restore(EditorMemento editorMemento){
        content = editorMemento.getContent();
    }
}
