package behavioral.chainOfResponsibility;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void logMessage(String message) {
        System.out.println("ERROR: " + message);
    }
}
