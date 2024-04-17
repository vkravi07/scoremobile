package com.vicky.thescore.demo.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Project Name    : appium-java-mobile-automation-demo
 * Developer       : Viknesh
 * Version         : 1.0.0
 * Description     :
 **/

public class BaseScreen {
    public final WebDriver driver;
    public final WebDriverWait wait;

    public BaseScreen(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 30);
    }

    public void waitUntilElementVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void waitUntilAllElementsVisible(By by) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    public void tap(By by) {
        waitUntilElementVisible(by);
        driver.findElement(by).click();
    }
    public void mouseMoveTap(By by){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(by);

        action.moveToElement(element).doubleClick();
    }
    public void tapText(By by, String text){
        waitUntilAllElementsVisible(by);
        List<WebElement> elements = driver.findElements(by);
        for(WebElement element: elements){
            String elementText = element.getText();
            if (elementText.equalsIgnoreCase(text)){
                element.click();
                break;
            }
        }
    }

    public void inputText(By by, String text) {
        waitUntilElementVisible(by);
        driver.findElement(by).sendKeys(text);
    }

    public boolean isSelected(By by){
        waitUntilElementVisible(by);
        try{
            driver.findElement(by).isDisplayed();
            return true;
        }catch (ElementNotSelectableException e){
            return false;
        }



    }
    public boolean isVerified(By by,String name){
        waitUntilElementVisible(by);
        String verifyTitle = driver.findElement(by).getText();
        if (verifyTitle.equalsIgnoreCase(name)) {
            return true;
        }
        else {
            return false;
        }



    }
}
