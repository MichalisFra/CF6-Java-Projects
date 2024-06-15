package gr.aueb.cf.OOPProjects.exercises.ch14;

import java.util.Date;

public class Logger {

    private static Logger SINGLETON = null;

    private Logger(){}

    public static Logger getInstance() {
        if (SINGLETON == null) {
            SINGLETON = new Logger();
        }
        return SINGLETON;
    }

    public void logMessage(String message){
        System.err.println(message + "  Timestamp: " + new Date());

    }
}
