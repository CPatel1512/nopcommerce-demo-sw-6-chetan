#register.feature
#Insideregister.feature create following scenarios
#1. verifyUserShouldNavigateToRegisterPageSuccessfully
#Click on Register Link
#Verify "Register" text
#2.
#verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
#Click on Register Link
#Click on "REGISTER" button
#Verify the error message "First name is required."
#Verify the error message "Last name is required."
#Verify the error message "Email is required."
#Verify the error message "Password is required."
#Verify the error message "Password is required."
#2. verifyThatUserShouldCreateAccountSuccessfully
#Click on Register Link
#Select gender "Female"
#Enter firstname
#Enter lastname
#Select day
#Select month
#Select year
#Enter email
#Enter password
#Enter Confirm Password
#Click on "REGISTER" button
#Verify message "Your registration completed"

@Register
@author_Chetan
Feature: Register


  @smoke
  Scenario: verifyUserShouldNavigateToRegisterPageSuccessfully
    When Click on Register Link
    Then Verify "Register" text
@sanity
  Scenario: verifyThatFirstNameLastNameEmailPasswordAndConfirmPasswordFieldsAreMandatory
    When Click on Register Link
    And Click on "REGISTER" button
    Then Verify the error message "First name is required."
    And Verify the error message "Last name is required."
    And Verify the error message "Email is required."
    And Verify the error message "Password is required."
@sanity @regression
  Scenario Outline: verifyThatUserShouldCreateAccountSuccessfully
    When Click on Register Link
    And Select gender "<gender>"
    And Enter firstname "<firstname>"
    And Enter lastname "<lastname>"
    And Select day "<day>"
    And Select month "<month>"
    And Select year "<year>"
    And Enter email "<email>"
    And Enter password "<password>"
    And Enter Confirm Password "<confirmPassword>"
    And Click on "REGISTER" button
    Then Verify message "Your registration completed"

    Examples:
      | gender | firstname | lastname | day | month   | year | email                | password    | confirmPassword |
      | Female | Janee      | Doe      | 1   | January | 2000 | janeedoe@example.com  | password123 | password123     |
      | Male   | Johne      | Smith    | 15  | June    | 1990 | johnesmith@example.com| password123 | password123     |
      | Female | Alicee     | Johnson  | 20  | March   | 1985 | aliceej@example.com   | pass1234    | pass1234        |

