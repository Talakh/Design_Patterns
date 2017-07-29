package behavioral.chainOfResponsibility;

/**
 * Created by Oleksii Talakh on 28.07.2017.
 */
public class Main {
    static AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
    static AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
    static AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

    static {
        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);
    }

    public static void main(String[] args) {
        infoLogger.logMessage(AbstractLogger.INFO, "message for info");
        infoLogger.logMessage(AbstractLogger.DEBUG, "message for debug");
        infoLogger.logMessage(AbstractLogger.ERROR, "message for error");
    }
}
