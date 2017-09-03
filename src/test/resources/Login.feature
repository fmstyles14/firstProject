Feature: Login Functionality Test
  This function will test fuctionality login

  Background: Similar Steps
    Given I am on the home page
@positive
  Scenario: Successful Login with Valid Credentials

    When I enter my "go2automationclass@gmail.com" and "Pass2016"
    And  i click on login button
    Then I am able to login successfully
@nagative
  Scenario Outline: UnSuccessful Login with InValid Credentials

    When I enter my "<username>" and "<password>"
    And  i click on login button
    Then I am Unable to login successfully
    Examples:
      |username                       | password|
      | go2automationclass@gmail.con    | Pass2016|
      | go2automationclass@gmail.com    | Pass201 |
