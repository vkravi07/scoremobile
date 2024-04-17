package com.vicky.thescore.demo.screen;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
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
    public void tapOnDone(){
        tap(MobileBy.id("com.fivemobile.thescore:id/btn_primary"));
    }
    public void tapOnMaybeLater(){
        tap(MobileBy.id("com.fivemobile.thescore:id/btn_secondary"));
    }
    public void tapOnClosePopUp(){
        tap(MobileBy.id("com.fivemobile.thescore:id/dismiss_modal"));
    }
    public void tapOnLeagueBtn(){
        tap(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/navigation_bar_item_small_label_view\" and @text=\"Leagues\"]"));
    }

    public void tapOnMyleagues(){
        tap(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"NBA\"]"));
        //tap(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"" + leagueName + "\"]"));

    }
//    public void tapOnMyleaguesNba(){
//        tap(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"NBA\"]"));
//        // tap(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/league_name_text\" and @text=\"" + leagueName + "\"]"));

   // }
    public void tapOnMyLeaders(){
        tap(MobileBy.xpath("//android.widget.TextView[@text=\"LEADERS\"]"));
    }
    public void tapOnBackBtn(){
        tap(MobileBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
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
    public boolean pageTitleVerify(){

        return isVerified(MobileBy.xpath(" //android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/titleTextView\"]"),"NBA");

    }

    public boolean previousPageVerify(){

        return isSelected(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.fivemobile.thescore:id/titleTextView\" and @text=\"Leagues\"]"));

    }

    //android.widget.TextView[@resource-id="com.fivemobile.thescore:id/titleTextView" and @text="Leagues"]

}
