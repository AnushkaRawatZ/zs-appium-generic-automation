package com.zs.pages.common;

import com.zs.constants.Constants;
import com.zs.utils.CommonUtils;
import com.zs.utils.LoggerUtil;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class CartPage {
    private static final Logger logger= LoggerUtil.getLogger();
    private final AndroidDriver driver;
    private final WebDriverWait wait;

    /**
     * Constructor for LoginPage
     *
     * @param driver AndroidDriver instance to interact with the app.
     * @param wait WebDriverWait instance to wait for elements.
     */
    public CartPage(AndroidDriver driver, WebDriverWait wait){
        this.driver =driver;
        this.wait=wait;
    }

    /**
     * Increases the quantity of the item in cart.
     * @param appName The name of the application under test.
     */
    public void tapAndIncreaseQuantityOfItem(String appName){
        wait.until(ExpectedConditions.elementToBeClickable(CommonUtils.getCartLocators(appName,"quantityBtn"))).click();
        driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        driver.pressKey(new KeyEvent(AndroidKey.DPAD_DOWN));
        wait.until(ExpectedConditions.elementToBeClickable(CommonUtils.getCartLocators(appName, "okayQuantityBtn"))).click();
        LoggerUtil.logInfo("Increased quantity of Product in cart");
    }

    /**
     * Fetches the quantity of an item in cart.
     * @param appName The name of the application under test.
     * @return The quantity of an item in cart.
     */
    public String verifyQuantity(String appName){
        LoggerUtil.logInfo("Fetching the quantity of item in cart.");
        return wait.until(ExpectedConditions.elementToBeClickable(CommonUtils.getCartLocators(appName,"quantityItem1"))).getText();
    }


    /**
     * Clicks on check out button.
     * @param appName The name of the application under test.
     */
    public void clickOnCheckoutBtn(String appName){
        wait.until(ExpectedConditions.elementToBeClickable(CommonUtils.getCartLocators(appName,"checkOutBtn"))).click();
        LoggerUtil.logInfo("Clicked on checkout button");
    }

}
