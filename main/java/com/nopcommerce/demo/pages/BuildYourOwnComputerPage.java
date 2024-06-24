package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Build your own computer Text, Processor Drop Down, Ram
 * drop down,
 * HDD radios, os radio, software check boxes, Add To Card button, "The product has been
 * added to your shopping cart"
 * message locators and it's actions
 */

public class BuildYourOwnComputerPage extends Utility {
    private static final Logger log = Logger.getLogger(BuildYourOwnComputerPage.class);
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Build your own computer']")
    WebElement buildYourOwnComputerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processorDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement ramDropdown;

    @CacheLookup
    @FindBy(id = "product_attribute_3_6")
    WebElement hddRadio320GB;

    @CacheLookup
    @FindBy(id = "product_attribute_3_7")
    WebElement hddRadio400GB;

    @CacheLookup
    @FindBy(id = "product_attribute_4_8")
    WebElement osRadioVistaHome;

    @CacheLookup
    @FindBy(id = "product_attribute_4_9")
    WebElement osRadioVistaPremium;

    @CacheLookup
    @FindBy(id = "product_attribute_5_10")
    WebElement softwareOffice;

    @CacheLookup
    @FindBy(id = "product_attribute_5_11")
    WebElement softwareReader;

    @CacheLookup
    @FindBy(id = "product_attribute_5_12")
    WebElement softwareCommander;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content' and text()='The product has been added to your shopping cart']")
    WebElement productAddedMessage;


    public String getBuildYourOwnComputerText() {
        log.info("buildYourOwnComputerText"+buildYourOwnComputerText.toString());
        return buildYourOwnComputerText.getText();
    }

    public void selectProcessor(String processor) {
        processorDropdown.sendKeys(processor);
    }

    public void selectRAM(String ram) {
        ramDropdown.sendKeys(ram);
    }

    public void selectHDD(String hdd) {
        if (hdd.equals("320 GB")) {
            hddRadio320GB.click();
        } else if (hdd.equals("400 GB")) {
            hddRadio400GB.click();
        }
    }

    public void selectOS(String os) {
        if (os.contains("Home")) {
            osRadioVistaHome.click();
        } else if (os.contains("Premium")) {
            osRadioVistaPremium.click();
        }
    }

    public void selectSoftware(String software) {
        if (software.contains("Office")) {
            softwareOffice.click();
        } else if (software.contains("Reader")) {
            softwareReader.click();
        } else if (software.contains("Commander")) {
            softwareCommander.click();
        }
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public String getProductAddedMessage() {
        return productAddedMessage.getText();
    }

    }