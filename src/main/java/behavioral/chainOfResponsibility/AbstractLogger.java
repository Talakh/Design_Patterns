package behavioral.chainOfResponsibility;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level < level) {
            System.out.println("Go to next logger");
        }
        if (this.level == level) {
            logMessage(message);
        }

        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    protected abstract void logMessage(String message);
}
