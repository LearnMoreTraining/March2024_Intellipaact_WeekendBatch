Feature: sales

  @smoke
  Scenario Outline: error message
    Given user navigates to salesforce login page
    When user enter the username "<user name>" and password "<pw>"
    Examples:
      | user name | pw  |
      | abc       | 123 |
      | xyz       | cvx |

   @css
   Scenario:  handle with css selector
     Given user enters the username and password

