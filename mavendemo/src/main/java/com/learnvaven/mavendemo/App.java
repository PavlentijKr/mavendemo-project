package com.learnvaven.mavendemo;

/**
 * Hello world!!!! Test Git
 *
 */

import org.apache.log4j.Logger;

public class App 
{
    final static Logger LOGGER = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        Calculator calc = new Calculator();

        LOGGER.debug(calc.summ(2,5));
        LOGGER.debug(calc.subtract(2,5));
        LOGGER.debug(calc.multiply(2,5));
        LOGGER.debug(calc.divide(2,5));
    }
}
