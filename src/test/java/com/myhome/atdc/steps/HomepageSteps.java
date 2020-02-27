package com.myhome.atdc.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.myhome.atdc.utilities.TestBase.getDriver;

import org.junit.Assert;

import com.myhome.atdc.pages.HomePage;

public class HomepageSteps {

    HomePage homePage = new HomePage(getDriver());

    @Given("I am on homepage")
    public void i_am_on_homepage() {
        homePage.continueToHomepage();
    }

    @Then("I will see link {string}")
    public void i_will_see_link(String link) {
        if (link.equalsIgnoreCase("Browse by Make")) {
            Assert.assertTrue(link + " link not present", homePage.isBrowseByMakeLnkPresent(link));
        } else if (link.equalsIgnoreCase("Browse by Style")) {
            Assert.assertTrue(link + " link not present", homePage.isBrowseByMakeLnkPresent(link));
        } else if (link.equalsIgnoreCase("Advanced Search")) {
            Assert.assertTrue(link + " link not present", homePage.isBrowseByMakeLnkPresent(link));
        }
    }

    @Then("I will see button {string}")
    public void i_will_see_button(String button) {
        if (button.equalsIgnoreCase("Search")) {
            Assert.assertTrue(button + " button not present", homePage.isSearchButtonPresent());
        }
    }

    @Then("I will see dropdown {string}")
    public void i_will_see_dropdown(String button) {
        if (button.equalsIgnoreCase("make")) {
            Assert.assertTrue("Make dropdown not present", homePage.isMakeSelectPresent());
        } else if (button.equalsIgnoreCase("Model")) {
            Assert.assertTrue("Model dropdown  not present", homePage.isModelSelectPresent());
        }
    }
    
}