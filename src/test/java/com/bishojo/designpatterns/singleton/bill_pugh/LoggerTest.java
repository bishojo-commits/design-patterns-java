package com.bishojo.designpatterns.singleton.bill_pugh;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTest {

    private final static String LOGGER_INFO = "Yes, all set";

    @Test
    public void testLoggerInstanceIsCreated() {
        Logger logger = Logger.getInstance();

        Assertions.assertNotNull(logger);
    }

    @Test
    public void testLoggerInstanceDataIsSet() {
        Logger logger = Logger.getInstance();
        logger.setInfo(LOGGER_INFO);

        Assertions.assertEquals(LOGGER_INFO, logger.getInfo());
    }

    @Test
    public void testLoggerInstanceIsRealSingleton() {
        Logger logger = Logger.getInstance();
        logger.setInfo(LOGGER_INFO);

        logger = Logger.getInstance();

        Assertions.assertEquals(LOGGER_INFO, logger.getInfo());
    }
}
