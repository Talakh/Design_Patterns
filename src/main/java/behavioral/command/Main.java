package behavioral.command;

import behavioral.command.commands.Command;
import behavioral.command.commands.TurnOff;
import behavioral.command.commands.TurnOn;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Bulb bulb = new Bulb();

        Command turnOn = new TurnOn(bulb);
        Command turnOf = new TurnOff(bulb);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.submit(turnOn);
        remoteControl.submit(turnOf);
    }
}
