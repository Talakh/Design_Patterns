package behavioral.chainOfResponsibility;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("DEBUG: " + message);
    }
}
