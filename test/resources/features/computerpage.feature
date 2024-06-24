#3. computerpage.feature
#Inside computerpage.feature create following scenarios
#1. verifyUserShouldNavigateToComputerPageSuccessfully
#Click on Computer tab
#Verify "Computer" text
#2. verifyUserShouldNavigateToDesktopsPageSuccessfully
#Click on Computer tab
#Click on Desktops link
#Verify "Desktops" text
#3. verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
#Click on Computer tab
#Click on Desktops link
#Click on product name "Build your own computer"
#Select processor "processor"
#Select RAM "ram"
#Select HDD "hdd"
#Select OS "os"
#Select Software "software"
#Click on "ADD TO CART" Button
#Verify message "The product has been added to your shopping cart"
#DATA SET
#| processor | ram | hdd | os | software |
#| 2.2 GHz Intel Pentium Dual-Core E2200 | 2 GB | 320 GB | Vista Home [+$50.00] |
#Microsoft Office [+$50.00] |
#| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] |
#Vista Premium [+$60.00] | Acrobat Reader [+$10.00] |
#| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB | Vista
#Home [+$50.00] | Total Commander [+$5.00] |

@ComputerPage
@author_Chetan
Feature: Computer Page

@smoke
  Scenario: verifyUserShouldNavigateToComputerPageSuccessfully
    Given I am on homepage
    When Click on Computer tab
    Then Verify "Computers" text on Computer Page
@sanity
  Scenario: verifyUserShouldNavigateToDesktopsPageSuccessfully
  Given I am on homepage
    When Click on Computer tab
    And Click on Desktops link
    Then Verify "Desktops" text on Desktops Page
@regression
  Scenario Outline: verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully
  Given I am on homepage
    When Click on Computer tab
    And Click on Desktops link
    And Click on product name "Build your own computer"
    And Select processor "<processor>"
    And Select RAM "<ram>"
    And Select HDD "<hdd>"
    And Select OS "<os>"
    And Select Software "<software>"
    And Click on ADD TO CART Button
    Then Verify message "The product has been added to your shopping cart"

    Examples:
      | processor                               | ram         | hdd    | os                           | software                     |
      | 2.2 GHz Intel Pentium Dual-Core E2200   | 2 GB        | 320 GB | Vista Home [+$50.00]         | Microsoft Office [+$50.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200   | 4GB [+$20.00]| 400 GB | Vista Premium [+$60.00]      | Acrobat Reader [+$10.00]     |
      | 2.5 GHz Intel Pentium Dual-Core E2200   | 8GB [+$60.00]| 320 GB | Vista Home [+$50.00]         | Total Commander [+$5.00]     |