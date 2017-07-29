package behavioral.mediator;

import java.util.Date;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Chat implements ChatMediator {
    @Override
    public void showMessage(User user, String message) {
        System.out.println(new Date() + "[" + user.getName() + "] " + message);
    }
}
