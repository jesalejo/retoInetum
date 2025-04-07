package com.example.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPage extends PageObject {

    // Metodo para ir al carrito
    private By cartIcon = By.xpath("(//a[@class='shopping_cart_link'])[1]");  // Ícono del carrito

    public void goToCart() {
        $(cartIcon).click();
        //$(checkoutButton).waitUntilVisible();
    }

    // Localizador para el botón de checkout
    private By checkoutButton = By.xpath("//*[@id='checkout']");

    // Metodo para proceder al checkout
    public void proceedToCheckout() throws InterruptedException {
        // Hacemos clic en el botón de checkout
        Thread.sleep(2000);
        $(checkoutButton).click();
    }
}