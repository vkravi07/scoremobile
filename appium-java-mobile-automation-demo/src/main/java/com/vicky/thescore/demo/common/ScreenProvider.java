package com.vicky.thescore.demo.common;

import com.vicky.thescore.demo.screen.BaseScreen;
import com.vicky.thescore.demo.screen.NavigationBarScreen;
import com.vicky.thescore.demo.screen.StartUpScreen;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class ScreenProvider extends BaseScreen {
    public ScreenProvider(WebDriver driver) {
        super(driver);
    }

    public NavigationBarScreen getNavigationBarScreen() {
        return new NavigationBarScreen(driver);
    }

    public StartUpScreen getStartupScreen() {
        return new StartUpScreen(driver);
    }
}
