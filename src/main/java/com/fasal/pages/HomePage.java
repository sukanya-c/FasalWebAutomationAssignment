package com.fasal.pages;

import com.fasal.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.fasal.utils.CommonMethods.waitForElementVisibility;

public class HomePage extends BaseClass {
    @FindBy(className = "login")
    private static WebElement loginButton;

    @FindBy(xpath = "//a[text()='Women']")
    private static WebElement womenCategory;

    @FindBy(xpath = "//a[text()='Blouses']")
    private static WebElement blousesCategory;

    public static void clickOnSignInButton(){
        waitForElementVisibility(driver, loginButton);
        loginButton.click();
    }

    public static void hoverOverWomeCategory(){
        Actions actions = new Actions(driver);
        waitForElementVisibility(driver, womenCategory);
        actions.moveToElement(womenCategory).perform();
    }

    public static void filterBlousesCategory(){
        waitForElementVisibility(driver, blousesCategory);
        blousesCategory.click();
    }
}
