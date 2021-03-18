package com.fasal.pages;

import com.fasal.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static com.fasal.utils.CommonMethods.waitForElementVisibility;
import static com.fasal.utils.Constants.SELECT_SIZE_L;

public class WomenCataloguePage extends BaseClass {
    @FindBy(xpath = "//*[@id='color_8']")
    private static WebElement selectWhiteColor;

    @FindBy(xpath = "//*[@id='group_1']")
    private static WebElement selectSizeLarge;

    @FindBy(xpath = "//p[@id='add_to_cart']//span[.='Add to cart']")
    private static WebElement addToCart;

    @FindBy(xpath = "//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")
    private static WebElement proceedToCheckoput;

    public static void applyWhiteColorFilter(){
        waitForElementVisibility(driver, selectWhiteColor);
        selectWhiteColor.click();
    }

    public static void applyLargeSizeFilter(){
        Select oSelect=new Select(selectSizeLarge);
        oSelect.selectByVisibleText(SELECT_SIZE_L);
    }

    public static void addProductToCart(){
        waitForElementVisibility(driver, addToCart);
        addToCart.click();
    }

    public static void clickOnProceedToCheckout(){
        waitForElementVisibility(driver, proceedToCheckoput);
        proceedToCheckoput.click();
    }
}
