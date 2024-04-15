package com.vicky.thescore.demo.common.constant;

import static com.vicky.thescore.demo.util.Reader.getEnvironmentConfig;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Vickey
 * Version         : 1.0.0
 * Description     :
 **/

public class StartUpConstants {
    public static final String LEAGUE_NAME = getEnvironmentConfig("league_name");
    public static final String TEAM_NAME = getEnvironmentConfig("team_name");
}
