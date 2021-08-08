package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtils;

public class ProductsPage {

    private static String linkMacbook = "//a[text()='MacBook']";
    private static String btnAddToCart = "//button[@id='button-cart']";
    private static String txtPriceHeading = "(//div[@id='product']//ancestor::div)[5]//ul[2]/li/h2";
    private static String txtProductHeading = "(//div[@id='product']//ancestor::div)[5]//h1";
    private static String txtboxQuantity = "//input[@id='input-quantity']";

    public static void clickProduct(){
        BrowserUtils.clickElement(linkMacbook);
    }

    public static void validatePrice(String expectedPrice){
        BrowserUtils.validateText(txtPriceHeading,expectedPrice);
    }

    public static void validateProduct(String expectedName){
        BrowserUtils.validateText(txtProductHeading,expectedName);
    }

    public static void clickAddToCartButton(){
        BrowserUtils.clickElement(btnAddToCart);
    }

    public static void enterQuantity(String quantity) {
        BrowserUtils.enterText(txtboxQuantity,quantity);
    }
}
