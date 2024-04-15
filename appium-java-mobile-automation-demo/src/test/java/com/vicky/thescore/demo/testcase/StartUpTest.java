package com.vicky.thescore.demo.testcase;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;

import static com.vicky.thescore.demo.common.constant.StartUpConstants.LEAGUE_NAME;
import static com.vicky.thescore.demo.common.constant.StartUpConstants.TEAM_NAME;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class StartUpTest extends BaseTest {
    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testStartUpFlow() {
        screen().getNavigationBarScreen().tapOnGetStarted();
        screen().getStartupScreen().selectLeague(LEAGUE_NAME);
        screen().getStartupScreen().tapOnContinue();
        assertTrue(screen().getStartupScreen().itemSelected(LEAGUE_NAME.split(" ")[0]));
        //uiComponent().getAlertScreen().accept();
        //uiComponent().getAlertScreen().accept();
        screen().getStartupScreen().selectTeam(TEAM_NAME);
        screen().getStartupScreen().tapOnContinue();
        screen().getStartupScreen().tapOnContinue();

//        assertEquals(
//                uiComponent().getAlertScreen().getAlertTitle(),
//                LOGIN_ALERT.getAlertTitle()
//        );
//        assertEquals(
//                uiComponent().getAlertScreen().getAlertMessage(),
//                LOGIN_ALERT.getAlertMessage()
//        );
    }
}
