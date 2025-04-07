package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {


    private By confirmationMessage = By.cssSelector(".complete-header"); // Verifica el selector correcto

    // Metodo para obtener el mensaje de confirmación
    public String getConfirmationMessage() {

        return $(confirmationMessage).getText();
    }
}
