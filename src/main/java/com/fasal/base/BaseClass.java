package com.fasal.base;

import com.fasal.pages.CheckoutAndPaymentPage;
import com.fasal.pages.HomePage;
import com.fasal.pages.LoginPage;
import com.fasal.pages.WomenCataloguePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import static com.fasal.utils.Constants.*;

public class BaseClass {
    public static WebDriver driver;

    /**
     * This method sets the gecko driver path and loads the app url
     */
    @BeforeClass
    public void setUp() {
        System.setProperty(GECKO_PROPERTY, GECKO_DRIVER_PATH);
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get(BASE_URL);
        initPageObjects();
    }

    /**
     * close all instance of open browsers
     */
    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    /**
     * This method initializes all the page object class and is invoked in before class
     */
    public static void initPageObjects(){
        PageFactory.initElements(driver, HomePage.class);
        PageFactory.initElements(driver, LoginPage.class);
        PageFactory.initElements(driver, WomenCataloguePage.class);
        PageFactory.initElements(driver, CheckoutAndPaymentPage.class);
    }
}
