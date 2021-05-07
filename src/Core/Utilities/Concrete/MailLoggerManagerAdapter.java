package Core.Utilities.Concrete;

import Core.Utilities.Abstract.ILoggerService;
import OuterPackages.MailLogger.MailLoggerManager;

public class MailLoggerManagerAdapter implements ILoggerService {
    @Override
    public void logToMail(String logMessage) {
        MailLoggerManager mailLogger = new MailLoggerManager();
        mailLogger.log(logMessage);
    }
}
