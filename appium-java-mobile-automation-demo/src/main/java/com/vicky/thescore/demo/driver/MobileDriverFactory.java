package com.vicky.thescore.demo.driver;

import com.vicky.thescore.demo.common.constant.CommonConstants;
import com.vicky.thescore.demo.common.constant.DriverConstants;

import java.security.InvalidParameterException;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class MobileDriverFactory {
    public MobileDriverService getDriverService() {
        MobileDriverService driver;

        if (CommonConstants.MOBILE_PLATFORM_NAME.equals(DriverConstants.ANDROID)) {
            driver = new AndroidDriverServiceImpl();
        } else {
            throw new InvalidParameterException("Please use platform as '" + DriverConstants.ANDROID + "'");
        }

        return driver;
    }
}
