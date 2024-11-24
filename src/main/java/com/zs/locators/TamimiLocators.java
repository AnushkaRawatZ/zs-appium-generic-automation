package com.zs.locators;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;
/**
 * The TamimiLocators class contains static mappings of locators used in the Tamimi application.
 * These locators are organized by the page or functionality they belong to, such as login page, home page, profile, product page, and others.
 * This class also provides methods to retrieve locators for different pages of the Tamimi app based on a given locator name.
 */
public class TamimiLocators {

    public static final Map<String, By> loginLocators = new HashMap<>();
    public static final Map<String,By> homePageLocators=new HashMap<>();
    public static final Map<String, By> drawerLocators=new HashMap<>();
    public static final Map<String, By> stagingUrlLocators=new HashMap<>();
    public static final Map<String,By> profileLocators=new HashMap<>();
    public static final Map<String,By> productPageLocators =new HashMap<>();
    public static final Map<String, By> menuLocators=new HashMap<>();
    public static final Map<String, By> cartLocators= new HashMap<>();
    public static final Map<String, By> deliveryTypeDrawerLocators=new HashMap<>();

    static {


        //login page locators
        loginLocators.put("profileIcon", By.id("com.zopsmart.stg.scarlet:id/account"));
        loginLocators.put("enterEmailOrPhoneTextBox", By.id("com.zopsmart.stg.scarlet:id/et_username"));
        loginLocators.put("enterPassTextBox", By.id("com.zopsmart.stg.scarlet:id/et_password"));
        loginLocators.put("loginBtn", By.id("com.zopsmart.stg.scarlet:id/button3"));


        //home page locators
        homePageLocators.put("headerLogo", By.id("com.zopsmart.stg.scarlet:id/logo"));
        homePageLocators.put("drawerIcon", By.xpath("//android.widget.ImageButton[@content-desc='Open navigation drawer']"));
        homePageLocators.put("productCategory1", By.xpath("(//android.widget.ImageView[@resource-id='com.zopsmart.stg.scarlet:id/iv_category'])[3]"));

        //drawer locators
        drawerLocators.put("versionText", By.xpath("//android.widget.FrameLayout[@content-desc='Cart']/android.widget.FrameLayout[1]"));
        drawerLocators.put("appUrl", By.id("com.zopsmart.scarlet:id/et_store_url"));
        drawerLocators.put("applyBtn", By.id("com.zopsmart.scarlet:id/btn_apply"));
        drawerLocators.put("okBtn", By.xpath("//android.widget.Button[@resource-id='android:id/button1']"));

        //profile locators
        profileLocators.put("username", By.id("com.zopsmart.stg.scarlet:id/tv_name"));

        //products page locators
        productPageLocators.put("product", By.xpath("(//android.widget.ImageView[@resource-id='com.zopsmart.stg.scarlet:id/iv_item_image'])[1]"));
        productPageLocators.put("productLabel", By.id("com.zopsmart.stg.scarlet:id/tv_item_name"));
        productPageLocators.put("addToCartBtn", By.id("com.zopsmart.stg.scarlet:id/ib_add"));

        //bottom menu locators
        menuLocators.put("cartBtn", By.xpath("//android.widget.FrameLayout[@content-desc='Cart']/android.widget.FrameLayout[4]"));
        menuLocators.put("homeBtn", By.id("com.zopsmart.stg.scarlet:id/home"));

        //cart locators
        cartLocators.put("productInCartLabel", By.id("com.zopsmart.stg.scarlet:id/tv_item_name"));

        //delivery-type drawer locators
        deliveryTypeDrawerLocators.put("clickAndCollect", By.xpath("//androidx.viewpager.widget.ViewPager[@resource-id='com.zopsmart.stg.scarlet:id/containerViewPager']/android.widget.ImageView"));
        deliveryTypeDrawerLocators.put("city", By.xpath("(//android.widget.FrameLayout[@resource-id='com.zopsmart.stg.scarlet:id/cv_city'])[1]"));
        deliveryTypeDrawerLocators.put("store", By.xpath("//androidx.recyclerview.widget.RecyclerView[@resource-id='com.zopsmart.stg.scarlet:id/epoxy_stores']") );
    }


    /**
     * Retrieves the login page locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getLoginLocator(String locatorName) {
        return loginLocators.get(locatorName);
    }
    /**
     * Retrieves the home page locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getHomePageLocator(String locatorName) {
        return homePageLocators.get(locatorName);
    }
    /**
     * Retrieves the drawer locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getDrawerLocators(String locatorName){
        return drawerLocators.get(locatorName);
    }
    /**
     * Retrieves the profile page locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getProfileLocators(String locatorName){
        return profileLocators.get(locatorName);
    }
    /**
     * Retrieves the product page locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getProductPageLocators(String locatorName){
        return productPageLocators.get(locatorName);
    }
    /**
     * Retrieves the menu locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getMenuLocators(String locatorName){
        return menuLocators.get(locatorName);
    }
    /**
     * Retrieves the cart page locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getCartLocators(String locatorName){
        return cartLocators.get(locatorName);
    }
    /**
     * Retrieves the delivery type drawer locator by its name.
     *
     * @param locatorName The name of the locator to fetch.
     * @return The locator corresponding to the provided name.
     */
    public static By getDeliveryTypeDrawerLocators(String locatorName){
        return deliveryTypeDrawerLocators.get(locatorName);
    }

}

