package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.*;


public class LoginPage extends PageObject {

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("h3[data-test='error']");

    // Usamos open() para abrir la URL base configurada en serenity.config
    public void abrirPagina() {
        open();
    }

    // Metodo para realizar login con usuario y contraseña
    public void login(String user, String pass) {
        $(usernameField).sendKeys(user);
        $(passwordField).sendKeys(pass);
        $(loginButton).click();



    }

    // Metodo para obtener el mensaje de error
    public String getErrorMessage() {
        return $(errorMessage).getText();
    }
}