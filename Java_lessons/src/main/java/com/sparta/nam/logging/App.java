package com.sparta.nam.logging;

import java.util.logging.*;

import static com.sparta.nam.logging.MyLogger.LOGGER;

public class App {

    public static void main(String[] args) {

        MyLogger.main();

        LOGGER.log(Level.SEVERE, "SEVERE is a message level indicating a potential problem"); // highest
        LOGGER.log(Level.WARNING, "WARNING is a message level indicating a potential problem");
        LOGGER.log(Level.INFO, "INFO is a message level for informational messages");
        LOGGER.log(Level.CONFIG, "CONFIG is a message level for static configuration messages");
        LOGGER.log(Level.FINE, "FINE is a message level providing tracing information");
        LOGGER.log(Level.FINER, "FINER indicates a fairly detailed tracing message");
        LOGGER.log(Level.FINEST, "FINEST indicates a highly detailed tracing message");   // lowest
    }
}
