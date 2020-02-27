package com.myhome.atdc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhome.atdc.utilities.TestBase;
import com.myhome.atdc.utilities.Wrappers;



public class HomePage extends TestBase
{
    @FindBy(xpath = "//*[@data-qaid='btn-continue']")
    private WebElement continueBtn;

    @FindBy(xpath = "//*[@data-qaid='lnk-browseByMake']")
    private WebElement browseByMakeLnk;

    @FindBy(xpath = "//*[@data-qaid='lnk-browseByStyle']")
    private WebElement browseByStyleLnk;

    @FindBy(xpath = "//*[@data-qaid='adv_srch']")
    private WebElement advSearchLnk;

    @FindBy(xpath = "//*[@data-qaid='btn-srch-hp']")
    private WebElement searchBtn;

    @FindBy(name = "makeCodeListPlaceHolder")
    private WebElement makeSelect;

    @FindBy(name = "modelCodeListPlaceHolder")
    private WebElement modelSelect;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        TestBase.driver = driver;
    }

    public void continueToHomepage() {
        Wrappers.jsClick(continueBtn);
    }

    public boolean isBrowseByMakeLnkPresent(String link) {
        return browseByMakeLnk.isDisplayed();
    }

    public boolean isBrowseByStyleLnkPresent(String link) {
        return browseByStyleLnk.isDisplayed();
    }

    public boolean isAdvSearchLnkPresent(String link) {
        return advSearchLnk.isDisplayed();
    }

    public boolean isSearchButtonPresent() {
        return searchBtn.isDisplayed();
    }

    public boolean isMakeSelectPresent() {
        return makeSelect.isDisplayed();
    }

    public boolean isModelSelectPresent() {
        return modelSelect.isDisplayed();
    }

    public void navigateToAdvSearchLnk() {
        Wrappers.jsClick(advSearchLnk);
    }
}
