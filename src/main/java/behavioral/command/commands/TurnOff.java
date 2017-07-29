package behavioral.command.commands;

import behavioral.command.Bulb;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class TurnOff implements Command {

    protected Bulb bulb;

    public TurnOff(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOff();
    }

    @Override
    public void undo() {
        bulb.turnOn();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
