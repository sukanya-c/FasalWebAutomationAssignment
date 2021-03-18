package com.fasal.tests;

import com.fasal.base.BaseClass;
import org.testng.annotations.Test;


import static com.fasal.pages.CheckoutAndPaymentPage.*;
import static com.fasal.pages.HomePage.*;
import static com.fasal.pages.LoginPage.loginToPortal;
import static com.fasal.pages.WomenCataloguePage.*;

public class TestClass extends BaseClass {

    @Test(priority = 1)
    public void verifyLoginIsSuccessful(){
        clickOnSignInButton();
        loginToPortal();
    }

    @Test(priority = 2)
    public void verifyUserIsAbleToApplyFiltersInWomenCategory(){
        hoverOverWomeCategory();
        filterBlousesCategory();
        applyWhiteColorFilter();
        applyLargeSizeFilter();
    }

    @Test(priority = 3)
    public void verifyUserIsAbleToAddProductToCartAndProceedToCheckout(){
        addProductToCart();
        clickOnProceedToCheckout();
        proceedToCheckoutFromReviewPage();
    }

    @Test(priority = 4)
    public void verifyUserIsAbleToAgreeToTermsAndConditions(){
        agreeToTermsAndConditions();
    }

    @Test(priority = 5)
    public void verifyUserIsAbleToMakePayment(){
        makePaymentAndConfirmOrder();
    }

    @Test(priority = 6)
    public void validateOrderIsPlacedSuccessfully(){
        verifyOrderConfirmed();
    }
}
