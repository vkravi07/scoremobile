package com.vicky.thescore.demo.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

public class AlertScreen extends BaseScreen {
    private final String alertText;

    public AlertScreen(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.alertIsPresent());
        alertText = driver.switchTo().alert().getText();
    }

    public void accept(){
        driver.switchTo().alert().accept();
    }

    public void dismiss(){
        driver.switchTo().alert().dismiss();
    }

    public String getAlertTitle() {
        return alertText.split("\n")[0];
    }

    public String getAlertMessage() {
        return alertText.split("\n")[1];
    }
}
