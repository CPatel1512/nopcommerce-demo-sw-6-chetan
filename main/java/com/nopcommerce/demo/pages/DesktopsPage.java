package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * Desktops text, Sortby, Display, selectProductList Locators and it's actions
 */

public class DesktopsPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopsPage.class.getName());
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement buildYourOwnComputer;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Desktops']")
    WebElement desktopsText;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sortBy;

    @CacheLookup
    @FindBy(id = "products-pagesize")
    WebElement display;

    @CacheLookup
    @FindBy(css = ".product-item")
    WebElement selectProductList;



    public String getDesktopsText() {
        return desktopsText.getText();
    }

    public void selectSortBy(String value) {
        sortBy.sendKeys(value);
    }

    public void selectDisplay(String value) {
        display.sendKeys(value);
    }

    public void selectProduct() {
        selectProductList.click();
    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(buildYourOwnComputer);
    }
}
