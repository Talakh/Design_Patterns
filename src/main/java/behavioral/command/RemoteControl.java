package behavioral.command;

import behavioral.command.commands.Command;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class RemoteControl {
    public void submit(Command command){
        command.execute();
    }
}
