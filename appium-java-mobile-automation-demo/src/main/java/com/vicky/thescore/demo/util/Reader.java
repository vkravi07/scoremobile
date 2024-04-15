package com.vicky.thescore.demo.util;

import com.vicky.thescore.demo.common.constant.CommonConstants;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class Reader {
    public static String getAppiumConfig(String propertyName) {
        return getPropertyValue("appium.properties", propertyName);
    }

    public static String getDeviceConfig(String propertyName) {
        return getPropertyValue("device.properties", propertyName);
    }

    public static String getEnvironmentConfig(String propertyName) {
        return getPropertyValue(("env/" + CommonConstants.EXECUTION_ENV_NAME + ".properties"), propertyName);
    }

    private static String getPropertyValue(String filename, String propertyName) {
        String propertyValue = null;

        try (InputStream inputStream = Reader.class.getClassLoader().getResourceAsStream(filename)) {
            Properties properties = new Properties();
            properties.load(inputStream);
            propertyValue = properties.getProperty(propertyName);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        return propertyValue;
    }
}
