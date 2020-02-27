package com.myhome.atdc.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import static com.myhome.atdc.utilities.TestBase.getDriver;

import org.junit.Assert;

import com.myhome.atdc.pages.AdvanceSearchPage;
import com.myhome.atdc.pages.HomePage;

public class AdvanceSearchSteps {

    HomePage homePage = new HomePage(getDriver());
    AdvanceSearchPage advanceSearchPage = new AdvanceSearchPage(getDriver());

    @Given("I click on the link {string}")
    public void i_click_on_the_link(String string) {
        homePage.navigateToAdvSearchLnk();
    }

    @Given("I enter {string} in the {string} textbox")
    public void i_enter_in_the_textbox(String value, String field) {
        if (field.equalsIgnoreCase("Zip code")) {
            advanceSearchPage.enterZipcode(value);
        }
    }

    @Given("I select the {string} checkbox under {string}")
    public void i_select_the_checkbox_under(String checkbox, String field) {
        if (checkbox.equalsIgnoreCase("Certified")) {
            advanceSearchPage.clickCertifiedCondtionCheckbox();
        } else if (checkbox.equalsIgnoreCase("Convertible")) {
            advanceSearchPage.clickConvertibleStyleCheckbox();
        }
    }

    @Given("I select {string} as From year")
    public void i_select_as_From_year(String year) {
        advanceSearchPage.selectFromYear(year);
    }

    @Given("I select {string} as To year")
    public void i_select_as_To_year(String year) {
        advanceSearchPage.selectToYear(year);
    }

    @Given("I select Make as {string} under Make, Model & Trim section")
    public void i_select_Make_as_under_Make_Model_Trim_section(String value) {
        advanceSearchPage.selectMakeFilter0(value);
    }

    @Given("I click the button {string} at the bottom of the page")
    public void i_click_the_button_at_the_bottom_of_the_page(String string) {
        advanceSearchPage.search();
    }

    @Then("I will see some results in the next page")
    public void i_will_see_some_results_in_the_next_page() {
        System.out.println("Total number of result are :" + advanceSearchPage.getSearchResultValues().size());
    }

    @Then("I will see only {string} cars in the results page")
    public void i_will_see_only_cars_in_the_results_page(String value) {
        for (String txt : advanceSearchPage.getSearchResultValues()) {
            Assert.assertTrue("All results are not " + value, txt.contains(value));
        }
    }

    @Then("I will see total search result {string} in the results page")
    public void i_will_see_total_search_result_in_the_results_page(String value) {
        Assert.assertTrue("Total search result count is not as expected", advanceSearchPage.getTotalSearchResultCount().equals(value));
    }
}