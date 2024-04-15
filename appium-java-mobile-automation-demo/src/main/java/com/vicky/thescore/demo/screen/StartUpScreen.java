package com.vicky.thescore.demo.screen;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class StartUpScreen extends BaseScreen {
    public StartUpScreen(WebDriver driver) {
        super(driver);
    }

    public StartUpScreen tapOnContinue() {
//        tap(MobileBy.AccessibilityId("com.fivemobile.thescore:id/action_button_text"));
        tap(MobileBy.id("com.fivemobile.thescore:id/action_button_text"));
        return this;
    }

    public void selectLeague(String leagueName) {
//        tapText(MobileBy.AccessibilityId("com.fivemobile.thescore:id/txt_name"), leagueName);
        tapText(MobileBy.id("com.fivemobile.thescore:id/txt_name"), leagueName);
    }

    public void selectTeam(String teamName) {
//        tapText(MobileBy.AccessibilityId("com.fivemobile.thescore:id/txt_name"), teamName);
        tapText(MobileBy.id("com.fivemobile.thescore:id/txt_name"), teamName);
    }

    public boolean itemSelected(String name){
        String theySay = "com.fivemobile.thescore:id/label";
        String quoted1 = "\"" + theySay + "\"";
        String quoted2 =  "\"" + name + "\"";
        return isSelected(MobileBy.xpath("//android.widget.TextView[@resource-id=" + quoted1 + " and @text=" + quoted2 + "]"));
    }

}
