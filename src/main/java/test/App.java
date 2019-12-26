package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App
{
    private static Logger logger = LogManager.getLogger();
    public static void main( String[] args )
    {
        logger.trace("logger trace");
        logger.debug("logger debug");
        logger.info("ilk logger");
        logger.warn("logger warn");
        logger.error("logger error");
        logger.fatal("logger fatal");

        //log();

    }

    public static void log(){
        logger.info("başarılı bir şekilde eklendı");
    }
}
