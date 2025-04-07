package com.example.steps;


import com.example.pages.LoginPage;
import com.example.pages.ProductsPage;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;

import static org.junit.Assert.*;

public class LoginSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProductsPage productsPage;

    @Dado("que el usuario visita la pagina de inicio de SauceDemo")
    public void abrirPaginaDeLogin() {
        loginPage.abrirPagina();
    }

    @Cuando("ingresa las credenciales {string} y {string} para iniciar sesión")
    public void ingresarCredenciales(String user, String pass) {
        loginPage.login(user, pass);
    }

    @Entonces("debería ser redirigido a la página de productos")
    public void validarRedireccion() {
        assertTrue(productsPage.isAt());
    }

    @Entonces("valida que el mensaje de error contiene {string}")
    public void validarMensajeDeError(String error) {
        assertTrue(loginPage.getErrorMessage().contains(error));
    }
}