package com.example.pages;


import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;

public class CheckoutPage extends PageObject {

    private By firstNameField = By.xpath("//*[@id='first-name']");
    private By lastNameField = By.xpath("//*[@id='last-name']");
    private By postalCodeField = By.xpath("//*[@id='postal-code']");
    private By continueButton = By.xpath("//*[@id='continue']");
    private By finishButton = By.xpath("//*[@id='finish']");

    public void fillCheckoutForm(String firstName, String lastName, String postalCode) throws InterruptedException {
        Thread.sleep(2000);
        $(firstNameField).sendKeys(firstName);
        $(lastNameField).sendKeys(lastName);
        $(postalCodeField).sendKeys(postalCode);
        $(continueButton).click();
/*        firstNameField.sendKeys(firstName);
        lastNameField.sendKeys(lastName);
        postalCodeField.sendKeys(postalCode);
        continueButton.click();*/
    }

    public void confirmOrder() {
        $(finishButton).click();
    }
}

