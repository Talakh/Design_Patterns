package behavioral.memnto;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        EditorMemento editorMemento;

        editor.type("This is the first sentence.");
        editor.type("This is second.");
        System.out.println(editor.getContent());
        editorMemento = editor.save();

        editor.type("And this is third.");
        System.out.println(editor.getContent());
        editor.restore(editorMemento);
        System.out.println(editor.getContent());
    }
}
