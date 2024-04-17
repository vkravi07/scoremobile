package com.vicky.thescore.demo.testcase;

import com.maxsoft.testngtestresultsanalyzer.DriverHolder;
import com.maxsoft.testngtestresultsanalyzer.TestAnalyzeReportListener;
import com.vicky.thescore.demo.common.ScreenProvider;
import com.vicky.thescore.demo.common.UiComponentProvider;
import com.vicky.thescore.demo.driver.MobileDriverFactory;
import com.vicky.thescore.demo.driver.MobileDriverService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

import static com.vicky.thescore.demo.common.constant.CommonConstants.EXECUTION_ENV_NAME;
import static com.vicky.thescore.demo.common.constant.CommonConstants.MOBILE_PLATFORM_NAME;
import static com.vicky.thescore.demo.driver.MobileDriverHolder.getDriver;
import static com.vicky.thescore.demo.driver.MobileDriverHolder.setDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

@Listeners(TestAnalyzeReportListener.class)
public class BaseTest {

    private final Logger logger = LogManager.getLogger();
    private final MobileDriverService driverService = new MobileDriverFactory().getDriverService();

    public ScreenProvider screen() {
        return new ScreenProvider(getDriver());
    }

    public UiComponentProvider uiComponent() {
        return new UiComponentProvider(getDriver());
    }


    @BeforeSuite
    public void oneTimeSetup() {
        logger.debug("Test execution platform: {}", MOBILE_PLATFORM_NAME);
        logger.debug("Test execution environment: {}", EXECUTION_ENV_NAME);
    }

    @BeforeMethod
    public void openApp() {
        driverService.spinUpDriver();
        setDriver(driverService.getDriver());
        DriverHolder.setDriver(getDriver());    // Setting the driver for the html-reporter library
        getDriver().manage().timeouts().implicitlyWait(30, SECONDS);
    }

    @AfterMethod
    public void closeApp() {
        driverService.closeDriver();
    }
}
