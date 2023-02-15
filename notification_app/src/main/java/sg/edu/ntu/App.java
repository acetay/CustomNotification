package sg.edu.ntu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import sg.edu.ntu.exception.InvalidInputException;
import sg.edu.ntu.notification.CustomNotification;
import sg.edu.ntu.notification.EmailNotification;
import sg.edu.ntu.notification.SMSNotification;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        String to = "edison@mail.com";
        try{
            // CustomNotification n1 = new SMSNotification("+65 9123 4567", "Good morning!");
            // n1.send();
            // System.out.println("=========================================================");
            CustomNotification n2 = new EmailNotification(to, "Good afternoon!");
            n2.send();
        }catch(InvalidInputException iie){            
            logger.error("Invalid email input data:"+to,iie);
        }catch(Exception ex){
            logger.error("Unknown error", ex);
        }finally{
            System.out.println("FINALLY BLOCK");
        }
        testLogger();
    }
    

    public static void testLogger(){
        logger.debug("Debug message"); // excessive information for tracing and debugging
        logger.info("Info message"); // sufficient to trace the path
        logger.warn("Warning message"); // something that u might have to fix in future
        logger.error("Error message"); // execptions
        logger.fatal("Fatal message"); // blocker
    }
}
