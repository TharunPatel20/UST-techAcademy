package encapsulationAndInterfaces;

interface Logger {
    void logInfo(String message);
    void logError(String message);
}

class FileLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println("Logging info to file: " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("Logging error to file: " + message);
    }
}

class DatabaseLogger implements Logger {
    @Override
    public void logInfo(String message) {
        System.out.println("Logging info to database: " + message);
    }

    @Override
    public void logError(String message) {
        System.out.println("Logging error to database: " + message);
    }
}

class Application {
    private Logger logger;

    public Application(Logger logger) {
        this.logger = logger;
    }

    public void performApplicationTask() {
        logger.logInfo("Task started");
        // Do some work...
        logger.logError("An error occurred");
    }
}

public class Main {
    public static void main(String[] args) {
        Logger fileLogger = new FileLogger();
        Application app1 = new Application(fileLogger);
        app1.performApplicationTask();

        Logger dbLogger = new DatabaseLogger();
        Application app2 = new Application(dbLogger);
        app2.performApplicationTask();
    }
}
