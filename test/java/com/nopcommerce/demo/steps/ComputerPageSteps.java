package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("Click on Computer tab")
    public void clickOnComputerTab() {
        new ComputerPage().clickOnComputerTab();
    }

    @Then("Verify {string} text on Computer Page")
    public void verifyTextOnComputerPage(String computers) {
        Assert.assertEquals(new ComputerPage().getComputersText(),"Computers", "Error message not displayed");
    }

    @And("Click on Desktops link")
    public void clickOnDesktopsLink() {
        new ComputerPage().clickDesktopsLink();
    }

    @Then("Verify {string} text on Desktops Page")
    public void verifyTextOnDesktopsPage(String desktops) {
        Assert.assertEquals(new DesktopsPage().getDesktopsText(),"Dedsktops","Text not displayed");
    }

    @And("Click on product name {string}")
    public void clickOnProductName() {
        new DesktopsPage().selectSortBy("A To Z");
        new DesktopsPage().selectDisplay("Build Your Own Computer");
        new DesktopsPage().clickOnBuildYourOwnComputer();

    }

    @And("Select processor {string}")
    public void selectProcessor() {
        new BuildYourOwnComputerPage().selectProcessor("Processor");

    }

    @And("Select RAM {string}")
    public void selectRAM() {
        new BuildYourOwnComputerPage().selectRAM("Ram");
    }

    @And("Select HDD {string}")
    public void selectHDD() {
        new BuildYourOwnComputerPage().selectHDD("HDD");
    }

    @And("Select OS {string}")
    public void selectOS() {
        new BuildYourOwnComputerPage().selectOS("OS");
    }

    @And("Select Software {string}")
    public void selectSoftware() {
        new BuildYourOwnComputerPage().selectSoftware("Software");
    }

    @And("Click on ADD TO CART Button")
    public void clickOnADDTOCARTButton() {
        new BuildYourOwnComputerPage().clickAddToCartButton();
    }
    @Then("Verify {string} text on Build Your Computer Page")
    public void ishouldSeeAddedToCartSuccessfullyText(String addedToCart){
        Assert.assertEquals(new BuildYourOwnComputerPage().getProductAddedMessage(),"addedTOCart","Text not Displayed");

    }
}
