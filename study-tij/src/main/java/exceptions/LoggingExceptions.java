package exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author : Cheese
 * @date : 2018/4/11
 * @description : TODO
 */
class LoggingException extends Exception{
    private static Logger logger =
            Logger.getLogger("LoggingException");
    public LoggingException(){
        StringWriter trace = new StringWriter();
        printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }
}

public class LoggingExceptions {
    public static void main(String[] args) {
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("Caught " + e);
        }
        try{
            throw new LoggingException();
        }catch (LoggingException e){
            System.err.println("Caught " + e);
        }
    }
}
