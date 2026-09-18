package com.sparta.nam.logging;

import java.util.logging.*;

public class MyLogger {

    public static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main() {
        LOGGER.setLevel(Level.ALL);
        // Do not use your deafult console handler, use mine
        LOGGER.setUseParentHandlers(false);
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.FINE);
//        consoleHandler.setFormatter(new XMLFormatter());
        consoleHandler.setFormatter(new CustomerFormatter());
        LOGGER.addHandler(consoleHandler);

        try{
            FileHandler fileHandler = new FileHandler("src/main/resources/logFile.log", true);
            fileHandler.setFormatter(new XMLFormatter());
            LOGGER.addHandler(fileHandler);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
