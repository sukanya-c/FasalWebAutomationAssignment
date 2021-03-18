package com.fasal.pages;

import com.fasal.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.fasal.utils.CommonMethods.waitForElementVisibility;
import static com.fasal.utils.Constants.USER_EMAIL;
import static com.fasal.utils.Constants.USER_PASSWORD;

public class LoginPage extends BaseClass {
    @FindBy(id = "email")
    private static WebElement emailField;

    @FindBy(id = "passwd")
    private static WebElement passwordField;

    @FindBy(id = "SubmitLogin")
    private static WebElement signInButton;

    public static void loginToPortal(){
        waitForElementVisibility(driver, emailField);
        emailField.clear();
        emailField.sendKeys(USER_EMAIL);
        waitForElementVisibility(driver, passwordField);
        passwordField.clear();
        passwordField.sendKeys(USER_PASSWORD);
        waitForElementVisibility(driver, signInButton);
        signInButton.click();
    }
}
