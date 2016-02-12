Feature File :minimum test for search.

  @minimumtest
  Feature: Very Basic minimal Test Search of link.springer.com

  Scenario: Search Items with results
    Given I am on the ‘http://link.springer.com’ site
    When I search for Items containing ‘Chemistry’
    Then I can see a list of search results relating to ‘Chemistry’

  Scenario: Search with no results
    Given I am on the ‘http://link.springer.com’ site
    When I search for Items containing ‘Womball’
    Then I should not see any results
