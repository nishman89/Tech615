Feature: Postcode Lookup
  As a user of the postcode API
  I want to look up postcode information
  So that I can get location details for any UK postcode

  @Happy
  Scenario: Look up a valid London postcode
    Given I am using the postcodes API with the base path is set to "/postcodes/"
    When I look up the postcode "EC2Y5AS"
    Then I should get a 200 response code
      And the returned postcode should be "EC2Y 5AS"
      And the region should be "London"