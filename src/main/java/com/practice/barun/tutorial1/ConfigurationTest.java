package com.practice.barun.tutorial1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

public class ConfigurationTest {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ConfigurationTest.class);

        String fileName = System.getProperty("user.dir") + "/config.properties";
        Properties properties = new Properties();
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
        } catch (FileNotFoundException ex) {
            logger.error("Exception found ", ex);
        }
        try {
            properties.load(is);
        } catch (IOException ex) {
            logger.error("Exception found ", ex);
        }

        System.out.println(properties.getProperty("consumerKey"));


        System.out.println(System.getProperty("user.dir"));
    }
}
