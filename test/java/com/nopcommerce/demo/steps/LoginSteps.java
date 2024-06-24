package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {

    @Given("I am on homepage")
    public void iAmOnHomepage() {


    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();

    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {

        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage,expectedMessage,"Login page not displayed");
    }

    @When("I enter email {string}")
    public void iEnterEmail(String email) {

    new LoginPage().enterEmailId(email);
    }

    @When("I enter password {string}")
    public void iEnterPassword(String password) {
    new LoginPage().enterPassword(password);
    }

    @When("I click on login button")
    public void iClickOnLoginButton() {
       new LoginPage().clickOnLoginButton();

    }

    @Then("I should login successfully")
    public void i_should_login_successfully() {

    }

    @And("I should see the error message {string}")
    public void i_should_see_the_error_message(String errorMesage) {
        Assert.assertEquals(new LoginPage().getErrorMessage(),errorMesage,"errorMessage not displayed");

    }

    @When("Click on login link")
    public void clickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @And("Enter EmailId {string}")
    public void enterEmailId(String email) {
        new LoginPage().enterEmailId(email);

    }

    @And("Enter Password {string}")
    public void enterPassword(String password) {
        new LoginPage().enterPassword(password);
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @And("Click on LogOut Link")
    public void clickOnLogOutLink() {
        new LoginPage().clickOnLogOutTab();
    }

    @Then("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay(String logInText) {
        Assert.assertEquals(new LoginPage().getLoginLinkText(),logInText,"login text not displayed");
    }
}
