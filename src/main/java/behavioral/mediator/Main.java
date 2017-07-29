package behavioral.mediator;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        ChatMediator chat = new Chat();

        User john = new User("John",chat);
        User dart = new User("dart",chat);

        john.sendMessage("I'm your father");
        dart.sendMessage("Oh, no!");
    }
}
