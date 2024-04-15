package com.vicky.thescore.demo.driver;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public interface MobileDriverService {
    void spinUpDriver();

    void closeDriver();

    MobileDriver<MobileElement> getDriver();
}
