import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.RuntimeErrorException;

public class App {
    static Logger log = LoggerFactory.getLogger(App.class);


    public static void main(String[] args) {
//        System.out.println("Java7 Maven Project");
        try {
            throw new RuntimeException("Nereala Kluda");
        } catch (RuntimeException e) {
            log.info("Java7 Maven Project");
            log.debug("Java7 Maven Project");
            log.trace("Java7 Maven Project");
            log.error("Java7 Maven Project");
            log.warn("Java7 Maven Project");

        }
    }
}