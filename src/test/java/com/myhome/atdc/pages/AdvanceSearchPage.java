package com.myhome.atdc.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myhome.atdc.utilities.TestBase;
import com.myhome.atdc.utilities.Wrappers;

import java.util.ArrayList;
import java.util.List;

public class AdvanceSearchPage extends TestBase {

    @FindBy(id = "zipundefined")
    private WebElement zipcodeInput;

    @FindBy(xpath = "//*[text()='Certified']")
    private WebElement certifiedCondtionCheckbox;

    @FindBy(xpath = "//*[@value='CONVERT']")
    private WebElement convertibleStyleCheckbox;

    @FindBy(name = "startYear")
    private WebElement startYearSelect;

    @FindBy(name = "endYear")
    private WebElement endYearSelect;

    @FindBy(name = "makeFilter0")
    private WebElement makeFilter0Select;

    @FindBy(xpath = "//*[@data-qaid='btn-search']")
    private WebElement searchBtn;

    @FindBy(xpath = "//div[contains(@class,'results-text-container')]")
    private WebElement searchResultsCount;

    @FindBy(xpath = "//*[@data-cmp='subheading']")
    private List<WebElement> searchResults;

    public AdvanceSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
       TestBase.driver = driver;
    }

    public void enterZipcode(String value) {
        zipcodeInput.sendKeys(value);
    }

    public void clickCertifiedCondtionCheckbox() {
        certifiedCondtionCheckbox.click();
    }

    public void clickConvertibleStyleCheckbox() {
        convertibleStyleCheckbox.click();
    }

    public void selectFromYear(String value) {
        Wrappers.selectByVisibleText(startYearSelect, value);
    }

    public void selectToYear(String value) {
        Wrappers.selectByVisibleText(endYearSelect, value);
    }

    public void selectMakeFilter0(String value) {
        Wrappers.selectByVisibleText(makeFilter0Select, value);
    }

    public void search() {
        searchBtn.click();
    }

    public List<String> getSearchResultValues() {
        List<String> searchResultValues = new ArrayList<>();
        for (WebElement ele : searchResults) {
            searchResultValues.add(ele.getText());
        }
        return searchResultValues;
    }

    public String getTotalSearchResultCount() {
        return searchResultsCount.getText().split(" ")[2];
    }

}
