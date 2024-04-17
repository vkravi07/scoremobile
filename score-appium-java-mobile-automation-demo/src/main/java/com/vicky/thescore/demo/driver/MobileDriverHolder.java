package com.vicky.thescore.demo.driver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

public class MobileDriverHolder {
    private static final ThreadLocal<MobileDriver<MobileElement>> driver = new ThreadLocal<>();

    public static MobileDriver<MobileElement> getDriver() {
        return driver.get();
    }

    public static void setDriver(MobileDriver<MobileElement> driver) {
        MobileDriverHolder.driver.set(driver);
    }



}
