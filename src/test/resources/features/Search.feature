Feature: Search

Background: I am on HomePage

   @smoke
   Scenario: Verify homepage
    Then I will see link "Browse by Make"
    And I will see link "Browse by Style"
    And I will see link "Advanced Search"
    And I will see button "Search"
    And I will see dropdown "Make"
    And I will see dropdown "Model"
    
  @smoke
  Scenario: Verify Advance Search
    And I click on the link "Advanced Search"
    And I enter "30004" in the "Zip code" textbox
    And I select the "Certified" checkbox under "Condition"
    And I select the "Convertible" checkbox under "Style"
    And I select "2017" as From year
    And I select "2020" as To year
    And I select Make as "BMW" under Make, Model & Trim section
    And I click the button "Search" at the bottom of the page
    Then I will see some results in the next page
    And I will see only "BMW" cars in the results page
    And I will see total search result "14" in the results page    

            
