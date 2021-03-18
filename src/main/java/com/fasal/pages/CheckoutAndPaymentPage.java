package com.fasal.pages;

import com.fasal.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import static com.fasal.utils.CommonMethods.waitForElementVisibility;
import static com.fasal.utils.Constants.ORDER_SUCCESS_MESSAGE;

public class CheckoutAndPaymentPage extends BaseClass {
    @FindBy(xpath = "//p[contains(@class, 'cart_navigation')]/a/span")
    private static WebElement proceedToCheckout;

    @FindBy(xpath = "//p[contains(@class, 'cart_navigation')]/button/span")
    private static WebElement proceedToCheckoutFinal;

    @FindBy(className = "checker")
    private static WebElement agreeToTermsAndConditions;

    @FindBy(xpath = "//a[contains(@class, 'bankwire')]")
    private static WebElement payByBankWire;

    @FindBy(xpath = "//p[contains(@id, 'cart_navigation')]/button/span")
    private static WebElement orderConfirmationButton;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/p/strong")
    private static WebElement confirmationSuccessMessage;

    public static void proceedToCheckoutFromReviewPage(){
        waitForElementVisibility(driver, proceedToCheckout);
        proceedToCheckout.click();

        waitForElementVisibility(driver, proceedToCheckoutFinal);
        proceedToCheckoutFinal.click();
    }

    public static void agreeToTermsAndConditions(){
        waitForElementVisibility(driver, agreeToTermsAndConditions);
        agreeToTermsAndConditions.click();

        waitForElementVisibility(driver, proceedToCheckoutFinal);
        proceedToCheckoutFinal.click();
    }

    public static void makePaymentAndConfirmOrder(){
        waitForElementVisibility(driver, payByBankWire);
        payByBankWire.click();

        waitForElementVisibility(driver, orderConfirmationButton);
        orderConfirmationButton.click();
    }

    public static void verifyOrderConfirmed(){
        waitForElementVisibility(driver, confirmationSuccessMessage);
        Assert.assertEquals(confirmationSuccessMessage.getText(), ORDER_SUCCESS_MESSAGE);
    }
}
