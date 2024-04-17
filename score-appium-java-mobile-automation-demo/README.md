# Mobile Application Automation Using Appium & TestNG For Android Applications

This project serves as a boilerplate for automating Android applications using a single codebase with TestNG and the Appium library. 

Appium Java Android Application Automation

## Prerequisites
1. Java
2. Maven
3. NodeJS

## How to install the dependencies
1. Download and Install [Android Studio](https://developer.android.com/codelabs/basic-android-kotlin-compose-install-android-studio "Android Studio")
2. Create a new system variable for `ANDROID_HOME` pointed to the Android SDK location
3. Update the system path variable with `ANDROID_HOME\platform-tools`
4. Install Appium 2.0

   `npm i -g appium@latest`

5Install Appium Drivers 

    `appium driver install uiautomator2`

Note: Environment Variables

![image](https://user-images.githubusercontent.com/9147189/249979741-757ff724-a75e-4d3b-934f-e6af73d630e2.png)

## How to run tests
1. Using IntelliJ IDEA
   * Go to Maven Profiles
   * Select `android` Maven Profile as the platform
   * Select `dev` as the environment
   * Select the test classes on the `src/test/java` folder
   * Right-click and click on `Run`


2. Using Command Line
   * To run the smoke test suite in Android against the QA environment

     `mvn clean test -Pandroid,dev,suite-run`
