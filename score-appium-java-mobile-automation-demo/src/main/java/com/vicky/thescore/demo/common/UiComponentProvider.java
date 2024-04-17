package com.vicky.thescore.demo.common;

import com.vicky.thescore.demo.screen.BaseScreen;
import org.openqa.selenium.WebDriver;
import com.vicky.thescore.demo.screen.AlertScreen;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

public class UiComponentProvider extends BaseScreen {
    public UiComponentProvider(WebDriver driver) {
        super(driver);
    }

    public AlertScreen getAlertScreen() {
        return new AlertScreen(driver);
    }
}
