package com.example.steps;

import com.example.pages.CheckoutPage;
import com.example.pages.ConfirmationPage;
import com.example.pages.LoginPage;
import io.cucumber.java.es.Y;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.annotations.Steps;

import static org.junit.Assert.assertTrue;

public class CheckoutSteps {
    @Steps
    CheckoutPage checkoutPage;


    private ConfirmationPage confirmationPage;


    @Y("completa el formulario con nombre {string}, apellido {string} y código postal {string}")
    public void completarFormularioDeCompra(String nombre, String apellido, String zip) throws InterruptedException {
        checkoutPage.fillCheckoutForm(nombre, apellido, zip);
    }

    @Y("confirma la orden")
    public void confirmarOrden() {
        checkoutPage.confirmOrder(); // Realiza la confirmación de la orden
    }

    @Entonces("debería ver el mensaje de confirmación {string}")
    public void verificarMensajeDeConfirmacion(String mensaje) {
        assertTrue("El mensaje de confirmación no es correcto", confirmationPage.getConfirmationMessage().contains(mensaje));
    }
}