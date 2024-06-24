package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterSteps {

    @When("Click on Register Link")
    public void clickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Verify {string} text")
    public void verifyText(String text) {
        Assert.assertEquals(new RegisterPage().getRegisterText(), text, "text not displayed");
    }

    @When("Click on {string} button")
    public void clickOnButton(String button) {
        if (button.equalsIgnoreCase("REGISTER")) {
            new RegisterPage().clickRegisterButton();
        } else if (button.equalsIgnoreCase("CONTINUE")) {
            new RegisterPage().clickContinueButton();
        }
    }

    @Then("Verify the error message {string}")
    public void verifyTheErrorMessage(String errorMessage) {
        switch (errorMessage) {
            case "First name is required.":
                Assert.assertEquals(errorMessage, new RegisterPage().getFirstNameRequiredError());
                break;
            case "Last name is required.":
                Assert.assertEquals(errorMessage, new RegisterPage().getLastNameRequiredError());
                break;
            case "Email is required.":
                Assert.assertEquals(errorMessage, new RegisterPage().getEmailRequiredError());
                break;
            case "Password is required.":
                Assert.assertEquals(errorMessage, new RegisterPage().getPasswordRequiredError());
                break;
            default:
                Assert.fail("Unknown error message: " + errorMessage);
        }
    }

    @And("Select gender {string}")
    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Female")) {
            new RegisterPage().selectGenderFemale();
        }
        // Add male selection if needed
    }

    @And("Enter firstname {string}")
    public void enterFirstname(String firstName) {
        new RegisterPage().enterFirstName(firstName);
    }

    @And("Enter lastname {string}")
    public void enterLastname(String lastName) {
        new RegisterPage().enterLastName(lastName);
    }

    @And("Select day {string}")
    public void selectDay(String day) {
        new RegisterPage().selectDOB(day, "", "");
    }

    @And("Select month {string}")
    public void selectMonth(String month) {
        new RegisterPage().selectDOB("", month, "");
    }

    @And("Select year {string}")
    public void selectYear(String year) {
        new RegisterPage().selectDOB("", "", year);
    }

    @And("Enter email {string}")
    public void enterEmail(String email) {
        new RegisterPage().enterEmail(email);
    }

    @And("Enter password {string}")
    public void enterPassword(String password) {
        new RegisterPage().enterPassword(password);
    }

    @And("Enter Confirm Password {string}")
    public void enterConfirmPassword(String confirmPassword) {
        new RegisterPage().enterConfirmPassword(confirmPassword);
    }

    @And("Verify message {string}")
    public void verifyMessage(String message) {
        Assert.assertEquals(message, new RegisterPage().getRegistrationCompletedMessage());

    }
}
