package com.fasal.utils;

import java.io.File;

public class Constants {
    //To prevent object creation for this class
    private Constants() {}

    public static final String BASE_URL = "http://automationpractice.com";
    public static final String GECKO_PROPERTY = "webdriver.gecko.driver";
    public static final String GECKO_DRIVER_PATH = System.getProperty("user.dir") + File.separator + "driver" + File.separator + "geckodriver";
    public static final String USER_EMAIL = "fasaluiautomation@test.com";
    public static final String USER_PASSWORD = "Testing@123";
    public static final String SELECT_SIZE_L = "L";
    public static final String ORDER_SUCCESS_MESSAGE = "Your order on My Store is complete.";
}
