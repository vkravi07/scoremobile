package com.vicky.thescore.demo.screen;

import com.aventstack.extentreports.ExtentTest;
import io.appium.java_client.MobileBy;
import lombok.extern.flogger.Flogger;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnGetStarted() {
        tap(MobileBy.id("com.fivemobile.thescore:id/action_button_text"));
       // ExtentTest.c
    }
}
