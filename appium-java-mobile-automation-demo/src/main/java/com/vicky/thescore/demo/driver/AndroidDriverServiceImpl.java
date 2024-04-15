package com.vicky.thescore.demo.driver;

import com.vicky.thescore.demo.common.constant.DriverConstants;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.remote.AndroidMobileCapabilityType.APP_PACKAGE;
import static io.appium.java_client.remote.MobileCapabilityType.*;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class AndroidDriverServiceImpl implements MobileDriverService {
    private AndroidDriver<MobileElement> androidDriver;

    @Override
    public void spinUpDriver() {
        final DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(DEVICE_NAME, DriverConstants.ANDROID_DEVICE_NAME);
        capabilities.setCapability(AUTOMATION_NAME, DriverConstants.ANDROID_AUTOMATION_NAME);
        capabilities.setCapability(PLATFORM_NAME, DriverConstants.ANDROID);
        capabilities.setCapability(PLATFORM_VERSION, DriverConstants.ANDROID_PLATFORM_VERSION);
        capabilities.setCapability(APP, new File(DriverConstants.ANDROID_APP_FILE_PATH).getAbsolutePath());
        capabilities.setCapability(APP_PACKAGE, DriverConstants.ANDROID_APP_PACKAGE);
        capabilities.setCapability(NO_RESET, DriverConstants.ANDROID_NO_RESET);
        capabilities.setCapability(FULL_RESET, DriverConstants.ANDROID_FULL_RESET);

        try {
            androidDriver = new AndroidDriver<>(new URL(DriverConstants.APPIUM_URL), capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        androidDriver.manage().timeouts().implicitlyWait(DriverConstants.APPIUM_DRIVER_TIMEOUT_IN_SECONDS, SECONDS);
    }

    @Override
    public void closeDriver() {
        String appId = (String) androidDriver
                .getCapabilities()
                .getCapability(APP_PACKAGE);
        if (appId != null)
            androidDriver.terminateApp(appId);
    }

    public MobileDriver<MobileElement> getDriver() {
        return androidDriver;
    }
}
