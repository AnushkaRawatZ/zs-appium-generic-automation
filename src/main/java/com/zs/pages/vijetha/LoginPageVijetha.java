package com.zs.pages.vijetha;

import com.zs.locators.VijethaLocators;
import com.zs.utils.LoggerUtil;
import io.appium.java_client.android.AndroidDriver;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageVijetha {

    public static Logger logger= LoggerUtil.getLogger();
    public static AndroidDriver driver;
    public static WebDriverWait wait;

    public LoginPageVijetha(AndroidDriver driver, WebDriverWait wait){
        LoginPageVijetha.driver =driver;
        LoginPageVijetha.wait=wait;
    }

    public static void clickOnLoginWPass(String appName){
        By logInWPassLoc= VijethaLocators.getLoginLocator("logInWithPasswordLinkText");
        WebElement logInWPass= wait.until(ExpectedConditions.elementToBeClickable(logInWPassLoc));
        logInWPass.click();
        logger.info("Clicked on login with password for {}", appName);
    }

    public static void clickOnAllowAccess(String appName){
        By allowLocationAccessBtnLoc= VijethaLocators.getHomePageLocator("allowLocationAccessBtn");
        WebElement allowBtn=wait.until(ExpectedConditions.elementToBeClickable(allowLocationAccessBtnLoc));
        allowBtn.click();
        logger.info("Clicked on allow location access for {}", appName);
    }
}