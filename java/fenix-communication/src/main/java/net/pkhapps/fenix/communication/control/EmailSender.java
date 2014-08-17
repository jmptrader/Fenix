package net.pkhapps.fenix.communication.control;

import net.pkhapps.fenix.communication.entity.CommunicationMethod;
import net.pkhapps.fenix.communication.entity.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

/**
 * TODO Implement me!
 */
@Service
class EmailSender extends Sender {

    private static final Logger LOGGER = LoggerFactory.getLogger(SmsSender.class);

    EmailSender(ApplicationContext applicationContext, MessageStateHelper messageStateHelper, PlatformTransactionManager platformTransactionManager) {
        super(applicationContext, messageStateHelper, platformTransactionManager);
    }

    @Override
    protected void doSend(Message message) {
        LOGGER.error("EmailSender not implemented yet");
        failed(message);
    }

    @Override
    protected CommunicationMethod getCommunicationMethod() {
        return CommunicationMethod.EMAIL;
    }
}
