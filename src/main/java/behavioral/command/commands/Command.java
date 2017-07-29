package behavioral.command.commands;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public interface Command {
    void execute();

    void undo();

    void redo();
}
