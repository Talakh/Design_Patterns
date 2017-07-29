package behavioral.command.commands;

import behavioral.command.Bulb;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class TurnOn implements Command {
    protected Bulb bulb;

    public TurnOn(Bulb bulb) {
        this.bulb = bulb;
    }

    @Override
    public void execute() {
        bulb.turnOn();
    }

    @Override
    public void undo() {
        bulb.turnOff();
    }

    @Override
    public void redo() {
        this.execute();
    }
}
