package com.myhome.atdc.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

public class Wrappers extends TestBase {

    public static void selectByVisibleText(WebElement eleDropdown, final String value) {
        Select select = new Select(eleDropdown);
        select.selectByVisibleText(value);
    }
    
    public static void jsClick(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", element);
    }    

}
