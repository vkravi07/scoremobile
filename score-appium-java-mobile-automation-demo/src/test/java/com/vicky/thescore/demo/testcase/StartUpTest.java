package com.vicky.thescore.demo.testcase;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;
import org.testng.thread.IThreadWorkerFactory;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

import static com.vicky.thescore.demo.common.constant.StartUpConstants.LEAGUE_NAME;
import static com.vicky.thescore.demo.common.constant.StartUpConstants.TEAM_NAME;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     : Verify that User can NBA from MyLeague, Click on Standings and then back button.
 **/

public class StartUpTest extends BaseTest {
    @Test(description = "Verify that a user can launch the app and navigate to home Screen")
    public void testStartUpFlow() throws InterruptedException {
        screen().getNavigationBarScreen().tapOnGetStarted();
        screen().getStartupScreen().selectLeague(LEAGUE_NAME);
        screen().getStartupScreen().tapOnContinue();
        assertTrue(screen().getStartupScreen().itemSelected(LEAGUE_NAME.split(" ")[0]));
        screen().getStartupScreen().selectTeam(TEAM_NAME);
        screen().getStartupScreen().tapOnContinue();
        screen().getStartupScreen().tapOnDone();
        screen().getStartupScreen().tapOnMaybeLater();
        screen().getStartupScreen().tapOnClosePopUp();

    }

    @Test(description = "Verify that a user can choose League and landed on Chosen league page")
    public void myLeagueAndStandings() throws InterruptedException {
        testStartUpFlow();
        screen().getStartupScreen().tapOnLeagueBtn();
        screen().getStartupScreen().tapOnMyleagues();
        assertTrue(screen().getStartupScreen().pageTitleVerify());
        screen().getStartupScreen().tapOnMyLeaders();
        assertTrue(screen().getStartupScreen().pageTitleVerify());
        screen().getStartupScreen().tapOnBackBtn();
        assertTrue(screen().getStartupScreen().previousPageVerify());

    }

}


