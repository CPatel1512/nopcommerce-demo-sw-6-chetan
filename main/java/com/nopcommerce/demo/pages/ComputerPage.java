package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 *Computers text, DesktopsLink, NotebooksLink, SoftwareLink Locators
 * and create appropriate methods for it.
 */

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[1]/a[1]")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//h1[text()='Computers']")
    WebElement computersText;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Notebooks")
    WebElement notebooksLink;

    @CacheLookup
    @FindBy(linkText = "Software")
    WebElement softwareLink;

    public void clickOnComputerTab(){
        clickOnElement(computerTab);
    }

    public String getComputersText() {
        return computersText.getText();
    }

    public void clickDesktopsLink() {
        desktopsLink.click();
    }

    public void clickNotebooksLink() {
        notebooksLink.click();
    }

    public void clickSoftwareLink() {
        softwareLink.click();
    }
}
