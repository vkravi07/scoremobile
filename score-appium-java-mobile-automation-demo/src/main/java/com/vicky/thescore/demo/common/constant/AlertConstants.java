package com.vicky.thescore.demo.common.constant;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

public enum AlertConstants {

    GLOBAL_LOCATION_ALERT("Tailored Content", "Allow Location"),
    DEVICE_LOCATION_ALERT("the score app device location", "While using the app"),
    APP_NOTIFICATION_ALERT("the score app notification", "Don't allow");

    private final String alertTitle, alertMessage;

    AlertConstants(String alertTitle, String alertMessage) {
        this.alertTitle = alertTitle;
        this.alertMessage = alertMessage;
    }

    public String getAlertTitle() {
        return alertTitle;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}
