package src;

import java.util.logging.ConsoleHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.LogRecord;;

public class LoggerUtil {
  private static Logger logger;

  static {
    logger = Logger.getLogger(LoggerUtil.class.getName());
    logger.setUseParentHandlers(false);

    ConsoleHandler consoleHandler = new ConsoleHandler();
    SimpleFormatter formatter = new SimpleFormatter() {
      @Override
      public synchronized String format(LogRecord record) {
        return record.getMessage() + "\n";
      }
    };

    consoleHandler.setFormatter(formatter);
    logger.addHandler(consoleHandler);
  }

  public static Logger getLogger() {
    return logger;
  }
}
