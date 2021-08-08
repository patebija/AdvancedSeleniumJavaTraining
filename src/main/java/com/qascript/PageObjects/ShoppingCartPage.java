package com.qascript.PageObjects;

import com.qascript.Utils.BrowserUtils;

public class ShoppingCartPage {

    private static String btnCheckout = "//a[text()='Checkout']";
    private static String btnContinueShopping = "//a[text()='Continue Shopping']";
    private static String linkProduct = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[2]/a";
    private static String txtboxQuantity = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[4]//input";
    private static String txtPrice = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[5]";
    private static String txtTotalPrice = "(//div[@id='content']//table)[1]//tbody//tr[1]/td[6]";

    public static void clickCheckout(){
        BrowserUtils.clickElement(btnCheckout);
    }

    public static void clickContinueShopping(){
        BrowserUtils.clickElement(btnContinueShopping);
    }

    public static void validateProductName(String expectedProductName){
        BrowserUtils.validateText(linkProduct,expectedProductName);
    }

    public static void validateProductQuantity(String expectedQuantity){
         BrowserUtils.validateValue(txtboxQuantity,expectedQuantity,"value");
    }

    public static void validateProductPrice(String expectedProductPrice){
        BrowserUtils.validateText(txtPrice,expectedProductPrice);
    }

    public static void validateProductTotalPrice(String expectedProductPrice,String quantity){
        int totalProductPrice = Integer.parseInt(expectedProductPrice) * Integer.parseInt(quantity);
        BrowserUtils.validateText(txtTotalPrice,String.valueOf(totalProductPrice));
    }

}
