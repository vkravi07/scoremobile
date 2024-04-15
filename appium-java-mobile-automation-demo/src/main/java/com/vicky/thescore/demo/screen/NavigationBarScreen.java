package com.vicky.thescore.demo.screen;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnGetStarted() {
//        tap(MobileBy.AccessibilityId("com.fivemobile.thescore:id/action_button_text"));
        tap(MobileBy.id("com.fivemobile.thescore:id/action_button_text"));
    }
}
