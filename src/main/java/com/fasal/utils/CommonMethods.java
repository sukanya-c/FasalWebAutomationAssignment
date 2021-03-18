package com.fasal.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

    /**
     * Wait dynamically for element to load on page
     * @param driver
     * @param element
     */
    public static void waitForElementVisibility(WebDriver driver, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
}
