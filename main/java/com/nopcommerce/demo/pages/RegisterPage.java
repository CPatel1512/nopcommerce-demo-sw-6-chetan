package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Register Text, male female radio, Firstname, lastname, Date of Birth drop
 * down, email,
 * Password, Confirm Password, Register Button, "First name is required.","Last name is
 * required.",
 * "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;

    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemaleRadio;

    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dobDay;

    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement dobMonth;

    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement dobYear;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerButton;

    @CacheLookup
    @FindBy(xpath = "//span[text()='First name is required.']")
    WebElement firstNameRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Last name is required.']")
    WebElement lastNameRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Email is required.']")
    WebElement emailRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Password is required.']")
    WebElement passwordRequiredError;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Password is required.']")
    WebElement confirmPasswordRequiredError;

    @CacheLookup
    @FindBy(xpath = "//div[text()='Your registration completed']")
    WebElement registrationCompletedMessage;

    @CacheLookup
    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;


    public void clickOnRegisterLink(){
        clickOnElement(registerLink);
    }

    public String getRegisterText() {
        return registerText.getText();
    }

    public void selectGenderFemale() {
        genderFemaleRadio.click();
    }

    public void enterFirstName(String firstName) {
        firstNameField.sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        lastNameField.sendKeys(lastName);
    }

    public void selectDOB(String day, String month, String year) {
        dobDay.sendKeys(day);
        dobMonth.sendKeys(month);
        dobYear.sendKeys(year);
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public String getFirstNameRequiredError() {
        return firstNameRequiredError.getText();
    }

    public String getLastNameRequiredError() {
        return lastNameRequiredError.getText();
    }

    public String getEmailRequiredError() {
        return emailRequiredError.getText();
    }

    public String getPasswordRequiredError() {
        return passwordRequiredError.getText();
    }

    public String getConfirmPasswordRequiredError() {
        return confirmPasswordRequiredError.getText();
    }

    public String getRegistrationCompletedMessage() {
        return registrationCompletedMessage.getText();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
