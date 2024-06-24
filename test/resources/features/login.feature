#loginpage.feature
#Inside loginpage.feature create following scenarios
#1.userShouldNavigateToLoginPageSuccessFully.
#Click on login link
#verify that "Welcome, Please Sign In!" message display
#2. verifyTheErrorMessageWithInValidCredentials.
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Verify that the Error message
#3. verifyThatUserShouldLogInSuccessFullyWithValidCredentials.
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Verify that LogOut link is display
#4. VerifyThatUserShouldLogOutSuccessFully
#Click on login link
#Enter EmailId
#Enter Password
#Click on Login Button
#Click on LogOut Link
#Verify that LogIn Link Display


Feature: Login Feature
  In Order to perform successful login
  As a User
  I have to enter correct username and password

  @author_chetan @smoke

  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

@smoke @sanity
  Scenario: User should log in successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "prime123@gmail.com"
    And I enter password "Prime123"
    And I click on login button
    Then I should login successfully
@regression
  Scenario Outline: Verify the error message with invalid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "<email>"
    And I enter password "<password>"
    And I click on login button
    Then I should see the error message "<errorMessage>"
    Examples:
      | email              | password | errorMessage                                                                                |
      | abcd123@gmail.com  | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | xyz123@gmail.com   | abc123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
      | adfafasd@gmail.com | xyz123   | Login was unsuccessful. Please correct the errors and try again.\nNo customer account found |
@regression
  Scenario: VerifyThatUserShouldLogOutSuccessFully
    When Click on login link
    And Enter EmailId "prime123@gmail.com"
    And Enter Password "Prime123"
    And Click on Login Button
    And Click on LogOut Link
    Then Verify that LogIn Link Display