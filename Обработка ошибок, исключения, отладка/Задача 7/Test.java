import com.sun.tools.javac.Main;

import java.util.logging.Logger;

public class Test {
    public static void main(String[] args) {
        logging();
    }
    public static void logging() {
        final Logger logger = Logger.getLogger("com.javamentor.logging.Test");
        logger.info("Все хорошо");
        logger.warning("Произошла ошибка");
    }
}
