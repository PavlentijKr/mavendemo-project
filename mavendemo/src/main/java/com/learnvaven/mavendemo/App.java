package com.learnvaven.mavendemo;

/**
 * Hello world!
 *
 */

import org.apache.log4j.Logger;

public class App 
{
    final static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args )
    {
        Calculator calc = new Calculator();

        logger.debug(calc.summ(2,5));
        logger.debug(calc.subtract(2,5));
        logger.debug(calc.multiply(2,5));
        logger.debug(calc.divide(2,5));
    }
}
