Feature: Page Object Examples

  @AmazonPageObject01
  Scenario: title validation
    Given user search the product "waterbottel" and naviage to the result page
    Then user verify the title

  @AmazonPageObject02
  Scenario: select some specifc product from the search result
    Given user select the product