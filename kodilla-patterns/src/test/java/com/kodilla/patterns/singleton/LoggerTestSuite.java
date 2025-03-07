package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    void getLastLogTest() {
        //Given
        Logger logger = Logger.INSTANCE;
        Logger logger1 = Logger.INSTANCE;
        Logger logger2 = Logger.INSTANCE;

        //When
        logger.log("This is a test");
        logger1.log("This is a test1");
        logger2.log("This is a test2");

        String log = logger.getLastLog();
        //Then
        assertEquals("This is a test2", log);
        assertEquals(logger, logger1);
        assertEquals(logger, logger2);
        assertEquals(logger1, logger2);
    }
}
