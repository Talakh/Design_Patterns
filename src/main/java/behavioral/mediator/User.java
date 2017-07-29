package behavioral.mediator;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class User {
    private String name;
    private ChatMediator chat;

    public User(String name, ChatMediator chat) {
        this.name = name;
        this.chat = chat;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatMediator getChat() {
        return chat;
    }

    public void setChat(ChatMediator chat) {
        this.chat = chat;
    }

    public void sendMessage(String message) {
        chat.showMessage(this, message);
    }
}
