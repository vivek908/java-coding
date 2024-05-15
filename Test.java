import java.util.logging.Level;
import java.util.logging.Logger;

public class Test extends Calculator {
    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
    
    public void doAction(){
        long startTime = System.nanoTime();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        
        // Log the time taken at INFO level
        LOGGER.log(Level.INFO, "Time taken: {0} nanoseconds", duration);

    }
    public static void main(String[] args) {
        Test t=new Test();
        t.doAction();
    }
}
