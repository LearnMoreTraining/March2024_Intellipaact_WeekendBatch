Feature: Homepage validations

  #before
  @amazon01  @abc
  Scenario: Search function
    #beforestep
    When user enter the product name "iphone"
    #afterstep
    #beforestep
    Then user validate the title
    #afterstep
   #after

   @Amazon02 @abc
  Scenario Outline: multiple test
    When user enter the product name "<product name>"
    Then user validate the title
    Examples:
      | product name |
      | iphone       |
      | mouse        |
      | keyboard     |

     @staticDrop
    Scenario: validate the static dropdown
      When user select the required value from the category dropdown

#before Annotation

    @mouseaction
    Scenario: Page navigation validation
      Given user clicks on baby wishlist
      Then user validates the title of the page

      @draganddrop
    Scenario: drag and drop
      Given user perform drag and drop opeartion



